package com.pb8jv3.java1.spotifyimitation.menusystem.submenusystem.playmenusubmenusystem;

import com.pb8jv3.java1.spotifyimitation.datamanager.DataManager;
import com.pb8jv3.java1.spotifyimitation.datamanager.data.Playlist;
import com.pb8jv3.java1.spotifyimitation.menusystem.MainMenuController;
import com.pb8jv3.java1.spotifyimitation.menusystem.MenuPrinter;

/**
 *
 * @author Kertesz Domonkos PB8JV3
 */
public class PlaylistSubmenuController {
    private PlaylistSubmenuController(){
    }
    
    public static void init(DataManager dataManager){
	Boolean breaker = true;
	while(breaker){
	    MenuPrinter.printPlaylistSubmenu();
	    String input = MainMenuController.userInput();
	    switch (input){
		case "1":
		    breaker = false;
		    break;
		default:
		    dataManager.getPlaylistManager().listPlaylists();
		    Playlist playlist = dataManager.getPlaylistManager().getPlaylist(input);
		    if(playlist != null){
			playlist.playSongs();
		    } else {
			System.out.println("Playlist doesn't exist");
		    }
	    }
	}
    }
}
