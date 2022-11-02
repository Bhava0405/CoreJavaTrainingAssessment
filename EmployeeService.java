package ford.Collections.Assessment;

import java.util.List;

    public interface EmployeeService {
        // CRUD
        void addEmployee(Employee employee);
        Employee getEmployeeById(Integer employeeId);
        void updateEmployee(Employee employee);
        void deleteEmployeeById(Integer employeeId);
        List<Employee> getAllEmployees();

    }

