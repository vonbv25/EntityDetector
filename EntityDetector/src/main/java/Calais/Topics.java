package Calais;

/**
 * Created by OJT4 on 7/22/2014.
 */
public class Topics {
    private String categoryName;
    private int score;

    public Topics() {
        categoryName = null;
        score = 0;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
