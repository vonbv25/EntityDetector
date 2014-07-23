package Calais;

/**
 * Created by OJT4 on 7/22/2014.
 */
public class Relations {
    private String type;
    private String instance;

    public Relations() {
        type = null;
        instance = null;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public String getInstance() {
        return instance;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

