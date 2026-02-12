public class InternSalary implements ISalaryStrategy {
    public double calculate(double baseSalary) {
        return baseSalary * 0.8;
    }
}