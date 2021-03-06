/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import kidacademy.control.GameControl;
import kidacademy.model.Player;

/**
 *
 * @author rdodenbier
 */
public class StartProgramView extends View{
        
    public StartProgramView() {
        super("\nPlease enter your name: ");
        
        //diplay the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(    
        "\n*************************************************"
        + "\n                                               *"
        + "\nWelcome to Kid Academy!!!!!!"
        + "\n\nThis is your chance to be smarter than a 5th"
        + "\ngrader. As you explore through the Kid Academy"
        + "\ncampus, you'll be challenged with questions"
        + "\nsuitable for kids in 5th grader or lower."
        + "\n\nFor each correct answer, you'll receive a score"
        + "\nthat will count towards your graduation from"
        + "\nKid Academy."
        + " \n"
        + "\nGood luck!!!                                    "
        + "\n                                               *"
        + "\n************************************************"
        );
    }

    @Override
    public boolean doAction(String value) {
        if (value.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "This name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(value);
        
        if(player == null) { // if unsuccessful
            System.out.println("\nError creating player");
            return false;
        }
        
        //display new view
        this.displayNextView(player);
        
        return true; //
    }

    private void displayNextView(Player player) {
        System.out.println("\n================================="
                          + "\n Welcome to the game " + player.getName()
                          + "\n We hope you have a lot of fun!"
                          + "\n================================="        
        );
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display();
    }
}
