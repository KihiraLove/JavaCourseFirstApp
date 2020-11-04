package com.pb8jv3.java1.spotifyimitation.menusystem;

import com.pb8jv3.java1.spotifyimitation.menusystem.submenucontroller.PlayMenuController;
import com.pb8jv3.java1.spotifyimitation.datamanager.DataManager;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Kertesz Domonkos PB8JV3
 */
public class MainMenuController {
    
    public DataManager dataManager;

    public MainMenuController(DataManager dataManager) {
	this.dataManager = dataManager;
    }

    public DataManager getDataManager() {
	return dataManager;
    }

    public void init() {
	Boolean breaker = true;
	while(breaker){
	    MenuPrinter.printMainMenu();
	    dataManager.getSongManager().getSongs().forEach(song -> System.out.println(song.getName()));
	    try{
		switch (MainMenuController.userInput()){
		    case 1:
			PlayMenuController.init(dataManager);
			break;
		    case 2:
			//open data editor menu
			break;
		    case 3:
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
    
    public static Integer userInput(){
	System.out.println("Enter chosen menu number: ");
	return Integer.parseInt(new Scanner(System.in).next()); //This is a weird method to solve a bug that is caused by the new line at the end of Scanner.nextInt()
    }
}
