package demo;

    public class Student {
        int age;
        String name;
        static String college = "dai hoc mo - dia chat";
        static String change() {
            college = "codegym";
            return college;
        }

        Student(int age, String name) {
            this.age = age;
            this.name = name;
        }


        public static void main(String args[]) {
            Student s1 = new Student(18, "Thông");
            Student s2 = new Student(19, "Minh");
            System.out.println(s1.age + s1.name + Student.change());
            System.out.println();
        }
    }

