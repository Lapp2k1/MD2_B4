
 class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

     public String getName() {
         return name;
     }

     public String getClasses() {
         return classes;
     }

     public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String toString() {
        return "Student [name=" + name + ", classes=" + classes + "]";
    }
}

public class BT5 {
    public static void main(String[] args) {
        Student student = new Student();
                student.setName("Alice");
        student.setClasses("C03");
                System.out.println(student);
    }
}


