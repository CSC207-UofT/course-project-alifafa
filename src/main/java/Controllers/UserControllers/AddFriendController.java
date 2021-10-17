package Controllers.UserControllers;

import UseCase.UserManager;

public class AddFriendController extends UserController{

        public AddFriendController() {
            super(new UserManager());
            this.userPrompt.add("Your ID");
            this.userPrompt.add("Your friend's ID");
        }

        public void addFriend(String[] userInput){
            UserManager manager = (UserManager)this.useCase;
            manager.addFriend(userInput[0], userInput[1]);
        }


}
