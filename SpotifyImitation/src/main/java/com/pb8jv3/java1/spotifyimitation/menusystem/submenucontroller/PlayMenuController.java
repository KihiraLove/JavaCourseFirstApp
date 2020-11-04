package com.pb8jv3.java1.spotifyimitation.menusystem.submenucontroller;

import com.pb8jv3.java1.spotifyimitation.datamanager.DataManager;
import com.pb8jv3.java1.spotifyimitation.menusystem.MainMenuController;
import com.pb8jv3.java1.spotifyimitation.menusystem.MenuPrinter;
import com.pb8jv3.java1.spotifyimitation.menusystem.submenucontroller.subsubmenucontroller.PlayAllSubmenuController;
import java.util.InputMismatchException;

/**
 *
 * @author Kertesz Domonkos PB8JV3
 */
public class PlayMenuController {

    private PlayMenuController() {
    }
    
    public static void init(DataManager dataManager){
	Boolean breaker = true;
	while(breaker){
	    MenuPrinter.printPlayMenu();
	    try{
		switch (MainMenuController.userInput()){
		    case 1:
			PlayAllSubmenuController.init(dataManager);
			break;
		    case 2:
			//open data editor menu
			break;
		    case 3:
			break;
		    case 4:
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
