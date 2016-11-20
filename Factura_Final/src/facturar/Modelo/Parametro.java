/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturar.Modelo;


public class Parametro {
  private int id_Cli;
  private int id_fac;
  private int id_prod;
  
  
  public Parametro(){
      
  }

    public int getId_Cli() {
        return id_Cli;
    }

    public void setId_Cli(int id_Cli) {
        this.id_Cli = id_Cli;
    }

    public int getId_fac() {
        return id_fac;
    }

    public void setId_fac(int id_fac) {
        this.id_fac = id_fac;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }
  
}
