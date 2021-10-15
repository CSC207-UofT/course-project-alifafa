package main.Controllers.UserControllers;

import main.Controllers.Controller;
import main.UseCases.UseCase;

import java.util.ArrayList;
import java.util.Arrays;

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
