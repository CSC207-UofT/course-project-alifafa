## Specification

* Our application allows interaction between two or multiple different users. Each `User` needs to **create an account** first by choosing a valid `username` and `password` in order to **log in** and get access to the functionalities of the app. After the user gets logged in, the user can **log out** or add existing users to his/her **friend list**, then the user can choose to **message** any users inside the friend list or **remove friend**. If a user do not want to be added as another user’s friend, he or she can add that user into **blocked list**. Users can also **change password**. Moreover, the user can **join a group chat** and **send message** to everyone that’s in this `group chat`, in which a group chat consists of three or more users.

* For Create a group in Group chat, it will create a group by inputting one unique group name.
For Join group: Type in the group name and the current user will join in this group/
For general Group chat: type any message and it will send to the group and store the local group chat data in file .txt. This function will also show the previous PtoG chat history. (There is a checkgroup method to check if the current user is in this group or not, if not, he will not be able to chat in this group). Lastly, Group kick will kick a specific user from a specific group, so that user will no longer able to chat in that group

* Our app has an **additional feature** where a user can **create posts** and **share** them to the `sharing centre` where all of the users (including user’s friends, and user itself) can **view**, **comment**, or **like**. The user will get a `notification` and be notified whenever his/her post is commented on or liked. A `sharing centre` of a particular user should contain all the posts shared by the user’s friends and the user itself. 

* All of the functionalities are delivered to the user by the Java **Command UI** by running the Main.java class through JVM.

* We have DataAccessGateway, PtoPMessageDataAccess, PtoGMessageDataAccess that can store the states of User, person-to-person message, person-to-group message respectively. And we store the state of User in a csv file, and the states of person-to-person message and person-to-group message in txt file through the 3 DataAccess/Gateway. This was done by usecases interacting through data access interface with data access gateway.
