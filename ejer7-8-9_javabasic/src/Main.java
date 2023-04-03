import java.io.*;
import java.util.*;

/**
 * Ejercicio 7 8 9
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.");
        arregloUnidimensionalString();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.");
        arregloBidimensionalString();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Crea un \"Vector\" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.");
        crearVector();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.");
        System.out.println("Respuesta: El problema es que se irá redimensionando constantemente, lo que ralentiza el rendimiento del programa. Es recomendable especificar la capacidad inicial del Vector si se sabe que va a contener una cantidad significativa de elementos.");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento");
        crearArrayList();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer \"for\" de relleno.");
        crearArraylistBucle();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("----Trows Aritmetico----");
        try {
            dividePorCero();
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo del codigo");
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("InputStream y printStream");
//        try {
//            ficheros("archivo1.txt","archivo2.txt");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }finally {
//            System.out.println("codigo");
//        }
        System.out.println("--------------------------------------------------------------------------------------");

        // Crea un HashMap para almacenar nombres y números telefónicos
        HashMap<String, String> phoneBook = new HashMap<>();

        // Crea un ArrayList para almacenar los nombres y números telefónicos ingresados
        ArrayList<String> phoneList = new ArrayList<>();

        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que introduzca nombres y números telefónicos
        System.out.println("Introduce los nombres y números telefónicos (formato: nombre numero):");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Formato inválido. Introduce el nombre y el número telefónico separados por un espacio.");
            } else {
                phoneBook.put(parts[0], parts[1]);
                phoneList.add(parts[0] + ": " + parts[1]);
            }
        }

        // Pide al usuario que introduzca un nombre para buscar
        System.out.println("Introduce el nombre a buscar:");
        String nameToSearch = scanner.nextLine();

        // Busca el número telefónico correspondiente al nombre ingresado
        String phoneNumber = phoneBook.get(nameToSearch);
        if (phoneNumber != null) {
            System.out.println("Número telefónico de " + nameToSearch + ": " + phoneNumber);
        } else {
            throw new NameNotFoundException(nameToSearch);
        }

        // Imprime la lista de nombres y números telefónicos ingresados
        System.out.println("Lista de nombres y números telefónicos ingresados:");
        for (String item : phoneList) {
            System.out.println(item);
        }
    }

    public static void arregloUnidimensionalString(){
        String[] nombres = {"lucho","javier","laura","Lucas","Martin"};

        for (String nombre:nombres){
            System.out.println(nombre);
        }
    }
    public static void arregloBidimensionalString(){
        int[][] numeros = {{21,22},{23,24},{25,26},{27,28}};
        for (int i = 0; i < numeros.length;i++){
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("posicion: "+i+" "+j+" valor: "+numeros[i][j]);
            }
        }
    }
    public static void crearVector(){
        Vector<Integer> vector = new Vector<>();

        vector.add(8);
        vector.add(15);
        vector.add(20);
        vector.add(69);
        vector.add(85);
        System.out.println("Vector original: "+vector);
        vector.remove(1);
        vector.remove(2);
        System.out.println("Vector Modificado"+vector);
    }
    public static void crearArrayList(){
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Lucas");
        nombres.add("Juan");
        nombres.add("Jose");
        nombres.add("Miguel");
        LinkedList<String> lista = new LinkedList<>(nombres);

        System.out.println("---Arraylist---");
        for (String nombre:nombres){
            System.out.println(nombre);
        }
        System.out.println("---LinkedList---");
        for (String nombre:lista){
            System.out.println(nombre);
        }

    }
    public static void crearArraylistBucle(){
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        for (int j = 0; j < numeros.size(); j++) {
            if (numeros.get(j) % 2 == 0){
                numeros.remove(j);
                j--;
            }
        }
        for (int numero : numeros){
            System.out.println(numero);
        }
    }
    public static void dividePorCero() throws ArithmeticException{
        int resultado = 1 / 0;
    }
    public static void ficheros(String fileIn,String fileOut) throws IOException{
            FileInputStream fis = new FileInputStream(fileIn);
            PrintStream fps = new PrintStream(fileOut);
            byte[] buffer = new byte[1824];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1){
                fps.write(buffer,0,bytesRead);
            }
            fis.close();
            fps.close();
    }
    // Define una excepción personalizada para el caso en que no se encuentre un nombre en el HashMap
    public static class NameNotFoundException extends RuntimeException {
        public NameNotFoundException(String name) {
            super("Nombre no encontrado en la lista: " + name);
        }
    }
}