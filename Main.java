public class Main {

    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int val1 = 2;
        int val2 = 3;

        System.out.println(calculator.add(val1, val2));
        System.out.println(calculator.subtract(10, 3));
        System.out.println(calculator.multiply(5, 5));
    }
}
