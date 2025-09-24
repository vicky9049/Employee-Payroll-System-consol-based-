public class ContractEmployee extends Employee {
    private double contractAmount;

    public ContractEmployee(String name, int id, double contractAmount) {
        super(name, id);
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
}
