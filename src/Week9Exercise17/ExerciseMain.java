package Week9Exercise17;

import Week9Exercise17.mooc.logic.ApplicationLogic;
import Week9Exercise17.mooc.ui.TextUserInterface;
import Week9Exercise17.mooc.ui.UserInterface;

public class ExerciseMain {
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
