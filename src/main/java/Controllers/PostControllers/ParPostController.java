package Controllers.PostControllers;

public class ParPostController extends PostController{
    public ParPostController(){
        super();
        this.userPrompt.add("Description");
        this.userPrompt.add("Set Visibility");
        this.userPrompt.add("Set Location");
    }
}
