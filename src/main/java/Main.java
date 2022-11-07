public class Main {
    public static void main(String[] args) {
        Department department = new Department();
        department.setId("s342");
        department.setName("Sales");

        Employee employee = new Employee();
        employee.setId("e343");
        employee.setDepartment(department);
        employee.setLastName("Bond");

        EmployeeMapper mapper = new EmployeeMapperImpl();
        EmployeeDto employeeDto = mapper.entityDto(employee);

        System.out.println(employeeDto);
    }
}
