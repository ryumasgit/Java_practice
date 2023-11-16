public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(15);
    }
    public static void fizzBuzz(Integer value) {
        if ( value % 15 == 0 ) System.out.print("FizzBuzz");
        else if ( value % 3 == 0 ) System.out.print("Fizz");
        else if ( value % 5 == 0 ) System.out.print("Buzz");
        else System.out.print(value);
    }
}