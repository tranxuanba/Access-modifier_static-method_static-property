package demo;

public class Dem {
    int count = 0;

    Dem() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {

        Dem c1 = new Dem();
        Dem c2 = new Dem();
        Dem c3 = new Dem();

    }
}
