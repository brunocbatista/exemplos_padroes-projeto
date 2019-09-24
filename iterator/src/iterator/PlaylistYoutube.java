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
public class PlaylistYoutube implements AgregadoDeMusicas {
    protected ArrayList<Musica> musicas;
    public PlaylistYoutube(){
        musicas = new ArrayList<Musica>();
        musicas.add(new Musica("Post Malone - Circles"));
        musicas.add(new Musica("Post Malone - Hollywood's Bleeding"));
        musicas.add(new Musica("Post Malone - Saint-Tropez"));
        musicas.add(new Musica("Post Malone - Allergic"));
        
    }

    @Override
    public IteradorInterface criarIterator() {
        return new IteradorListaDeMusicas(musicas);
    }
}
