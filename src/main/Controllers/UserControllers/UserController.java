package main.Controllers.UserControllers;

import main.Controllers.Controller;

import java.util.ArrayList;
import java.util.Arrays;

/** This abstract class is the parent class for all UserController.
 *
 */
public abstract class UserController extends Controller {

    protected ArrayList<String> userPrompt;

    public UserController(){
        userPrompt = new ArrayList<String>();
    }

    public ArrayList<String> getUserPrompt() {
        return userPrompt;
    }
}
