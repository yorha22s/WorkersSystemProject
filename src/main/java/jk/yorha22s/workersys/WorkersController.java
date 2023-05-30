package jk.yorha22s.workersys;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class WorkersController {

//    HashMap<Integer, Employee> employees = new HashMap<Integer, Employee>(){{
//        for (int i = 0; i < 3; i++) {
//            put(i, new Employee("Adam"+i,"Węgiel"+i, "IT Specialist"+i, i*3500 ));
//
//        }
//    }
//
//    };
//
//    EmployeeManager employeeManager = new EmployeeManager(employees);
    @GetMapping("")
    @ResponseBody
    public String listEmployees() {
        return "index";

    }
    @GetMapping("add-worker")
    @ResponseBody
    public String addWorker() {
        return "add-worker";

    }
}
