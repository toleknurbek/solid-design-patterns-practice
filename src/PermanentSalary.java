public class PermanentSalary implements ISalaryStrategy {
    public double calculate(double baseSalary) {
        return baseSalary * 1.2;
    }
}
