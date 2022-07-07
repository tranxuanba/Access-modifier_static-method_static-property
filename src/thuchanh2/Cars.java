package thuchanh2;

public class Cars {
    private String name;
    private String engine;
    public static int numberOfCars;
    Cars(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
