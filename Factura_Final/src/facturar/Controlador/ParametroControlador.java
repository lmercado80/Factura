/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturar.Controlador;

import facturar.Modelo.Parametro;
import facturar.Modelo.Repositorio;

/**
 *
 * @author Luis
 */
public class ParametroControlador {
    Repositorio   <Parametro> regParametro;
    
     public ParametroControlador() {
        regParametro = new Repositorio<>();
        regParametro.cargar("Parametro");
    }
    
    
    
}


   