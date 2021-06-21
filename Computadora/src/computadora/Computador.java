/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author dania
 */
public class Computador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Computadora c1= new Computadora(360, 52, new Monitor("Estrella", "Elefante", 5), new Mouse("Estrella", "Alim", "Classic"), new Teclado("Estrella", "LNT", 250, 1770), new CPU("Estrella", "NHY", 1300));
        System.out.println(c1.getMarca()+" Marca Computadora");      
    }
    
}
