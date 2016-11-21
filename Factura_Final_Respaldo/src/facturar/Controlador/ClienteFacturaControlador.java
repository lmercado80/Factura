/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturar.Controlador;
import facturar.Modelo.Cliente;
import facturar.Modelo.Repositorio;



/**
 *
 * @author Luis
 */
public class ClienteFacturaControlador {
    Repositorio <Cliente> regCliente;

    public ClienteFacturaControlador() {
        //regCliente = new Repositorio<>();
        regCliente.cargar("Cliente");
        
    }
    
        public Cliente traer(int id){
         Cliente xclie = (Cliente)regCliente.traer(id);
         return xclie;
     } 
}
