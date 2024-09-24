package respostas;

public class Fibonacci {

    public static boolean isFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int a = 0, b = 1;
        while (b < num) {
            int aux = b;
            b = a + b;
            a = aux;
        }

        return b == num;
    } 
    
}
