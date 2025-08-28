import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        GeometriaPlana geometria_plana = new GeometriaPlana();
        GeometriaEspacial geometria_espacial = new GeometriaEspacial();
        int opcaoPrincipal;
        int opcaoForma;

        do { 
            System.out.println("-=$=- MENU PRINCIPAL -=$=-");
            System.out.println("1 - Geometria Plana");
            System.out.println("2 - Geometria Espacial");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcaoPrincipal = ler.nextInt();

            switch (opcaoPrincipal) {
                case 1:
                    System.out.println("-=$=- GEOMETRIA PLANA -=$=-");
                    System.out.println("1 - Círculo");
                    System.out.println("2 - Retângulo");
                    System.out.println("3 - Triângulo");
                    System.out.println("4 - Polígono");
                    System.out.println("5 - Voltar");
                    System.out.print("Escolha uma das opções acima: ");
                    opcaoForma = ler.nextInt();

                    if (opcaoForma == 1) {
                        System.out.print("Digite o raio do círculo (cm): ");
                        double raio = ler.nextDouble();
                        System.out.println("Área Do Círculo abaixo:");
                        System.out.println(Math.round(+ geometria_plana.areaCirculo(raio)));
                        System.out.println(Math.round( + geometria_plana.perimetroCirculo(raio)));
                    } else if (opcaoForma == 2) { 
                        System.out.println("Digite a base do retângulo (cm): ");
                        double base = ler.nextDouble();
                        System.out.print("Digite a altura do retângulo (cm): ");
                        double altura = ler.nextDouble();
                        System.out.println("Área: " + geometria_plana.areaRetangulo(base, altura));
                        System.out.println("Perímetro: " + geometria_plana.perimetroRetangulo(base, altura));
                    } else if (opcaoForma == 3) {
                        System.out.print("Digite a base do triângulo (cm): ");
                        double base = ler.nextDouble();
                        System.out.print("Digite a altura do triângulo (cm): ");
                        double altura = ler.nextDouble();
                        System.out.println("Área: " + geometria_plana.areaTriangulo(base, altura));
                        System.out.print("Digite o lado 1 (cm): ");
                        double lado1 = ler.nextDouble();
                        System.out.print("Digite o lado 2 (cm): ");
                        double lado2 = ler.nextDouble();
                        System.out.print("Digite o lado 3 (cm): ");
                        double lado3 = ler.nextDouble();
                        System.out.println("Perímetro: " + geometria_plana.perimetroTriangulo(lado1, lado2, lado3));
                    } else if (opcaoForma == 4) {
                        System.out.print("Digite o número de lados do polígono regular: ");
                        int numLados = ler.nextInt();
                        System.out.print("Digite o tamanho do lado (cm): ");
                        double tamanhoLado = ler.nextDouble();
                        System.out.print("Digite a medida do apótema (cm): ");
                        double apotema = ler.nextDouble();
                        double perimetro = geometria_plana.perimetroPoligono(numLados, tamanhoLado);
                        System.out.println("Perímetro: " + perimetro);
                        System.out.println("Área: " + geometria_plana.areaPoligono(apotema));
                    }
                    break;

                case 2:
                    System.out.println("-=$=- GEOMETRIA ESPACIAL -=$=-");
                    System.out.println("1 - Cubo");
                    System.out.println("2 - Esfera");
                    System.out.println("3 - Cilindro");
                    System.out.println("4 - Voltar");
                    System.out.print("Escolha uma opção: ");
                    opcaoForma = ler.nextInt();

                    if (opcaoForma == 1) {
                        System.out.print("Digite a aresta do cubo (cm): ");
                        double aresta = ler.nextDouble();
                        System.out.println("Volume: " + geometria_espacial.calculaVolumeCubo(aresta));
                        System.out.println("Área: " + geometria_espacial.calculaAreaCubo(aresta));
                    } else if (opcaoForma == 2) {
                        System.out.print("Digite o raio da esfera (cm): ");
                        double raioEsfera = ler.nextDouble();
                        System.out.println("Volume: " + geometria_espacial.calculaVolumeEsfera(raioEsfera));
                        System.out.println("Área: " + geometria_espacial.calculaAreaEsfera(raioEsfera));
                    } else if (opcaoForma == 3) {
                        System.out.print("Digite o raio do cilindro (cm): ");
                        double raioCilindro = ler.nextDouble();
                        System.out.print("Digite a altura do cilindro (cm): ");
                        double alturaCilindro = ler.nextDouble();
                        System.out.println("Volume: " + geometria_espacial.calculaVolumeCilindro(raioCilindro, alturaCilindro));
                        System.out.println("Área: " + geometria_espacial.calculaAreaCilindro(raioCilindro, alturaCilindro));
                    }
                    break;
            }
            System.out.println();
        } while (opcaoPrincipal != 3);

        ler.close();
    }
}