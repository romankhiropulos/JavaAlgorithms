package Algorithms.factorial;

public class Factorial {

    static int slowFactorial(int member) {
        int result = 1;
        for (int i = 1; i <= member; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(slowFactorial(1));
        System.out.println(slowFactorial(2));
        System.out.println(slowFactorial(3));
        System.out.println(slowFactorial(4));
        System.out.println(slowFactorial(5));
    }
}
