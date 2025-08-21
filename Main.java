import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void GeometriaPlana() {
        GeometriaPlana.main(new String[0]);
    }

    public static void GeometriaEspacial() {
        GeometriaEspacial.main(new String[0]);
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
                    GeometriaEspacial();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    default:
                    System.out.println("Erro! Tente novamente.");
                    break;
            }

            System.out.println();
        } while (opcaoPrincipal != 3);
         sc.close();
    }
    }