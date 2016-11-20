
package facturar.Controlador;

import facturar.Modelo.Factura;
import facturar.Modelo.Helper;
import facturar.Modelo.Parametro;
import facturar.Modelo.Repositorio;
import facturar.Vista.ViewFactura;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FacturaControlador {
      Repositorio <Factura> regFactura;
      Repositorio<Parametro> regParametros;
      
      
      
    public FacturaControlador() {
        regFactura = new Repositorio<>();
      //  regParametros = new Repositorio<>();
        regFactura.cargar("Factura");
        //regParametros.cargar("Parametro");
        //List<Parametro> parametros = regParametros.getLista();
        
        
        
    }
    public void  crear(ViewFactura  vfact){
                
          try {
             int idf =Integer.parseInt(vfact.txtId.getText());
            if (!(this.traer(idf)== null)){
              JOptionPane.showMessageDialog(null,"Factura Existe.Verifique");
              return;
             }
            
              Factura fact = new Factura();

              SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
              
             Date xfecha =  vfact.jDate.getDate();
            //xfecha =  formatoFecha.parse(xfecha.toString());//formatoFecha.parse(vfact.txtFecha.getText());
            // System.out.println("fecha:" + xfecha); 
             fact.setFecha(xfecha);
              String  ele =vfact.cboClientes.getSelectedItem().toString();
              String  idCli =Helper.getKeyByValue(vfact.mapCli, ele);
              
              //JOptionPane.showMessageDialog(null,vfact.cboClientes.getSelectedItem().toString() );
              
              fact.setIdCliente(vfact.cboClientes.getSelectedItem().toString());
              
              
              fact.setId(Integer.parseInt(vfact.txtId.getText()));
              fact.setNum(Integer.parseInt(vfact.txtId.getText())+"");
              fact.setDireccion(vfact.txtDireccion.getText());
              
              regFactura.adicionar(fact);
              regFactura.guardar("Factura");
              JOptionPane.showMessageDialog(null,"Registro Ha sido Guardado");
              vfact.btnAddProd.setEnabled(true);
          } catch(Exception ex) {
              Logger.getLogger(FacturaControlador.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    public Factura traer(int id){         
        return (Factura)regFactura.traer(id);
     } 
}
