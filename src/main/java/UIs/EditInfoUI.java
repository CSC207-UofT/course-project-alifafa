package UIs;

import Controllers.UserControllers.EditInfoController;
import Presenters.EditInfoPresenter;

import java.io.IOException;
import java.util.Scanner;

public class EditInfoUI extends ParentUI{

    @Override
    public void run() throws IOException {
        EditInfoController controller = new EditInfoController();
        EditInfoPresenter presenter = new EditInfoPresenter();

        String[] parameters = new String[2];

        System.out.println("Please type a valid command to begin: 'edit username', 'edit password'");
        Scanner scanner = new Scanner(System.in);
        parameters[0] = scanner.nextLine();
        System.out.println("New value: ");
        parameters[1] = scanner.nextLine();

        controller.editUsername();
    }
}
