package Data_objects_OLD;

import com.google.common.collect.AbstractIterator;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by OJT4 on 7/14/2014.
 */
public class NameEntity extends Entity {

    private String name = null;

    private Hashtable<String , Object> attributes;

    public NameEntity() {
        this.attributes = new Hashtable<String, Object>();
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Hashtable getAttributes() {
        return attributes;
    }

    public void setAttributes(Hashtable<String, Object> attributes) {
        this.attributes = attributes;
    }


    public Object getValue (String attribute) {
        return attributes.get(attribute);
    }


    public Iterator<AttributeElements> iterate() {
        return new AttributeIterator();
    }

    public final class AttributeIterator
            extends AbstractIterator<AttributeElements> {

        private AttributeElements attributeElements = new AttributeElements();
        private Hashtable _attributeTable;

        private AttributeIterator() {
            this._attributeTable= attributes;
        }


        @Override
        protected AttributeElements computeNext() {
            Enumeration keys =_attributeTable.keys();
            String key;
            Object value;
            while (keys.hasMoreElements()) {
                key = (String) keys.nextElement();
                value = _attributeTable.get(key);
                attributeElements.set_key(key);
                attributeElements.set_value(value);
            }
            return attributeElements;
        }
    }



}
