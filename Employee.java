package Assignment_11;

abstract class Employee implements IEmployee {

    protected String EmpID;
    protected String EmpName;
    protected String EmpDateOfBirth;
    protected String StartDate;

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String empID) {
        EmpID = empID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpDateOfBirth() {
        return EmpDateOfBirth;
    }

    public void setEmpDateOfBirth(String empDateOfBirth) {
        EmpDateOfBirth = empDateOfBirth;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public int CalculateSeniority() {
        int currentYear = java.time.Year.now().getValue();
        int startYear = Integer.parseInt(StartDate.split("-")[2]);
        return currentYear - startYear;
    }
}
