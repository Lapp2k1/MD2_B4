// Lớp Circle2
 class Circle2 {
    private double radius = 1.0; // Giá trị mặc định cho radius
    private String color = "red"; // Giá trị mặc định cho color

    // Hàm tạo không tham số
    public Circle2() {
    }

    // Hàm tạo với tham số radius
    public Circle2(double radius) {
        this.radius = radius;
    }

    // Phương thức public để lấy giá trị của radius
    public double getRadius() {
        return radius;
    }

    // Phương thức public để tính diện tích hình tròn
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Lớp TestCircle2
public class BT7 {
    public static void main(String[] args) {
        // Tạo đối tượng Circle
        Circle2 circle = new Circle2(5.0);

        // Hiển thị thông tin
        System.out.println("Bán kính: " + circle.getRadius());
        System.out.println("Diện tích: " + circle.getArea());
    }
}

