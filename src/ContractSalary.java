public class ContractSalary implements ISalaryStrategy {
    public double calculate(double baseSalary) {
        return baseSalary * 1.1;
    }
}