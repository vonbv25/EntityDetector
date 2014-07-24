import mx.bigdata.jcalais.CalaisClient;
import mx.bigdata.jcalais.CalaisObject;
import mx.bigdata.jcalais.CalaisResponse;
import mx.bigdata.jcalais.rest.CalaisRestClient;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by OJT4 on 7/8/2014.
 */
public class initialTest {


    @Test
    public void testRelations() throws Exception{
        CalaisClient client = new CalaisRestClient("ksgda5hzzy6wz8xtcunjjsn5");
        CalaisResponse response = client.analyze("Prosecutors at the trial of former Liberian President Charles Taylor \" \n" +
                "           + \" hope the testimony of supermodel Naomi Campbell \" \n" +
                "           + \" will link Taylor to the trade in illegal conflict diamonds, \"\n" +
                "           + \" which they say he used to fund a bloody civil war in Sierra Leone.");

        String[] checker = new String[] {"Trial","PersonCareer","GenericRelations"};
        int i = 0;
        for (CalaisObject relation: response.getRelations()) {
                Assert.assertEquals(relation.getField("_type"),checker[i++]);
        }
    }

    @Test
    public void testEntities() throws Exception {

    }




}
