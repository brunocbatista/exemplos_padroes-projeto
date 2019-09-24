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
public class LeiteCondensado extends AcaiDecorator {
    public LeiteCondensado(Acai acai){
        super(acai);
        this.tipo = "Leite Condensado";
        this.preco = 0.25;
    }
}
