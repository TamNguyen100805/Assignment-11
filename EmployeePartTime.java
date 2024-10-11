package Assignment_11;

class EmployeePartTime extends Employee {

    private int numberOfWorkdays;

    public int getNumberOfWorkdays() {
        return numberOfWorkdays;
    }

    public void setNumberOfWorkdays(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }

    @Override
    public double CalculateSalary() {
        return BASIC_SALARY * numberOfWorkdays / 26 + CalculateAllowance();
    }

    @Override
    public double CalculateAllowance() {
        int seniority = CalculateSeniority();
        if (seniority >= 10) {
            return 500000;
        } else if (seniority >= 5) {
            return 300000;
        }
        return 0;
    }
}
