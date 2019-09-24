/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Bruno
 */
public abstract class AvePrototipo {
    protected String habitat;
    public abstract String exibirInfos();
    public abstract AvePrototipo clonar();
    public String getHabitat(){
        return habitat;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    
    
}
