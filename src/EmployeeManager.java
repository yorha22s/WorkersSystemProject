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

    public void updateEmployee(int employeeID, Employee newEmployee){
        if(employees.containsKey(employeeID))
        {
            employees.put(employeeID,newEmployee);
        }
        else
            System.out.println("Pracownik o takim ID nie istnieje");
    }

    public Employee searchEmployeeByID(int employeeID) {
        if(employees.containsKey(employeeID)){
            return employees.get(employeeID);
        }
        else
            System.out.println("Nie znaleziono pracownika o danym ID");
        return null;
    }
}
