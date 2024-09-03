import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir o número a ser verificado
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int number = scanner.nextInt();

        // Verificar se o número pertence à sequência de Fibonacci
        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int n) {
        if (n < 0) {
            return false;
        }

        // Dois primeiros números da sequência de Fibonacci
        int a = 0, b = 1;

        // Verificar se o número informado é 0 ou 1
        if (n == a || n == b) {
            return true;
        }

        // Gerar a sequência até encontrar o número ou ultrapassá-lo
        int nextFib;
        while (true) {
            nextFib = a + b;
            if (nextFib == n) {
                return true;
            }
            if (nextFib > n) {
                return false;
            }
            a = b;
            b = nextFib;
        }
    }
}
