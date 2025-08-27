public class GeometriaPlana extends Geometria {

    public double areaCirculo(double raio) {
        return Math.pow(raio, 2) * Math.PI;
    }

    public double perimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    public double areaRetangulo(double altura, double base) {
        return (altura * base); 
    }

    public double perimetroRetangulo(double altura, double base) {
        return 2 * (altura + base);
    }

    public double areaTriangulo(double base, double altura) {
        return (base * Math.pow(altura, 2));
    }

    public double perimetroTriangulo(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 + lado3);
    }

    public double perimetroPoligono(double numLados, double tamanhoLado) {
        return numLados * tamanhoLado;
    }
    
    public double areaPoligono(double apotema) {
        return (PerimetroDoPoligono * apotema) / 2;    
    }
}