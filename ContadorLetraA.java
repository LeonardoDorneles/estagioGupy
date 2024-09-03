import java.util.Scanner;

public class ContadorLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir a string a ser verificada
        System.out.print("Informe uma string: ");
        String inputString = scanner.nextLine();

        // Verificar a existência da letra 'a' e contar as ocorrências
        int count = countOccurrencesOfA(inputString);

        // Exibir o resultado
        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }

        scanner.close();
    }

    // Método para contar as ocorrências da letra 'a' (maiúscula ou minúscula) em uma string
    public static int countOccurrencesOfA(String str) {
        int count = 0;

        // Converter a string para caracteres individuais e verificar cada um
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == 'a' || currentChar == 'A') {
                count++;
            }
        }

        return count;
    }
}