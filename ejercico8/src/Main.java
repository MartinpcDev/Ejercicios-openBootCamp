public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(15);
        persona.setNombre("Juan");
        persona.setTelefono(958214666);

        System.out.println("Mi nombre es " + persona.getNombre() +" ,mi edad es "+persona.getEdad()
                            +" y mi telefono es "+persona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}