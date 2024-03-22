import java.util.Scanner;

public class desafio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();
        StringBuilder invertido = new StringBuilder();
        int i = texto.length() - 1;
        while (i >= 0) {
            invertido.append(texto.charAt(i));
            i--;
        }
        System.out.println(invertido.toString());
    }
}
