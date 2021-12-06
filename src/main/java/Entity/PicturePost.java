package Entity;

import java.io.File;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class PicturePost extends ParagraphPost implements Serializable {

    /**
     * A child class of ParagraphPost. Has everything ParagraphPost has.
     * Included pictures attribute which is a list of picture files.
     */

    private final List<String> pictures;

    /**
     * Creates PicturePost that contains pictures
     * @param POSTTIME When it is posted
     * @param location Location
     * @param description Description of the Post
     * @param pictures List of pictures urls
     */

    public PicturePost(String username, LocalDateTime POSTTIME, String location, String description, List<String> pictures){
        super(username , POSTTIME, location, description);
        this.pictures = pictures;
    }

    public List<String> getPictures(){return pictures;}

    @Override
    public String toString() {
        return super.toString() + "\n" + "Pictures: " + pictures;
    }

    public static void main(String[] args) {
        List<String> pictures = new ArrayList<String>();
        pictures.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.planetware.com%2Fwpimages%2F2020%2F02%2Ffrance-in-pictures-beautiful-places-to-photograph-eiffel-tower.jpg&imgrefurl=https%3A%2F%2Fwww.planetware.com%2Fpictures%2Ffrance-f.htm&tbnid=YXgcNflll9kS8M&vet=12ahUKEwi2iun_rc70AhU4sHIEHTW3BPoQMygAegUIARCjAg..i&docid=0N6qTt3P-PlepM&w=730&h=487&itg=1&q=picture&ved=2ahUKEwi2iun_rc70AhU4sHIEHTW3BPoQMygAegUIARCjAg" + "\n");
        pictures.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fichef.bbci.co.uk%2Fnews%2F999%2Fcpsprodpb%2F15951%2Fproduction%2F_117310488_16.jpg&imgrefurl=https%3A%2F%2Fwww.bbc.co.uk%2Fnews%2Fin-pictures-56211135&tbnid=Hc5jHkS6Vw5sZM&vet=12ahUKEwi2iun_rc70AhU4sHIEHTW3BPoQMygKegUIARC3Ag..i&docid=aPImLvUOjpk0SM&w=999&h=749&itg=1&q=picture&ved=2ahUKEwi2iun_rc70AhU4sHIEHTW3BPoQMygKegUIARC3Ag");
        PicturePost post = new PicturePost("lucas", LocalDateTime.now(), "Toronto", "hahaahah", pictures);
        System.out.println(post.toString());
    }
}