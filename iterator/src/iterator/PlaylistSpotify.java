/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author Bruno
 */
public class PlaylistSpotify implements AgregadoDeMusicas {
    protected Musica[] musicas = new Musica[2];
    public PlaylistSpotify(){
        musicas[0] = new Musica("Dynoro, Gigi D'Agostino - In My Mind");
        musicas[1] = new Musica("Alan Walker - Darkside (feat. Au/Ra and Tomine Harket)");
       
    }

    @Override
    public IteradorInterface criarIterator() {
        return new IteradorMatrizDeMusicas(musicas);
    }
}
