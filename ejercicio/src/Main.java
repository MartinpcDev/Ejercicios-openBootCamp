class Coche{
   private int numeroPuertas;

    public void aumertarnumeroPuertas(){
        this.numeroPuertas++;
    }

    public int obtenernumeroPuertas(){
        return this.numeroPuertas;
    }

}

public class Main {
    public static void main(String[] args) {
        int operacion;
         operacion = suma(5,6,7);
        System.out.println(operacion);

        Coche miCoche = new Coche();
        miCoche.aumertarnumeroPuertas();

        System.out.println("el numero de puertas del coche es: " + miCoche.obtenernumeroPuertas());


    }

    public static int suma ( int a , int b , int c ){
        return a + b + c;
    }


}