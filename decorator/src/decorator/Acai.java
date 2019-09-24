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
public abstract class Acai {
    protected String tipo;
    protected double preco;
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
}
