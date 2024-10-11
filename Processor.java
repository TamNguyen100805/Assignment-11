package Assignment_11;

import java.util.Scanner;


public class Processor {
    private final EmployeeList employeeList = new EmployeeList();
    public void displayMenu() {
        int choice;

        do {
            System.out.println("\n=== Quan ly Nhan vien ===");
            System.out.println("1. Them nhan vien moi");
            System.out.println("2. Cap nhat thong tin nhan vien");
            System.out.println("3. Xoa nhan vien");
            System.out.println("4. Tim kiem nhan vien");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1 -> employeeList.addEmployee();
                case 2 -> employeeList.updateEmployee();
                case 3 -> employeeList.deleteEmployee();
                case 4 -> employeeList.findEmployee();
                case 5 -> System.out.println("Ket thuc chuong trinh!");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 5);
    }
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.displayMenu();
    }
}