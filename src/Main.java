import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //construa um menu para os desafios que chame as classes desafio01, desafio02 e desafio05

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um desafio: ");
        System.out.println("1 - Desafio 01");
        System.out.println("2 - Desafio 02");
        System.out.println("3 - Desafio 03");
        System.out.println("4 - Desafio 04");
        System.out.println("5 - Desafio 05");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                desafio01.main(args);
                break;
            case 2:
                desafio02.main(args);
                break;
            case 3:
                desafio03.main(args);
                break;
            case 4:
                desafio04.main(args);
                break;
            case 5:
                desafio05.main(args);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}