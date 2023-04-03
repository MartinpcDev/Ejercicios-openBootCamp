package src.principal;

/**
 *  clase principal
 */
public class Main {

    public static void main(String[] args){
        // enteros
        byte dato1 = 80;      //0 -- 255//
        short dato2 = 5000;  //-32.768 -- 32767//
        int dato3 = 280000;     //-2147483648 -- 2147483647 //
        long dato4 = 100;    // —9 223 372 036 854 775 808 -- 9 223 372 036 854 775 807 //

        //decimales
        float dato5 = 5.15f;
        double dato6 = 22.81d;
        // booleanos
        boolean dato7 = false;
        boolean dato8 = true;
        // texto
        char dato9 = 'c';
        String dato10= "hola soy juan....";

        System.out.println("Enteros: " +"\n"+dato1+"\n"+dato2+"\n"+dato3+"\n"+dato4+
                            "\nDecimales: "+"\n"+dato5+"\n"+dato6+
                            "\nBooleanos: "+"\n"+dato7+"\n"+dato8+
                            "\nTexto: "+"\n"+dato9+"\n"+dato10);
    }

}
