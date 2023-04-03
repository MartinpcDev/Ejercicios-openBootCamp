public class Coche {

    String marca;
    String modelo;
    String placa;
    int caballosFuerza;

    public Coche(){

    }

    public Coche(String marca, String modelo, String placa, int caballosFuerza) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.caballosFuerza = caballosFuerza;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", caballosFuerza=" + caballosFuerza +
                '}';
    }
}
