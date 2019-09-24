/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class IteradorListaDeMusicas implements IteradorInterface {
    protected ArrayList<Musica> lista;
    protected int contador;
    
    public IteradorListaDeMusicas(ArrayList<Musica> lista) {
        this.lista = lista;
        contador = 0;
    }

    @Override
    public void first() {
        contador = 0;
    }

    @Override
    public void next() {
        contador++;
    }

    @Override
    public boolean isDone() {
        return contador == lista.size();
    }

    @Override
    public Musica currentItem() {
        if(isDone()){
            contador = lista.size() - 1;
        }else if(contador < 0){
            contador = 0;
        }
        return lista.get(contador);
    }
    
}
