/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args){
        Acai acaiClassico = new AcaiClassico();
        System.out.println(acaiClassico.getTipo() + " = " + acaiClassico.getPreco() + "\n");
        
        acaiClassico = new LeiteCondensado(acaiClassico);
        System.out.println(acaiClassico.getTipo() + " = " + acaiClassico.getPreco() + "\n");
        
    }
}

