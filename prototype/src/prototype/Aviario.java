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
public class Aviario {
    public static void main(String[] args){
        GalinhaPrototipo galinha = new GalinhaPrototipo();
        
        AvePrototipo galinhaGranja = galinha.clonar();
        galinhaGranja.setHabitat("Granja");
        AvePrototipo galinhaSitio = galinha.clonar();
        galinhaSitio.setHabitat("Sitio");
        
        System.out.println(galinhaGranja.exibirInfos());
        System.out.println(galinhaSitio.exibirInfos());
    }
}
