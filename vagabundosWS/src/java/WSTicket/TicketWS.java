/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSTicket;

import entidades.Ticket;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.TicketDAOIMP;

/**
 *
 * @author Carlos Soto Pacheco
 */
@WebService(serviceName = "TicketWS")
public class TicketWS {

    TicketDAOIMP metodos = new TicketDAOIMP();
    Ticket tk = new Ticket();

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "agregarTicket")
    public boolean agregarTicket(
            @WebParam(name = "fecha") Date fecha,
            @WebParam(name = "idEmpleado") int idEmpleado,
            @WebParam(name = "total") long total
            ) {
        
        tk.setFecha(fecha);
        tk.setIdEmpleado(idEmpleado);
        tk.setTotal(total);
        
        return metodos.agregar(tk);

    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "buscarTodos")
    public List<Ticket> buscarTodos() {
        
        
        return metodos.buscarTodos();
    }

    /**
     * Web service operation
     * @param idTicket
     * @return 
     */
    @WebMethod(operationName = "buscarPorID")
    public Ticket buscarPorID( @WebParam(name = "id") int idTicket) {
      
        
        return metodos.buscarId(idTicket);
    }
    
    
    
    
    
    

}
