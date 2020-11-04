package com.pb8jv3.java1.spotifyimitation.menusystem.submenucontroller.subsubmenucontroller;

import com.pb8jv3.java1.spotifyimitation.datamanager.DataManager;
import com.pb8jv3.java1.spotifyimitation.datamanager.data.Playlist;
import com.pb8jv3.java1.spotifyimitation.menusystem.MainMenuController;
import com.pb8jv3.java1.spotifyimitation.menusystem.MenuPrinter;
import java.util.InputMismatchException;

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
	    try{
		switch (MainMenuController.userInput()){
		    case "1":
			dataManager.getPlaylistManager().listPlaylists();
			Playlist playlist = dataManager.getPlaylistManager().getPlaylist(MainMenuController.userInput());
			if(playlist != null){
			    playlist.getSongs().forEach(song -> System.out.println("Now playing: " + song.getName()));
			} else {
			    System.out.println("Invalid input!");
			}
			break;
		    case "2":
			break;
		    case "3":
			break;
		    case "4":
			breaker = false;
			break;
		    default:
			MenuPrinter.separatorLine();
			System.out.println("Invalid input");
		}
	    } catch(InputMismatchException e){
		MenuPrinter.separatorLine();
		System.out.println("Please enter a number");
	    }
	}
    }
}
