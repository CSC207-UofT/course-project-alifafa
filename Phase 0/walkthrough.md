## Scenario Walk-Through
After running our program, a prompt 
> “Hello! Please type a valid command to begin (eg. type 'log in', 'message', 'create an account', 'add friend', 'chat')” 

asks the `User` to follow the instructions as provided.

###### Create an account
After entering *“create account”*, `CommandController` will evaluate the **input** and decide to call `UserController`.
`UserController` will ask the user to enter their `ID`, `username` and `password`. If the `ID` does not duplicate the existing _ID_, the `UserController` will use `UserManager` to _create_ this account, otherwise the `UserController` will return 
> “This ID already exists. Please use another one.” 

(See [CRC card](https://github.com/CSC207-UofT/course-project-alifafa/blob/aae94a5b54664cbaf71c30d8c3f5d6ec7083bfd4/Phase%200/CRC_Card.pdf) for UserManager for reference).

###### Log in：
After entering *“log in”*, `CommandController` will evaluate the **input** and call `UserController`.
`UserController` asks the user to enter their `ID` and `password`. The `UserController` will use the `UserManager` to check whether the `ID` exists or not. If the `ID` does not exist, `UserManager` will return “ID does not exist”. `UserController` compares whether the `password` is correct or not. If the `password` is incorrect, it will return 
> “It does not seem correct. Please re-enter your information.” 
 
If the ID is correct, `UserController` will use the `UserManager` to change the user `LogIn status`.


###### Add a friend:
After entering *“add friend”*, `CommandController` will evaluate the **input** and call `UserController`.
`UserController` specifies that the user needs to enter the `ID` of the friend she/he wants to add. The `UserController` will send the **input** (ID of the friend) to `UserManager`.
`UserManager` checks whether the `ID` exists or not. If the `ID` does not exist, `UserController` will return 
> “ID does not exist”.

If the `ID` exists, `UserController` will use the `UserManager` to check whether the user of this `ID` is in his/her `blocked list`. If he/she does, there will be no change.
If he/she does not, it will return
> "The friend is successfully added!"

###### Message a Friend
`UserA` types *“chat”*. `CommandUI` will take the **input** and prompt the user to enter the `username of the friend`. 
The username will be sent to `MessageAFriendController`, which uses `UserManager` to find if `username` is in userA’s `friendsList`.
The result is sent back to `MessageAFriendController` and then to `CommandUI`. If the friend does not exist, it will prompt the user to re-enter the information.
If the friend exists, CommandUI will use ChatController, ChatController will create userA and userB by UserManager, and will create the message by PtoPMessageManager.
`PtoPMessageManager` will print the old message history between `userA` and `userB` then send the message from `userA` to `userB` and print the updated message history between `userA` and `userB`.
