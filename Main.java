import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void GeometriaPlana() {
        // Implementação da geometria plana (não fornecida no contexto)
        System.out.println("Função de Geometria Plana ainda não implementada.");
    }

    public static void GeometriaEspacial() {
        // Implementação da geometria espacial (não fornecida no contexto)
        System.out.println("Função de Geometria Espacial ainda não implementada.");
    }

    public static void main(String[] args) {
        int opcaoPrincipal;

        do {
            System.out.println("-=$=- MENU PRINCIPAL -=$=-");
            System.out.println("1 - Geometria Plana");
            System.out.println("2 - Geometria Espacial");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcaoPrincipal = sc.nextInt();

            switch (opcaoPrincipal) {
                case 1:
                    GeometriaPlana();
                    break;
                case 2:
                    GeometriaEspacial.main(null);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Erro! Tente novamente.");
                    break;
            }

            System.out.println();
        } while (opcaoPrincipal != 3);
    }
    }