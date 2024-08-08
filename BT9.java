
import java.util.Scanner;

class Student2 {
    private int studentId;
    private String studentName;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;

    // Constructor không tham số
    public Student2() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Constructor có tham số
    public Student2(int studentId, String studentName, int age, String gender, String address, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã học sinh: ");
        studentId = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống
        System.out.print("Nhập tên học sinh: ");
        studentName = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống
        System.out.print("Nhập giới tính: ");
        gender = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        phoneNumber = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Mã học sinh: " + studentId);
        System.out.println("Tên học sinh: " + studentName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phoneNumber);
    }
}

public class BT9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo danh sách Student
        Student2[] students = new Student2[100];
        int studentCount = 0;

        int choice;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Hiển thị danh sách học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nDanh sách học sinh:");
                    for (int i = 0; i < studentCount; i++) {
                        students[i].displayData();
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("\nThêm mới học sinh:");
                    students[studentCount] = new Student2();
                    students[studentCount].inputData();
                    studentCount++;
                    break;
                case 3:
                    System.out.print("Nhập mã học sinh cần sửa thông tin: ");
                    int searchId = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].getStudentId() == searchId) {
                            students[i].inputData(); // Cập nhật thông tin
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy học sinh với mã " + searchId);
                    }
                    break;

                case 4:
                    System.out.print("Nhập mã học sinh cần xoá: ");
                    int deleteId = scanner.nextInt();

                    found = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].getStudentId() == deleteId) {
                            // Xoá học sinh khỏi danh sách
                            for (int j = i; j < studentCount - 1; j++) {
                                students[j] = students[j + 1];
                            }
                            studentCount--;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy học sinh với mã " + deleteId);
                    }
                    break;
                case 5:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 5);
    }
}
