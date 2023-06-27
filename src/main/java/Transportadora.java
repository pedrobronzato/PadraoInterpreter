public class Transportadora {
    public static String formula = "distancia * peso";

    public static double calcularTransporte(double distancia, double peso) {
        String expressao;
        expressao = formula.replace("distancia", Double.toString(distancia));
        expressao = expressao.replace("peso", Double.toString(peso));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
