# Design Question

## Design Decision
We decided to develop two major functions of our application, which are chatting and making posts. The intended users of our application are students, and thus we believe the two functions best suit their needs in sharing their daily life with their friends.

## Solid Principle
### How our program followed SOLID Principle.
* Single Responsibility Principle.
  Each module of our code is only responsible for one business function. For example, we have different tasks available to users such as login, add friend, chat. Each of the tasks has its own UI, controller and presenter.
* Open/Closed Principle.
  Our code is open for extension but closed for modification. For example, if we want to implement the membership of user by extending our program, we could create “Member” and “Non-Member” as subclass of User, without change any method or attribute in User.
* Liskov substitution principle.
  Each object in our code can be replaceable with instances of their subtypes without creating errors. For example, there is no problem with replacing a paragraph post with an instance of picture post.
* Interface Segregation Principle.
  We make the Output Boundaries small and only have 2 essential methods (to store the information and to return the information). that the presenter needs to implement in order to run the program. Hence people will not end up implementing the things they don’t need.
* Dependency Inversion Principle.
  All higher level usecases are not importing any lower level modules. Both depend on abstraction through interfaces. In our code, the PostManager imports the OutputBoundary interface instead of importing the actual presenter. In addition, the presenter implements the same OutputBoundary interface. This way, the higher level PostManager is able to talk with the presenter through this interface. Even though PostManager and presenter knows zero details about each other, every concrete implementation depends on the OutputBoundary interface.



## Clean Architecture
**All** parts of our program are consistent with Clean Architecture. The Dependency Rule is consistent:
* UIs interact with the user’s input. LogInUI depends on LogInController and LogInPresenter.
* LogInController depends on UserInputBoundary, which is implemented by UserManager.
* UserManager depends on LogInOutputBoundary, which is implemented by the LogInPresenter. (we use Dependency Inversion)
* Presenters (PostAPost, DeletePost, CommentPost, Notification, and SharingCentre) and PostManager both depend on the same abstraction.



## Design Patterns
1. Dependency Injection:
- We use dependency injection design pattern in our Entity classes. For example, in the class UserList, we avoided the “hard dependency” from User to UserList. Instead of creating the new users in the a method of UserList, we create it outside and pass each users into UserList using the method addUser and addUsers. This way we can test the two classes independently.


2. Factory Method
- We use factory method design pattern in our entity classes such as ParagraphPost.java and PicturePost.java. We added an interface where the subclass PicturePost implements it and lets it decide which class to instantiate (in this case, ParagraphPost).

3.Template Method
- We use template method in our entity classes. Template method was implemented in class message and its subclasses, PtoPMessage and PtoGMessage. Since PtoPMessage and PtoGMessage shares similar properties but demonstrate no reuse of constructor and method toString, template method fit pretty well. The receiver of PtoPMessage is an user while the receiver of PtoGMessage is a group, we initialize other constructor in super class message and initialize the receiver differently in these classes. Also, the since PtoP and PtoG need to be convert differently to string, we override toString method in Message for both classes. This way we can implement different features without having duplicate in their similarities.

4. Command pattern
 -  We used the command pattern for the command (log in command, see package command design pattern). The command pattern contains a receiver, invoker, command class. The command class is an abstract class which has a method execute(). The invoker has a attribute as command, and it can use the command to run the execute() method. The actual command (login Command) implements the abstract command class and implements the execute() method. The basic structure is when the user calls invoker, the invoker will call its attribute (in this case login Command) to execute. When the log in command executes, the receiver (log in receiver) will be switched on. The login receiver is the class that actually performs the login class.

5. Facade Pattern
 -  We used Facade Design Pattern in PtoPMessageControllerFacade and PtoGMessageControllerFacade. For example, PtoPMessageControllerFacade contains methods in  PtoPMessageReceiveController and PtoPMessageSendController, but the detail implementation are in  PtoPMessageReceiveController and PtoPMessageSendController, which follows single responsibility.

6. Null pattern
 -  We used the null pattern in our User class to avoid the possibility of having null objects calling on methods. We have many methods in UserManager class that use getter methods to get an object then use the returned object to call on something else. We created a NullUser class so that whenever we return null when we want to return an user, we will return a null user.


## Use of GitHub Features
1. Issues
    - We mainly use GitHub Issues to assign tasks to people and keep our to-do lists. When we finish tasks, we will resolve the issue.
