public class EmployeeSalaryCalculator {
    public double calculateSalary(double baseSalary, ISalaryStrategy strategy) {
        return strategy.calculate(baseSalary);
    }
}