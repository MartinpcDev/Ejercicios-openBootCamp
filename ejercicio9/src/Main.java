public class Main {
    public static void main(String[] args) {

        Cliente persona = new Cliente();
        persona.edad = 22;
        persona.nombre = "juan";
        persona.telefono = 969131241;
        persona.credito = 1500;
        System.out.println("Persona: ");
        System.out.println("\nNombre: " + persona.nombre + "\nEdad: " + persona.edad +
                            "\nTelefono: " + persona.telefono + "\nCredito: " + persona.credito);
        Trabajador persona2 = new Trabajador();
        persona2.nombre = "Julio";
        persona2.edad = 21;
        persona2.telefono = 945771649;
        persona2.salario = 2500;
        System.out.println("\nTrabajador: ");
        System.out.println("\nNombre: " + persona2.nombre + "\nEdad: " + persona2.edad +
                "\nTelefono: " + persona2.telefono + "\nSalario: " + persona2.salario);
    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}
