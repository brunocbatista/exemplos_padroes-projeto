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
public class PapagaioPrototipo extends AvePrototipo {
    protected PapagaioPrototipo(AvePrototipo papagaio){
        this.habitat = papagaio.getHabitat();
    }
    
    public PapagaioPrototipo(){
        this.habitat = "";
    }

    @Override
    public String exibirInfos() {
        return "Tipo de Ave: Papagaio\n"
                + "Habitat: " + getHabitat() + "\n";
    }

    @Override
    public AvePrototipo clonar() {
        return new PapagaioPrototipo(this);
    }
}
