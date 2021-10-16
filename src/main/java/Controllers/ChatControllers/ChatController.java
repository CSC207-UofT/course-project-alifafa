package Controllers.ChatControllers;


import Controllers.Controller;
import UseCases.UseCase;

import java.util.ArrayList;

public abstract class ChatController extends Controller {
    /**
     * This is parent class for all types of ChatController.
     */

    public ChatController(){
        userPrompt = new ArrayList<>();
    }

}
