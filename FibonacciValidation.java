import java.util.Scanner;

public class FibonacciValidation {
    private boolean fnvalid = false;
    public void fvalidation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la contraseña especial: "); //Es el un número parte de la secuencia de Fibonacci
        int fnum = scanner.nextInt();
        
        if (isFibonacci(fnum)) {
            fnvalid = true;
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contaseña incorrecta");
        }
    }
    //Por motivos de matemática pedimos a chatGPT cómo validar si un número es parte de la sucesión de Fibonacci
    public static boolean isPerfectSquare(int x) {
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    }
    
    public static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }
    public boolean ValidF() {
        return fnvalid;
    }
}
