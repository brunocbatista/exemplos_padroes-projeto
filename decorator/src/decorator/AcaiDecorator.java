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
public class AcaiDecorator extends Acai {
    Acai acai;
    
    public AcaiDecorator(Acai acai){
        this.acai = acai;
    }
    
    @Override
    public String getTipo(){
        return acai.getTipo() + " + " + this.tipo;   
    }
    
    @Override
    public double getPreco(){
        return acai.getPreco() + this.preco;   
    }
}
