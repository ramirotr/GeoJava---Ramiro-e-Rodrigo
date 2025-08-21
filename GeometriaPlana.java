import java.util.Scanner;

public class GeometriaPlana {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int opcao;
        double raio;
        double baseRetangulo;
        double alturaRetangulo;
        double areaRetangulo;
        double baseTriangulo;
        double alturaTriangulo;
        double areaTriangulo;
        int numLados;
        double tamanhoLado;
        double apotema;

        System.out.println("-=$=- GEOMETRIA PLANA -=$=-");
        System.out.println("Opção 1 - Círculo");
        System.out.println("Opção 2 - Retângulo");
        System.out.println("Opção 3 - Triângulo");
        System.out.println("Opção 4 - Polígono");
        System.out.println("Opção 5 - Sair");
        System.out.println("Escolha uma das opções acima: ");
        opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o raio do círculo: ");
                double raio = ler.nextDouble();
                double areaCirculo = Math.pow(raio, 2) * Math.PI;
                double perimetroCirculo = 2 * Math.PI * raio;
                System.out.println("Área do Círculo: " + areaCirculo);
                System.out.println("Perímetro do Círculo: " + perimetroCirculo);
                break;
            case 2:
                System.out.println("Digite a base do retângulo: ");
                double baseRetangulo = ler.nextDouble();
                System.out.println("Digite a altura do retângulo: ");
                double alturaRetangulo = ler.nextDouble();
                double areaRetangulo = alturaRetangulo * baseRetangulo;
                double perimetroRetangulo = 2 * (baseRetangulo + alturaRetangulo);
                System.out.println("Área do Retângulo: " + areaRetangulo);
                System.out.println("Perímetro do Retângulo: " + perimetroRetangulo);
                break;
            case 3:
                System.out.println("Digite a base do triângulo: ");
                double baseTriangulo = ler.nextDouble();
                System.out.println("Digite a altura do triângulo: ");
                double alturaTriangulo = ler.nextDouble();
                double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                System.out.println("Área do Triângulo: " + areaTriangulo);
                System.out.print("Digite o lado 1: ");
                double l1 = ler.nextDouble();
                System.out.print("Digite o lado 2: ");
                double l2 = ler.nextDouble();
                System.out.print("Digite o lado 3: ");
                double l3 = ler.nextDouble();
                double perimetroTri = l1 + l2 + l3;
                System.out.println("Perímetro do Triângulo: " + perimetroTri);
                break;
            case 4:
                System.out.print("Digite o número de lados do polígono regular: ");
                int numLados = ler.nextInt();
                System.out.print("Digite o tamanho do lado: ");
                double tamanhoLado = ler.nextDouble();
                System.out.print("Digite a medida do apótema: ");
                double apotema = ler.nextDouble();
                double perimetroPol = numLados * tamanhoLado;
                double areaPol = (perimetroPol * apotema) / 2;
                System.out.println("Área do Polígono: " + areaPol);
                System.out.println("Perímetro do Polígono: " + perimetroPol);
                break;
            case 5:
                System.out.println("Voltando ao menu principal!");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        ler.close();
    }
}