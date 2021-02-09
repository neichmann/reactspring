package com.example.SpringReact.payroll;

public class EmployeeRepository {
    public interface EmployeeRepository extends CrudRepository<Employee, Long> { (1)

    }
}
