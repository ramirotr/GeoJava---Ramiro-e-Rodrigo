public class GeometriaEspacial extends Geometria {

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