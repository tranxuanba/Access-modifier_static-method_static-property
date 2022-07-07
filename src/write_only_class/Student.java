package write_only_class;

public class Student {
    private String name = "John";
    private String clas = "C04";
    Student () {

    }
    public String setName(String name) {
        return this.name = name;
    }
    public String setClas(String clas) {
        return this.clas = clas;
    }
}
