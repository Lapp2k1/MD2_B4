
class MyClass {
    private String myString;

    public MyClass() {

        myString = "";
    }

    public void setMyString(String newValue) {
        myString = newValue;
    }

    public String getMyString() {
        return myString;
    }

    public String toString() {
        return "myString=" + myString ;
    }
}

public class BT6 {
    public static void main(String[] args) {

        MyClass myObject = new MyClass();


        System.out.println("Giá trị myString ban đầu: " + myObject.getMyString());


        myObject.setMyString("Hello, world!");


        System.out.println("Giá trị myString mới: " + myObject.getMyString());
    }
}

