package Assignment_11;

class EmployeeFullTime extends Employee {

    private double coefficientSalary;

    public double getCoefficientSalary() {
        return coefficientSalary;
    }

    public void setCoefficientSalary(double coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }

    @Override
    public double CalculateSalary() {
        return BASIC_SALARY * coefficientSalary + CalculateAllowance();
    }

    @Override
    public double CalculateAllowance() {
        int seniority = CalculateSeniority();
        if (seniority >= 10) {
            return 1000000;
        } else if (seniority >= 5) {
            return 500000;
        }
        return 0;
    }
}
