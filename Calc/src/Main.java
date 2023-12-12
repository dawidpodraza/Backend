public class Main {
    public static void main(String[] args) {
        double x = 10;
        double y = 15;

        Calculator calculator = new Calculator();
        double result = calculator.multiply(x,y);
        System.out.println(result);
    }
}