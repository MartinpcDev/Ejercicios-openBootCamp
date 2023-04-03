package sinInterfaces;

import java.util.ArrayList;
import java.util.List;
/*
* Crete
* Retrieve/Read
* Update
* Delete
* */

public class EmpleadoCRUDV1 {
    //Estructura de datos
    private List<Empleado> empleados = new ArrayList<>() ;
    //OPERACIONES CRUD

    //CREATE = Guardar un empleado
    public void guardar(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
        return empleados;
    }
}
