package Assignment_11;

import java.util.ArrayList;
import java.util.Scanner;

class EmployeeList {
    private final ArrayList<Employee> list = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void addEmployee() {
        System.out.println("Chon loai nhan vien:");
        System.out.println("1. Nhan vien toan thoi gian");
        System.out.println("2. Nhan vien ban thoi gian");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Employee emp = null;
        switch (choice) {
            case 1 -> {
                emp = new EmployeeFullTime();
                System.out.print("Nhap he so luong: ");
                ((EmployeeFullTime) emp).setCoefficientSalary(scanner.nextDouble());
            }
            case 2 -> {
                emp = new EmployeePartTime();
                System.out.print("Nhap so ngay lam viec: ");
                ((EmployeePartTime) emp).setNumberOfWorkdays(scanner.nextInt());
            }
            default -> {
                System.out.println("Lua chon khong hop le.");
                return;
            }
        }

        scanner.nextLine();
        System.out.print("Nhap ma nhan vien: ");
        emp.setEmpID(scanner.nextLine());
        System.out.print("Nhap ten nhan vien: ");
        emp.setEmpName(scanner.nextLine());
        System.out.print("Nhap ngay sinh (dd-mm-yyyy): ");
        emp.setEmpDateOfBirth(scanner.nextLine());
        System.out.print("Nhap ngay bat dau (dd-mm-yyyy): ");
        emp.setStartDate(scanner.nextLine());

        list.add(emp);
        System.out.println("Da them nhan vien.");
    }

    public void updateEmployee() {
        System.out.print("Nhap ma nhan vien can cap nhat: ");
        String empID = scanner.nextLine();
        Employee emp = findEmployee(empID);

        if (emp != null) {
            System.out.print("Nhap ten moi: ");
            emp.setEmpName(scanner.nextLine());
            System.out.print("Nhap ngay sinh moi (dd-mm-yyyy): ");
            emp.setEmpDateOfBirth(scanner.nextLine());
            System.out.print("Nhap ngay bat dau moi (dd-mm-yyyy): ");
            emp.setStartDate(scanner.nextLine());

            switch (emp) {
                case EmployeeFullTime employeeFullTime -> {
                    System.out.print("Nhap he so luong moi: ");
                    employeeFullTime.setCoefficientSalary(scanner.nextDouble());
                }
                case EmployeePartTime employeePartTime -> {
                    System.out.print("Nhap sp ngay lam viec moi: ");
                    employeePartTime.setNumberOfWorkdays(scanner.nextInt());
                }
                default -> {
                }
            }

            System.out.println("Cap nhat thanh cong cho nhan vien.");
        } else {
            System.out.println("Khong tim thay nhan vien voi ma nay.");
        }
    }

    public void deleteEmployee() {
        System.out.print("Nhap ma nhan vien can xoa: ");
        String empID = scanner.nextLine();
        list.removeIf(emp -> emp.getEmpID().equals(empID));
        System.out.println("Da xoa nhan vien co ma: " + empID);
    }

    public void findEmployee() {
        System.out.print("Nhap ma nhan vien can tim: ");
        String empID = scanner.nextLine();
        Employee emp = findEmployee(empID);

        if (emp != null) {
            System.out.println("Thong tin nhan vien:");
            System.out.println("Ma nhan vien: " + emp.getEmpID());
            System.out.println("Ten nhan vien: " + emp.getEmpName());
            System.out.println("Ngay sinh: " + emp.getEmpDateOfBirth());
            System.out.println("Ngay bat dau: " + emp.getStartDate());
            System.out.println("Luong: " + emp.CalculateSalary());
            System.out.println("Phu cap: " + emp.CalculateAllowance());
        } else {
            System.out.println("Khong tim thay nhan vien.");
        }
    }

    private Employee findEmployee(String empID) {
        for (Employee emp : list) {
            if (emp.getEmpID().equals(empID)) {
                return emp;
            }
        }
        return null;
    }
}
