package UIs;

import Controllers.PostsSharingController.PostAPostController;
import Presenters.PostAPostPresenter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PostAPostUI extends ParentUI{
    /**
     * User interface for the user to post a post
     */

    @Override
    public void run() throws IOException {
        PostAPostController controller = new PostAPostController();
        PostAPostPresenter presenter = new PostAPostPresenter();
        List<String> pictures = new ArrayList<String>();

        String[] params = new String[3];

        System.out.println("Your Username: ");
        Scanner scanner = new Scanner(System.in);
        params[0] = scanner.nextLine();

        System.out.println("Content of the post: ");
        params[1] = scanner.nextLine();

        System.out.println("Location:");
        params[2] = scanner.nextLine();

        System.out.println("Want to add pictures? Type 'yes' and input a maximum of 9 pictures");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Please input picture " + 1);
            String url = scanner.nextLine();
            int i = 1;
            while (!url.isEmpty() && i != 10) {
                pictures.add(url);
                i++;
                System.out.println("Please input picture " + i);
                url = scanner.nextLine();
            }
        }
        controller.runPostAPost(params[0], params[1], params[2], pictures, presenter);

        System.out.println(presenter);
    }

//    public static void main(String[] args) {
//        List<String> pictures = new ArrayList<String>();
//        String[] params = new String[3];
//
//        System.out.println("Your Username: ");
//        Scanner scanner = new Scanner(System.in);
//        params[0] = scanner.nextLine();
//
//        System.out.println("Content of the post: ");
//        params[1] = scanner.nextLine();
//
//        System.out.println("Location:");
//        params[2] = scanner.nextLine();
//
//        System.out.println("Want to add pictures? Type 'yes' and input a maximum of 9 pictures");
//        String response = scanner.nextLine();
//        if (response.equalsIgnoreCase("yes")) {
//            System.out.println("Please input picture " + 1);
//            String url = scanner.nextLine();
//            int i = 1;
//            while (!url.isEmpty() && i != 10) {
//                pictures.add(url);
//                i++;
//                System.out.println("Please input picture " + i);
//                url = scanner.nextLine();
//            }
//        }
//        System.out.println(Arrays.toString(params));
//        System.out.println(pictures);
//    }
}
