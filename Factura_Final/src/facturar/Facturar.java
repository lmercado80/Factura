
package facturar;

import facturar.Vista.ViewMain;
import javax.swing.JFrame;

public class Facturar {


    public static void main(String[] args) {
     ViewMain vmain= new ViewMain();
     vmain.setLocationRelativeTo(null);
     vmain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     vmain.setVisible(true);
     vmain.setExtendedState(vmain.getExtendedState() | vmain.MAXIMIZED_BOTH);
    }
    
}
