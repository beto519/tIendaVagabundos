/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import entidades.Producto;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.ProductoDAOIMP;

/**
 *
 * @author lopez
 */
@WebService(serviceName = "ProductoWS")
public class ProductoWS {

    
    ProductoDAOIMP daoProducto = new ProductoDAOIMP();
  
  
  @WebMethod(operationName = "agregarProducto")
    public boolean agregarProducto(
            @WebParam(name = "nombreProducto") String nombre,
            @WebParam(name = "cantidadProducto") int cantidad,
            @WebParam(name = "precioProducto") double precio
           
           
    ) {
        Producto producto = new Producto();
        producto.setNombreProducto(nombre);
        producto.setCantidadProducto(cantidad);
        producto.setPrecioProducto(precio);
      
        return daoProducto.agregar(producto);
    }
    
    
    
    
    @WebMethod(operationName = "editarProducto")
    public Boolean editar(@WebParam(name = "nombreProducto") String nombre, @WebParam(name = "cantidadProducto") int cantidad, @WebParam(name = "precioProducto") double precioProducto, @WebParam(name = "codigoProducto") String codigo,
     @WebParam(name = "idProducto") int id){
        
        Producto productoE = new Producto();
        productoE.setIdProducto(id);
        productoE.setNombreProducto(nombre);
        productoE.setCantidadProducto(cantidad);
        productoE.setPrecioProducto(precioProducto);
        productoE.setCodigo(codigo);
        
        return daoProducto.editar(productoE);
    }
    
     @WebMethod(operationName = "eliminarProducto")
    public boolean eliminar(@WebParam(name = "idProducto") int id) {
        //TODO write your implementation code here:
        return daoProducto.eliminar(id);
    }
    
     @WebMethod(operationName = "buscarTodos")
    public List<Producto> buscarTodos() {
        //TODO write your implementation code here:
        return daoProducto.buscarTodos();
    }
 
       @WebMethod(operationName = "buscarNombre")
    public List<Producto> buscarNombre(@WebParam(name = "nombreProducto") String  nombre) {
        //TODO write your implementation code here:
        return daoProducto.buscarNombre(nombre);
    }
    
}
