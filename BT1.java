import java.util.Scanner;

class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius , String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double chuVi() {
        return 2 * Math.PI * radius;
    }


    public double dienTich() {
        return Math.PI * radius * radius;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        radius = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Nhập màu sắc: ");
        color = scanner.nextLine();
    }


    public void displayData() {
        System.out.println("Thông tin hình tròn:");
        System.out.println("Bán kính: " + radius);
        System.out.println("Màu sắc: " + color);
        System.out.printf("Chu vi: " + "%.3f",chuVi());
        System.out.printf("Diện tích: " + "%.3f",dienTich());
    }
}

public class BT1 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(); // Default constructor
        Circle circle2 = new Circle(3.5, "yellow");

        circle1.inputData();
        circle1.displayData();
        System.out.println();
        circle2.displayData();
    }
}