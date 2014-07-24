package Data_objects_OLD;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OJT4 on 7/14/2014.
 */
public class Class {

    private String className;
    private List<Entity> entities;

    public Class() {
        entities = new ArrayList<Entity>();

    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int get_size() {
        return entities.size();
    }
    public List<Entity> getEntities() {
        return entities;
    }
    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public Entity get(int index) {
        return entities.get(index);
    }

    public void set(Entity entity, int index) {
        this.entities.set(index, entity);
    }

    public void add(Entity entity) {
        entities.add(entity);
    }

}
