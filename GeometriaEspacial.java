import java.util.Scanner;

public class GeometriaEspacial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("-=$=- GEOMETRIA ESPACIAL -=$=-");
            System.out.println("1 - Cubo");
            System.out.println("2 - Esfera");
            System.out.println("3 - Cilindro");
            System.out.println("4 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a aresta do cubo (cm): ");
                    double aresta = ler.nextDouble();
                    System.out.println("Volume do cubo: " + calculaVolumeCubo(aresta) + " cm³");
                    System.out.println("Área do cubo: " + calculaAreaCubo(aresta) + " cm²");
                     Main.main(null);
                    break;
                case 2:
                    System.out.print("Digite o raio da esfera (cm): ");
                    double raioEsfera = ler.nextDouble();
                    System.out.println("Volume da esfera: " + calculaVolumeEsfera(raioEsfera) + " cm³");
                    System.out.println("Área da esfera: " + calculaAreaEsfera(raioEsfera) + " cm²");
                     Main.main(null);
                    break;
                case 3:
                    System.out.print("Digite o raio do cilindro (cm): ");
                    double raioCilindro = ler.nextDouble();
                    System.out.print("Digite a altura do cilindro (cm): ");
                    double alturaCilindro = ler.nextDouble();
                    System.out.println("Volume do cilindro: " + calculaVolumeCilindro(raioCilindro, alturaCilindro) + " cm³");
                    System.out.println("Área do cilindro: " + calculaAreaCilindro(raioCilindro, alturaCilindro) + " cm²");
                     Main.main(null);
                    break;
                case 4:
                      Main.main(null);
                    break;
                default:
                    System.out.println("Erro!");
                    break;
            }
            System.out.println();
        } while (opcao != 4);
    }

    // CÁLCULOS DE ÁREA E VOLUME

    public static double calculaVolumeCubo(double aresta) {
        return Math.pow(aresta, 3);
    }

    public static double calculaAreaCubo(double aresta) {
        return 6 * Math.pow(aresta, 2);
    }

    public static double calculaVolumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    public static double calculaAreaEsfera(double raio) {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    public static double calculaVolumeCilindro(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public static double calculaAreaCilindro(double raio, double altura) {
        return 2 * Math.PI * raio * (raio + altura);
    }
}