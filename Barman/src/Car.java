public class Car {
    private String name;
    private int year;

    public void go() {
        System.out.println("Jade sobie jade");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }
}
