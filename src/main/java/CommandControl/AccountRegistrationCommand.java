package CommandControl;

import Controllers.UserControllers.AccountRegistrationController;

public class AccountRegistrationCommand extends Command{

    AccountRegistrationController controller = new AccountRegistrationController();
    //AccountResgistrationController, which has a checkID method that checks if
    //user's desired ID is used. It also has a createAnAccount, which can create
    //use UserManager to create a new User account.


    /**
     * This method is responsible for create an account.
     * @param userInput Ths user's input from keyboard, it has ID, username, password.
     */
    @Override
    public void run(String[] userInput) {
        boolean existingID = controller.checkID(userInput[0]);
        if(!existingID){
            System.out.println("This ID already exists. Please use another one.");
        } else {
            controller.createAnAccount(userInput);
            System.out.println("Your account is successfully created!");
        }
    }
}
