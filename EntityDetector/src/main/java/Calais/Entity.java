package Calais;

import java.io.Serializable;

/**
 * Created by OJT4 on 7/22/2014.
 */
public class Entity{

    private String name;
    private String instances;
    private String type;
    private String relevancies;

    public Entity() {
        name = null;
        instances = null;
        relevancies = null;
//        relevancies = 0;

    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstances(String instances) {
        this.instances = instances;
    }

    public void setRelevancies(String relevancies) {
        this.relevancies = relevancies;
    }

    public String getType() {
        return type;
    }

    public String getRelevancies() {
        return relevancies;
    }


    public String getInstances() {
        return instances;
    }

    public String getName() {
        return name;
    }
}
