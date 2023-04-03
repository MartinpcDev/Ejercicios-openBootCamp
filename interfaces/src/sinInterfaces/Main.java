package sinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        sinInterfaces.EmpleadoCRUDV1 empleadoCRUDV1 = new sinInterfaces.EmpleadoCRUDV1();
//        sinInterfaces.Empleado juanito = new sinInterfaces.Empleado("Juanito",30,40000,true);
//        sinInterfaces.Empleado patricia = new sinInterfaces.Empleado("Patricia",30,40000,true);
//        sinInterfaces.Empleado roberto = new sinInterfaces.Empleado("Roberto",30,40000,true);
//
//        //guardar empleados
//        empleadoCRUDV1.guardar(juanito);
//        empleadoCRUDV1.guardar(patricia);
//        empleadoCRUDV1.guardar(roberto);
//
//        //consultar empleados
//        List<sinInterfaces.Empleado> empleados = empleadoCRUDV1.findAll();
//        System.out.println(empleados);

        // usamos V2
        EmpleadoCRUDV2 empleadoCRUDV2 = new EmpleadoCRUDV2();
        Empleado juanito = new Empleado("Juanito",30,40000,true);
        Empleado patricia = new Empleado("Patricia",30,40000,true);
        Empleado roberto = new Empleado("Roberto",30,40000,true);



        //consultar empleados
        List<Empleado> empleados = empleadoCRUDV2.recuperarEmpleados();
        System.out.println(empleados);

    }
}