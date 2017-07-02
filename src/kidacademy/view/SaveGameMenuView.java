/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

/**
 *
 * @author rdodenbier
 */
public class SaveGameMenuView extends View {
    
    public SaveGameMenuView(){
        super("\n"
            + "\n-----------------------------------------"
            + "\n |Save Game                            |"
            + "\n-----------------------------------------"
            + "\n1 - Save Game"
            + "\nQ - Quit"
            + "\n-----------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": //create and start a new game
                this.retrievedSaveGame();
                break;
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void retrievedSaveGame() {
        System.out.println("*** retrieveSaveGame function called ***");
    }
    
}
