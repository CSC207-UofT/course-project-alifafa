(As of 2021/10/16)

## Specification Summary:
Inspired by Wechat, we have created a chat app for users to chat with each other.
Our application allows interaction between two or multiple different users. Each user needs to create an account first by choosing a valid username and password in order to log in and get access to the functionalities of the app. For now, the users are able to register, log in,
add friends and choose to message any users inside the friend list. In the future, the users can also join a group and start group chatting with multiple users. Also, they will be able to create posts and share them to the sharing centre where all of his/her friends can view, comment, or like. The user will get a notification and be notified whenever his/her post is commented on or liked. 

## CRC Model Summary:
We have different classes for entity, use cases, controllers, and UI interface. For entity class, our CRC model mainly includes User, Post, message, post, pyq. All entity classes extend the parent class called Entity. For use case class, they extend parent class UseCase, and are responsible for managing their associated Entity. For example, UserManager has methods for managing class User. For controller class, they all extend class Controller. Then we have UserController class, whose children are responsible for performing commands such as log in, create an account. PtoPMessageController works in a similar way, performing tasks using PtoPMessageManager to fulfill chatting purposes. 


## Scenario Walk-Through Summary:
Our scenario walk through will show the steps of registering an account, log in, and send messages. First, the user will register for an account, and then he can log in. When the user is logged in, they can add friends and send messages to their friend. The chat history will be printed out for the user to see.  

## Skeleton Program Summary:
We have created different entities class such as User, PtoPMessage, Post which are related to the basic tasks of our program. In addition, we use different use cases to handle and change the attributes of the entities. 
The program begins with a prompt for user to enter the task they want to complete. This is done through our Interface CommandUI. Each task is handled by a specific Command class such as logIn, createAnAccount, PtoPChatCommand. All command have a run method which passes the user input into the controller layer. UserControllers, or PtoPMessageController, will then pass the input down to the UseCase layer. The use case (UseManager, PtoPMessageManager) can then use their methods to update the User, or PtoPMessage accordingly.
All the Users are stored in an entity class called StoreUser. All the commands and their associated user input key are stored in the Constant class.


## Group Working and Planning:
**Lucas Lei**: Have worked on finishing the specification of our application, the CRC card formatting and some entity and usecase classes, and the coding part of the `SharingCentre`, `ParagraphPost`, and `Notifications` classes. I’m planning to work on `PostManager` use case class, `SharingCentre` controllers, add few more test cases to our code, elaborate the current code, and find resources to help us create a GUI for our application.

**Stephanie Chen**:

**Zhiqi Zhao**: Current working: PtoPMessage class, PtoPMessageManager class, ChatController class, PtoPChatController class.These classes all help to realize the person-to-person chat function. In the future, I plan to develop forming group functions and group chat functions.

**Houyi Chen**: Worked with Zhiqi Zhao and implemented the PtoPMessage class. I plan to continue to write the codes together with him; and further develop classes about messages and chat functions, such as group chat.

**Grace Yu**: Command class, UserController class, interface. I have worked on developing UserController class, which includes tasks such as log in, create an account, add friend, find the friend to message. In the future, I plan to continue to develop our interface so that it can handle invalid input and throw exceptions. I will also assist in working with running tasks associated with User such as making posts and using group chat, all of which require coordination between the Command classes and UserController classes.
 
**Elizabeth Yu**:


## What has worked well so far?:
Right now, our codes have successfully followed *Clean Architecture and SOLID principles*. We have allocated different tasks to group members, and everyone was doing their task well. We also had many virtual meetings by using discord screen share to discuss our works, ideas and combine our thoughts.

## Our questions:
* How do we implement the chat box (chat windows) for users to use?
* Should we make a cloud drive or any platform that can store the data of chat history? If not, how can we save that data?
* Some warnings that we are not sure about will be addressed in the future.
