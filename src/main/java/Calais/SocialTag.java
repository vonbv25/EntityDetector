package Calais;

/**
 * Created by OJT4 on 7/22/2014.
 */
public class SocialTag {
    private String name;
    private int importance;
    private String originalValue;

    public SocialTag() {
        name = null;
        importance = 0;
        originalValue = null;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public int getImportance() {
        return importance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }

    public String getOriginalValue() {
        return originalValue;
    }

}
