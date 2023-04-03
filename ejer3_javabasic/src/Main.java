import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        String[] textos = new String[4];
        for (int i = 0; i < 4; i++){
            System.out.println("ingrese el texto a concatenar: ");
            textos[i] = text.nextLine();
        }

        String resultadoSinEspacio = concatenarSinEspacio(textos);
        String resultadoConEspacio = concatenarConEspacio(textos);

        System.out.println(resultadoSinEspacio);
        System.out.println(resultadoConEspacio);
    }
    static String concatenarSinEspacio(String[] textos){
        String resultado = "";
        for (String texto:textos){
            resultado += texto;
        }
        return resultado;
    }
    static String concatenarConEspacio(String[] textos){
        String resultado = "";
        for (String texto:textos){
            resultado += texto + " ";
        }
        return resultado;
    }
}