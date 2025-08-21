import java.util.Scanner;
 
public class GeometriaPlana extends Main {
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
        System.out.println("Opção 5 - Voltar");
        System.out.println("Escolha uma das opções acima: ");
        opcao = ler.nextInt();
       
        switch (opcao) {
            case 1:
                System.out.println("Digite o raio do círculo (cm): ");
                raio = ler.nextDouble();
                double areaCirculo = Math.pow(raio, 2) * Math.PI;
                double perimetroCirculo = 2 * Math.PI * raio;
                System.out.println("Área do Círculo: " + areaCirculo + " cm²");
                System.out.println("Perímetro do Círculo: " + perimetroCirculo + " cm");
                 Main.main(null);
                    break;
            case 2:
                System.err.println("Digite a base do retângulo (cm): ");
                baseRetangulo = ler.nextDouble();
                System.out.println("Digite a altura do retângulo (cm): ");
                alturaRetangulo = ler.nextDouble();
                areaRetangulo = (alturaRetangulo * baseRetangulo);
                double perimetroRetangulo = 2 * (baseRetangulo + alturaRetangulo);
                System.out.println("Área do Retângulo: " + areaRetangulo + " cm²");
                System.out.println("Perímetro do Retângulo: " + perimetroRetangulo + " cm");
                 Main.main(null);
                    break;
            case 3:
                System.out.println("Digite a base do triângulo (cm): ");
                baseTriangulo = ler.nextDouble();
                System.out.println("Digite a altura do triângulo (cm): ");
                alturaTriangulo = ler.nextDouble();
                areaTriangulo = (baseTriangulo * Math.pow(alturaTriangulo, 2));
                System.out.println("Área do Triângulo: " + areaTriangulo + " cm²");

                System.out.print("Digite o lado 1 (cm): ");
                double l1 = ler.nextDouble();
                System.out.print("Digite o lado 2 (cm): ");
                double l2 = ler.nextDouble();
                System.out.print("Digite o lado 3 (cm): ");
                double l3 = ler.nextDouble();
                double perimetroTri = l1 + l2 + l3;
                System.out.println("Perímetro do Triângulo: " + perimetroTri + " cm");
                 Main.main(null);
                    break;
            case 4:
                System.out.print("Digite o número de lados do polígono regular: ");
                numLados = ler.nextInt();
                System.out.print("Digite o tamanho do lado (cm): ");
                tamanhoLado = ler.nextDouble();
                System.out.print("Digite a medida do apótema (cm): ");
                apotema = ler.nextDouble();
                double perimetroPol = numLados * tamanhoLado;
                double areaPol = (perimetroPol * apotema) / 2;
                System.out.println("Área do Polígono: " + areaPol + " cm²");
                System.out.println("Perímetro do Polígono: " + perimetroPol + " cm");
                 Main.main(null);
                    break;
            case 5:
                Main.main(null);
                    break;
            }
   }
}   