2. Actions
    - We use the GitHub feature Action when we need to re-run previous workflow. Sometimes we use it to find the history of our modification. We sort the workflow by branches or group members to find out the specific modification.
3. Pull Requests
    - We use pull requests most often. Whenever we finish working on our own branch and wish to merge the new commits, we created pull requests and ask our group members to review them or resolve any conflicts. We use it to make sure everyone can work individual parts while incorporating with others.

## Code Style and Documentation
### Warnings
We have addressed all warnings.
### Javadoc
Yes, we try to document code concisely so that not just ourselves, but when other people read our code we can understand what it is for and maybe the logic behind it. This decreases the time we might spend on asking each other what their code means.
### Understandable
Our code is organized in a way so that it is clear what each file is used for and its relationship with other files. Thus, even a new-comer trying to read our code can easily navigate through it. We all use the same code organization method suggested by clean architecture, so if we want to look at each other’s pull requests we can still understand the files and the codes.

## Testing
We have tested the entities, use cases, controllers, and presenters.

## Refactoring

During refraction,
- Code Smell: We refactored problematic code that had code smell.
- Design Patterns(Github workflow #157, #152 and many others): We added new design patterns(those have detailed explanation in design patterns part), that makes our code have better clarity, and help us to avoid code smells. (All the design patterns are implemented in Phase 2 because we changed our code such that design pattern in Phase 1 is not there now)
- Packaging (Github workflow #153 and many others): We used new packaging strategy during refactor (detailed explanations are in packaging part)
- Warning(Github workflow #166 and many others): We fixed warnings in our code, for example, we delete unused method and attribute.
- Serialization(Github workflow #119,120 and many others): We refactored code of storaging such that we can store data without properly exiting. This is more reasonable as users should not be responsible for properly exiting everytime.
- Additional features and logistics(Github workflow #101,128 and many others): We added additional features such as blocked list, sharing centre and changing password (details are in specification). We also fixed our logistics, for example, users cannot add friend and chat before they log in, users do not need to be responsible for properly exiting, etc..

## Code Smells
Almost None! The code smell (duplicated code in two Gateways)  we mentioned in phase1 is addressed, although there are still similar codes. However, by single responsibility rule,one gateway is responsible for one usecase. So we can not use one Gateway for all usecases. But we have decrease the similar unnecessary code in these Gateways and left necessary code for read and write data.

## Code Organization and Packaging Strategy
Our code organization strictly follows the clean architecture principle. They are first separated into big categories like Use Cases, Entities, Controllers etc. according to the big layers in the Clean Architecture diagram. Then, under some of these big categories we have smaller categories classified by features. For example, under the controllers folder, we have a Chat Controller folder which contains controller files related to the Chat feature of our app. So our packaging strategy is **by layer** and **by feature**. This way of code organization allows us to find a file easily and understand the relationship of a file to other files. This way of organization also allows other people reading our code to easily navigate through it and understand our code.

## Functionality
### Our program follows the specification.


Our program completed 100% of the specification. Functionalities like group chat, chat, sharing centre, and adding/removing friends are all available at this stage. Considering the size of our group and the time we can contribute to this course, we made our design reasonably large with 3 main parts, which are user, chat, and posts. Two group members are responsible for implementing the functions regarding each part. Functions related to the user part are mainly log in, registration, add friends. Functions related to chat are mainly chatting with a single user, or chatting within a group. Functions related to post are mainly creating posts and sharing posts. In addition to those functions, our program can also load and store state, which is discussed below. Moreover, we also developed a complicated command line user interface . Hence the functionality is ambitious.

### Store state and load state
#### Stores user information, attribute, and its chat history
Our program can store all the user information and the p-to-p chat histories. It does it by reading a file from the computer which contains the previous histories, and write to the file after the user ends the program run. Hence the history is stored even if the program is closed. Moreover, when the user re-run the program, our program can get access to the previous chat history and read them or add to them.

Here is an explanation with details: We have DataAccessGateway, PtoPMessageDataAccess, PtoGMessageDataAccess that can store the states of User, person-to-person message, person-to-group message respectively. And we store the state of User in a csv file, and the states of person-to-person message and person-to-group message in txt file through the 3 DataAccess/Gateway.

We dealt with our problem in Phase 1 where state cannot be saved if users do not type “exit”. Now our program will store everything during the time that the program is running.
