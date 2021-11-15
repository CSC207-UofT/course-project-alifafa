## a summary of what each group member has been working on and plans to work on next

**Grace**: During phase 1, I created presenters and defined Input Boundaries and Output Boundaries for tasks associated with User. I also refactored the UIs, controllers, and the main. In the next phase, I plan to add Exception classes to catch invalid input from the user. In addition, I will refractor the controllers and input Boundaries so that they follow clean architecture better.

**Elizabeth**: I created classes data access interface and data access gateway for serialization. To read and write data properly without violating clean architecture, I added read data and write data methods in UserManager and a new controller. I also wrote tests for class User, UserManager, UserList and data access. I plan to extend more functions that are related to the user, such as blocked lists, adding friend requests, etc. Moreover, I would like to use more design patterns in our program if it could improve our codes’ readability and flexibility or any small issues.

**Zhiqi Zhao**: I created presenters and defined Input Boundaries and Output Boundaries for tasks associated with person-to-person chat. I also implemented the function that saving chat histories in separate files so that we can review chat history after rerun the program. In the next phase, I plan to work on GUI.

**Stephanie**: I built some parts of the UI and implemented the login feature in the UI. Now we can do simple tasks like logging in to the app, clicking into different pages and clicking various buttons. However, I am still not quite sure how we should connect the UI to the back end of the app, they are separated and I hope to investigate more into that in phase 2.

**Houyi Chen**: I created a Group entity and PtoG chat entity and every controller, managers, and UIs that belong to those two entities. In Phase 1, I have created two new functions that associate with ‘Group’, which are ‘Create Group’ and ‘JoinGroup’. In conclusion, the user can now use the command ‘create a group’ to create a new group with an unique ID; use ‘join group’ to join an existing group; use ‘group chat’ to send a message to a group. For future development, I plan to store all group chat history to a local file and also make it work with GUI.

**Lucas Lei**: I modified a few entity classes that were unfinished in Phase 0. Created Input/Output Boundaries, controllers, presenters for post and sharing centre related features. I have also created and finished the usecase (PostManager) for entities ParagraphPost, PicturePost, Notification, and SharingCentre. 


## What has worked well so far:
Right now, our code organization has strictly followed the clean Architecture, as well as SOLID. In short, our phase 1 code organization is much better than in phase 0; and we have also created different test cases to test our entities. Also, most of the designed functions can be used right now, such as sharing centres, group chat etc. Person to person chat history can now be stored in a local file.

## Our open ended questions:
* In our design, to avoid controllers directly depend on usecases, we tried to use dependency inversion principle and added input boundaries. However, in our code of the controllers like in PtoPMessageController, we directly imported the actual usecases. Because we did not find a proper place where we can initialize a usecase object since it cannot be used in the main program, the UI class, or the controller class. Hence we temporarily put the initialization of usecase into the controller class, which is a violation of Clean Architecture. So how can we fix this to follow the Clean Architecture?

* What kind of GUI should we implement for our project? Right now, we've built our frontend with android studio, but how should we connect them together?
* Right now, we cannot identify which user it is who requested to perform a task. Now, we are using the brutal method that whenever the user requests to do something, he/she will need to input his/her ID(or username). For example, if user A has an ID 001, everytime A wants to message someone, A needs to input her ID 001. Normally, user A should be automatically assumed and binded to every request she requested, without asking.  Should we use methods like session or token? If so, how? I have not found a way of implementing it without violating the clean architecture.
* We want the user the post something with pictures in it. But how do we get the image from the user and how it looks like in java(data structure or data type) and how does our program access the image file if it was inputted by the user? We need something to store the picture file and load the file.
