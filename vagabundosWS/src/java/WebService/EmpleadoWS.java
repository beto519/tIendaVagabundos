/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import entidades.Empleado;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.EmpleadoDAOIMP;

/**
 *
 * @author Carlos Soto Pacheco
 */
@WebService(serviceName = "EmpleadoWS")
public class EmpleadoWS {

    EmpleadoDAOIMP empleadoM = new EmpleadoDAOIMP();

    /**
     * This is a sample web service operation
     *
     * @param nombre
     * @param codigo
     * @param rol
     * @param contraseña
     * @param puesto
     * @return
     */

    @WebMethod(operationName = "agregarEmpleado")
    public boolean agregarEmpleado(
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "codigo") Long codigo,
            @WebParam(name = "rol") String rol,
            @WebParam(name = "contraseña") String contraseña,
            @WebParam(name = "puesto") String puesto
    ) {
        Empleado empleado = new Empleado();
        empleado.setCodigoEmpleado(codigo);
        empleado.setContraseña(contraseña);
        empleado.setNombre(nombre);
        empleado.setPuesto(puesto);
        empleado.setRol(rol);
        
        return empleadoM.agregar(empleado);
    }

}
