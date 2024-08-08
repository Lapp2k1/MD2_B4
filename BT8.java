import java.util.Scanner;

class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private String gen;
    private double rate;
    private double salary;

    // Constructor không tham số
    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Constructor có tham số
    public Employee(int employeeId, String employeeName, int age, String gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        calSalary();
    }

    // Phương thức nhập thông tin
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        employeeId = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống
        System.out.print("Nhập tên nhân viên: ");
        employeeName = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống
        System.out.print("Nhập giới tính: ");
        gen = scanner.nextLine();
        System.out.print("Nhập hệ số lương: ");
        rate = scanner.nextDouble();
        calSalary();
    }

    // Phương thức tính lương
    private void calSalary() {
        salary = rate * 1300000;
    }

    // Phương thức hiển thị thông tin
    public void displayData() {
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gen);
        System.out.println("Hệ số lương: " + rate);
        System.out.println("Lương: " + salary);
    }
}

public class BT8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo 5 đối tượng nhân viên
        Employee[] employees = new Employee[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1));
            employees[i] = new Employee();
            employees[i].inputData();
        }

        // Hiển thị thông tin tất cả các nhân viên
        System.out.println("\nThông tin tất cả các nhân viên:");
        for (Employee emp : employees) {
            emp.displayData();
            System.out.println();
        }
    }
}
