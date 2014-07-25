import com.Data_objects_OLD.Entity;
import com.Data_objects_OLD.NameEntity;
import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by OJT4 on 7/18/2014.
 */


public class JacksonTest {

    public static final String TEST_ENTITY_NAME = "TestEntity";
    public static final String TEST_ENTITY_JSON = "{\"attributes\":{},\"name\":\"TestEntity\",\"size\":0}";

    protected Entity testEntity;

    @Before
    public void setUp(){
        testEntity = new NameEntity();
        testEntity.setName(TEST_ENTITY_NAME);
    }

    @Test
    public void testEntityToString() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(testEntity);
        System.out.println(result);
        assertFalse(StringUtils.isBlank(result));
    }

    @Test
    public void testStringToEntity() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Entity resultEntity = mapper.readValue(TEST_ENTITY_JSON, NameEntity.class);
        assertEquals(testEntity, resultEntity);
    }
}
