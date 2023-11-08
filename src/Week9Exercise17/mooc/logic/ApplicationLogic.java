package Week9Exercise17.mooc.logic;

import Week9Exercise17.mooc.ui.UserInterface;

public class ApplicationLogic {

    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println("Application logic works");
            ui.update();
        }
    }
}
