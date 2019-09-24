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
public class Main {
    public static void main(String[] args) {
        AgregadoDeMusicas playlistYT = new PlaylistYoutube();
        System.out.println("Playlist Youtube:");
        for (IteradorInterface it = playlistYT.criarIterator(); !it.isDone(); it.next()){
            System.out.println(it.currentItem().nome);
        }

        AgregadoDeMusicas playlistSpot = new PlaylistSpotify();
        System.out.println("\nPlaylist Spotify:");
        for (IteradorInterface it = playlistSpot.criarIterator(); !it.isDone(); it.next()){
            System.out.println(it.currentItem().nome);
        }
    }
}


