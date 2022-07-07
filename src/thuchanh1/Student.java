package thuchanh1;

public class Student {
    private int rollno;
    private String name;
    private static String collage = "truong dai hoc mo - dia chat";
    Student (int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void change() {
        collage = "codegym";
    }
    void display() {
        System.out.println(this.rollno + " " + this.name + " " + collage);
    }
}
