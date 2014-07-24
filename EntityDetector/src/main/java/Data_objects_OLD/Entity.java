package Data_objects_OLD;

/**
 * Created by OJT4 on 7/14/2014.
 */
public abstract class Entity {
    protected int size;
    protected String name;

    protected Entity() {
        name = "";
        size = 0;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int get_size() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity)) return false;

        Entity entity = (Entity) o;

        if (size != entity.size) return false;
        if (!name.equals(entity.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + name.hashCode();
        return result;
    }

    public static class AttributeElements {

        private String _key;
        private Object _value;

        public AttributeElements() {
            super();
        }

        public Object get_value() {
            return _value;
        }

        public String get_key() {
            return _key;
        }

        public void set_key(String key) {
            this._key = key;
        }

        public void set_value(Object _value) {
            this._value = _value;
        }

        @Override
        public String toString() {
            return _key + ": " + _value.toString();
        }

    }

}
