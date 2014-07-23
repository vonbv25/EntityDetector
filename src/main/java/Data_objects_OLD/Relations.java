package Data_objects_OLD;

import java.util.List;

/**
 * Created by OJT4 on 7/15/2014.
 */
public class Relations {

    private List<Class> classes;

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public Class get(int index) {
        return classes.get(index);
    }

    public void set(Class Class, int index) {
        this.classes.set(index,Class);
    }

    public void add(Class aclass) {
        classes.add(aclass);
    }


}
