package com.pb8jv3.java1.spotifyimitation.menusystem.submenusystem.dataeditorsubmenusystem;

import com.pb8jv3.java1.spotifyimitation.datamanager.DataManager;
import com.pb8jv3.java1.spotifyimitation.datamanager.data.Song;
import com.pb8jv3.java1.spotifyimitation.menusystem.MainMenuController;
import com.pb8jv3.java1.spotifyimitation.menusystem.MenuPrinter;

/**
 *
 * @author Kertesz Domonkos PB8JV3
 */
public class SongDataEditorSubmenuController {
    
    private SongDataEditorSubmenuController() {
    }
    
    public static DataManager init(DataManager dataManager){
	Boolean breaker = true;
	while(breaker){
	    MenuPrinter.printSongDataEditorSubmenu();
	    dataManager.getSongManager().listSongs();
	    String input = MainMenuController.userInput();
	    switch (input){
		case "1":
		    breaker = false;
		    MenuPrinter.separatorLine();
		    break;
		default:
		    dataManager.getSongManager().getSongs().forEach(song -> {
			if(song.getName().equals(input)){
			    
			} else {
			    System.out.println("Song doesn't exist");
			}
		});

	    }
	}
	return dataManager;
    }
}
