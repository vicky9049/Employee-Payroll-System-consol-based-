public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new SalariedEmployee("Alice", 101, 50000);
        employees[1] = new HourlyEmployee("Bob", 102, 200, 160);
        employees[2] = new ContractEmployee("Charlie", 103, 60000);

        for (Employee emp : employees) {
            System.out.println("Employee: " + emp.getName() +
                               ", ID: " + emp.getId() +
                               ", Salary: " + emp.calculateSalary());
        }
    }
}
