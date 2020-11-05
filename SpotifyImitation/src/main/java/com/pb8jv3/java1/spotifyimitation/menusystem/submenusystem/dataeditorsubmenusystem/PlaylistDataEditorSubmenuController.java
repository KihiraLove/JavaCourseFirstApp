package com.pb8jv3.java1.spotifyimitation.menusystem.submenusystem.dataeditorsubmenusystem;

import com.pb8jv3.java1.spotifyimitation.datamanager.DataManager;
import com.pb8jv3.java1.spotifyimitation.datamanager.data.Song;
import com.pb8jv3.java1.spotifyimitation.menusystem.MainMenuController;
import com.pb8jv3.java1.spotifyimitation.menusystem.MenuPrinter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kertesz Domonkos PB8JV3
 */
public class PlaylistDataEditorSubmenuController {
    private PlaylistDataEditorSubmenuController() {
    }
    
    public static DataManager init(DataManager dataManager){
	Boolean breaker = true;
	while(breaker){
	    String input;
	    if(dataManager.getPlaylistManager() == null){
		MenuPrinter.printPlaylistDataEditorSubmenuWhenNoPlaylist();
		input = MainMenuController.userInput();
		switch (input){
		    case "1":
			dataManager = PlaylistDataEditorSubmenuController.createPlaylist(dataManager);
			break;
		    case "2":
			breaker = false;
			MenuPrinter.separatorLine();
			break;
		    default:
			System.out.println("Invalid input");
		}
	    } else {
		MenuPrinter.printPlaylistDataEditorSubmenu();
		input = MainMenuController.userInput();
		switch (input){
		    case "1":

			break;
		    case "2":
			breaker = false;
			MenuPrinter.separatorLine();
			break;
		    default:
			System.out.println("Invalid input");
		}
	    }
	}
	return dataManager;
    }

    private static DataManager createPlaylist(DataManager dataManager) {
	String input;
	do{
	    System.out.println("Enter name of playlist: ");
	    input = MainMenuController.userInput();
	    if(!input.equals("")){
		String name = input;
		List<Song> songs = new ArrayList<>();
		Boolean breaker = true;
		while(breaker){
		    dataManager.getSongManager().listSongs();
		    System.out.println("Type the name of the song you want to add, type 0 to Exit:");
		    input = MainMenuController.userInput();
		    for(Song song :  dataManager.getSongManager().getSongs()){
			if(song.getName().equals(input)){
			    songs.add(song);
			} else if(input.equals("0")){
			    breaker = false;
			} else {
			    System.out.println("Song does not exist");
			}
		    }
		    dataManager.setPlaylistManager(dataManager.getPlaylistManager().addPlaylist(name, songs));
		}
	    } else {
		System.out.println("Invalid input");
	    }
	} while(input.equals(""));
	return dataManager;
    }
    
}
