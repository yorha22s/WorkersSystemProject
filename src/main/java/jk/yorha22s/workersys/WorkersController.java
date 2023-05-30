package jk.yorha22s.workersys;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
public class WorkersController {

    HashMap<Integer, Employee> employees = new HashMap<Integer, Employee>(){{
        for (int i = 1; i <= 20; i++) {
            put(i, new Employee(i+"TestImie", i+"TestNazwisko", i+"TESTER", i*10000));
        }
    }};
    EmployeeManager employeeManager = new EmployeeManager(employees);
    @GetMapping("/")
    public String index( Model model) {
        model.addAttribute("employees", employeeManager.listAllEmployees());
        return "index";

    }

    @GetMapping("/edit")
    public String editEmployee(@RequestParam(name = "id") String employeeID, Model model) {
        model.addAttribute("employee", employeeManager.searchEmployeeByID(Integer.parseInt(employeeID)));
        return "edit";
    }

    @GetMapping("/lay-off")
    public String layOffEmployee(@RequestParam(name = "id") String employeeID, Model model) {
        employees.remove(Integer.parseInt(employeeID));
        model.addAttribute("employees", employeeManager.listAllEmployees());
        return "index";
    }

    @GetMapping("/add-worker")
    public String addWorker() {
        return "add-worker";

    }
}
