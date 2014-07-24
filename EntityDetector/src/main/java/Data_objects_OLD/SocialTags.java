package Data_objects_OLD;

/**
 * Created by OJT4 on 7/15/2014.
 */
public class SocialTags {

    private String tagName;
    private double rating;

    public SocialTags() {
        tagName = null;
        rating = 0;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }


    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

}
