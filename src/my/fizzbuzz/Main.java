package my.fizzbuzz;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fb = new ConsoleBasedFizzBuzz();
        fb.print(0, 100);
    }
}
