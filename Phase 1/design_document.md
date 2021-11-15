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
### Bad Designs that remain to be fixed
DataAcessGateway and PtoPMessageDataAccess has similar code.


## Clean Architecture
Most parts of our program are consistent with Clean Architecture. The Dependency Rule is consistent:
* UIs interact with the user’s input. LogInUI depends on LogInController and LogInPresenter.
* LogInController depends on UserInputBoundary, which is implemented by UserManager. 
* UserManager depends on LogInOutputBoundary, which is implemented by the LogInPresenter. (we use Dependency Inversion)
* Presenters (PostAPost, DeletePost, CommentPost, Notification, and SharingCentre) and PostManager both depend on the same abstraction. 




*Except* few violations(Can't figure out how to fix yet):
  - In our design, to avoid controllers directly depend on usecases, we tried to use dependency inversion principle and added input boundaries. However, in our code of the controllers, we directly imported the actual usecases.
Because we did not find a proper place where we can initialize a usecase object since it cannot be used in the main program, the UI class, or the controller class. 
Hence we temporarily put the initialization of usecase into the controller class, which is a violation of Clean Architecture.
  - PtoPMessageController uses the constructor of usecases which violates the Clean Architecture.

## Design Patterns
1. Dependency injection
   - We use dependency injection design pattern in our controller classes. For example, in the LogInPresenter, we avoided the “hard dependency” from LogInPresenter to UserInputBoundary. Instead of creating the UserInputBoundary in the constructor, we can create it outside and pass each UserInputBoundary into LogInPresenter using the method setLoginInputBoundary. This way we can test the two classes independently or even inject UserInputBoundary-derived classes.


### Could be applied in future:
- We can use the template method for the post component of our code. Since we have two types of posts, the text post, and the picture post that have many invariant characteristics as a post, we could implement them using the template method. For example, there could be a framework class called “post” that implements all common features of text post and picture post like date of the post, sender of the post, et cetera. The framework will also have an abstract method called “component” such that we could design the component as text, or text and picture. Then the subclass, text post, and picture post can override this method. By doing so, we do not need to repeat our code but we can keep the different components.
- We were planned to use the Observer design pattern for the Sharing Centre feature, where whenever a friend liked or commented on your post, you will get notified. You will also get notified whenever a friend of yours post a new post and your sharing centre will get updated and add your friend’s post to it. However, one issue with Observer is that it’s deprecated in Java 9, so it would be bad to implement it. If we were trying to use a similar design pattern, we would’ve to use the Java.Bean or the Concurrent.Flow pattern. But both of these patterns are hard to understand/implement and we can’t figure out how to use them yet.


## Use of GitHub Features
1. Issues
    - We mainly use GitHub Issues to assign tasks to people and keep our to-do lists. When we finish tasks, we will resolve the issue.
2. Actions
    - We use the GitHub feature Action when we need to re-run previous workflow. Sometimes we use it to find the history of our modification. We sort the workflow by branches or group members to find out the specific modification.
3. Pull Requests
    - We use pull requests most often. Whenever we finish working on our own branch and wish to merge the new commits, we created pull requests and ask our group members to review them or resolve any conflicts. We use it to make sure everyone can work individual parts while incorporating with others.

## Code Style and Documentation
### Warnings
There few minor warnings that highlight methods that are unused, which we will certainly be used later. 
### Javadoc
Yes, we try to document code concisely so that not just ourselves, but when other people read our code we can understand what it is for and maybe the logic behind it. This decreases the time we might spend on asking each other what their code means. 
### Understandable
Our code is organized in a way so that it is clear what each file is used for and its relationship with other files. Thus, even a new-comer trying to read our code can easily navigate through it. We all use the same code organization method suggested by clean architecture, so if we want to look at each other’s pull requests we can still understand the files and the codes.

## Testing
We have mainly tested the entities, and usecases, and few controllers or presenters currently. We expect to have everything well-tested before Phase 2.

## Refactoring
Specific Pull Request: Updated UI, command, controller, presenter for User. GitHub Classroom Workflow #95.
We refactored the way we interact with user inputs and the way we present output.

Initially, we have only one UI and the controller class serves the presenter purpose. One UI violates single responsibility principle because it is responsible for all tasks interaction. In addition, the controller should not be responsible for presesnting the output.

During refraction,
- We added different UIs for their own associated task.
- We added presenter classes which can handle the output from the UserManager and give it to the UI.
- We defined InputBoundaries and OutputBoundaries (we did not have those in phase 0) to follow dependency rules.

## Code Smells
- Duplication: DataAcessGateway and PtoPMessageDataAccess has similar code.

## Code Organization and Packaging Strategy
Our code organization strictly follows the clean architecture principle. They are first separated into big categories like Use Cases, Entities, Controllers etc. according to the big layers in the Clean Architecture diagram. Then, under some of these big categories we have smaller categories classified by features. For example, under the controllers folder, we have a Chat Controller folder which contains controller files related to the Chat feature of our app. So our packaging strategy is **by layer**. This way of code organization allows us to find a file easily and understand the relationship of a file to other files. This way of organization also allows other people reading our code to easily navigate through it and understand our code.

## Functionality
### Our program follows the speficiation.
(Discuss why it's ambitious here).

Our program completed 90% of the specification. Basic functionalities like group chat, chat, sharing centre, and adding/removing friends are all available at this stage. Considering the size of our group and the time we can contribute to this course, we made our design reasonably large with 3 main parts, which are user, chat, and posts. Two group members are responsible for implementing the functions of one part. Functions related to the user part are mainly log in, registration, add friends. Functions related to chat are mainly chatting with a single user, or chatting within a group. Functions related to post are mainly creating posts and sharing posts. In addition to those functions, our program can also load and store state, which is discussed below. Moreover, we are also developing user interface and GUI. Hence the functionality is ambitious.

### Store state and load state
#### Stores user information and its p-to-p chat history
Our program can store all the user information and the p-to-p chat histories. It does it by reading a file from the computer which contains the previous histories, and write to the file after the user ends the program run. Hence the history is stored even if the program is closed. Moreover, when the user re-run the program, our program can get access to the previous chat history and read them or add to them.

We plan to implement the data access interface to every entity class in Phase 2, so that the program can store and read all the things the user needs to access all functionalities of our app.
