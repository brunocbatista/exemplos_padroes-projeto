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
public class GalinhaPrototipo extends AvePrototipo {
    protected GalinhaPrototipo(AvePrototipo galinha){
        this.habitat = galinha.getHabitat();
    }
    
    public GalinhaPrototipo(){
        this.habitat = "";
    }

    @Override
    public String exibirInfos() {
        return "Tipo de Ave: Galinha\n"
                + "Habitat: " + getHabitat() + "\n";
    }

    @Override
    public AvePrototipo clonar() {
        return new GalinhaPrototipo(this);
    }
}
