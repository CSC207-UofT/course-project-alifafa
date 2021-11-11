package Controllers.UserControllers;

import UseCases.UseCase;

import java.util.ArrayList;

/** This abstract class is the parent class for all UserController.
 *
 */
public class UserController extends Controller {

    public UserController(UseCase useCase){
        userPrompt = new ArrayList<>();
        this.useCase = useCase;
    }

    public ArrayList<String> getUserPrompt() {
        return userPrompt;
    }

}
