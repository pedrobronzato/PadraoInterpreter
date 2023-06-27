public class Produto {

    private double distanciaEnvio;
    private double peso;
    public double getDistanciaEnvio() {
        return distanciaEnvio;
    }

    public void setDistanciaEnvio(double distanciaEnvio) {
        this.distanciaEnvio = distanciaEnvio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularTransporte() {
        return Transportadora.calcularTransporte(this.distanciaEnvio, this.peso);
    }


}
