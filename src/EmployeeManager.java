import java.util.HashMap;

public class EmployeeManager {

    private final HashMap<Integer,Employee> employees;

    public EmployeeManager(HashMap<Integer, Employee> employees) {
        this.employees = employees;
    }

    public  void addEmployee(Employee employee){
        Integer keyEmployee = employee.getEmployeeID();
        employees.put(keyEmployee,employee);
    }

    public void removeEmployee(Employee employee){
        if(employees.containsKey(employee.getEmployeeID()))
            employees.remove(employee.getEmployeeID());
        else
            System.out.println("Pracownik o takim ID nie istnieje");
    }
}
