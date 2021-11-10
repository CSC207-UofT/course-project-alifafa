package Controllers.PostControllers;

import Entity.ParagraphPost;
import Entity.PicturePost;
import Entity.User;
import UseCase.UserManager;


/**
 * This class is responsible for managing the user input and calling associated xxx when the user
 * wants to share a post.
 */
public class PicPostController extends PostController{
    public PicPostController(){
        super();
        this.userPrompt.add("Description");
        this.userPrompt.add("Pictures or video");
        this.userPrompt.add("Set Visibility");
        this.userPrompt.add("Set Location(Optional)");
    }

}
