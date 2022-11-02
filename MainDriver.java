package ford.Collections.Assessment;


public class MainDriver{
    public static void main(String[] args) {
        EmployeeServiceImpl empService = new EmployeeServiceImpl();
        empService.addEmployee(new Employee(1,"aaa",10000.0));
        empService.addEmployee(new Employee(2,"bbb",20000.0));
        empService.addEmployee(new Employee(3,"ccc",30000.0));
        empService.addEmployee(new Employee(4,"hhh",45000.0));
        System.out.println(empService.getEmployeeById(1));
        empService.updateEmployee(new Employee(3,"ggg",23000.0));
        System.out.println(empService.getEmployeeById(2));
        empService.deleteEmployeeById(4);
        System.out.println(empService.getAllEmployees());
    }
}
