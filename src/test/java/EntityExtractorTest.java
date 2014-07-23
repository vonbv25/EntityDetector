import Calais.Entity;
import Driver.EntityExtractor;
import Driver.OpenCalaisConfiguration;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by OJT4 on 7/21/2014.
 */
public class EntityExtractorTest {

    public static  String test= "The Constitution of the Philippines " +
            "(Filipino: Saligang Batas ng Pilipinas), popularly known as the 1987 Constitution, " +
            "is the constitution or the supreme law of the Republic of the Philippines. " +
            "It was enacted in 1987, during the administration of President Corazon C. Aquino";

    public static  String APIKEY = "ksgda5hzzy6wz8xtcunjjsn5";
    public static  String[] name;
    public static  String[] type;
    public static  String[] instances;
    public static  String[] relevancies;
    public static  StringReader reader;

    List<Entity> entities;
    @Before
    public void setUp() {
        entities = new ArrayList<Entity>();
        name = new String[] {
                "President",
                "Philippines",
                "Corazon C. Aquino",
                "supreme law"
        };
        type = new String[] {
                "Position",
                "Country",
                "Person",
                "IndustryTerm"
        };
        instances = new String[] {
          "[{detection=[enacted in 1987, during the administration of ]President[ Corazon C. Aquino], " +
                  "prefix=enacted in 1987, during the administration of , " +
                  "exact=President, suffix= Corazon C. Aquino, offset=247, length=9}]",
            "[{detection=[The Constitution of ]the Philippines[ (Filipino: Saligang Batas ng Pilipinas),]," +
                    " prefix=The Constitution of , exact=the Philippines, suffix= (Filipino: Saligang Batas ng Pilipinas),," +
                    " offset=20, length=15}, {detection=[is the constitution or the supreme law of the ]" +
                    "Republic of the Philippines[. It was enacted in 1987, during the], " +
                    "prefix=is the constitution or the supreme law of the , exact=Republic of the Philippines, suffix=. " +
                    "It was enacted in 1987, during the, offset=165, length=27}]",
            "[{detection=[in 1987, during the administration of President ]Corazon C. Aquino[], " +
                    "prefix=in 1987, during the administration of President , exact=Corazon C. Aquino, offset=257, length=17}]",
             "[{detection=[1987 Constitution, is the constitution or the ]supreme law[ " +
                     "of the Republic of the Philippines. It was], prefix=1987 Constitution, " +
                     "is the constitution or the , exact=supreme law, suffix= of the Republic of the Philippines. " +
                     "It was, offset=146, length=11}]"
        };
        relevancies = new String[] {
                "0.343",
                "0.543",
                "0.343",
                "0.486",
        };
        reader = new StringReader(test);

    }

    @Test
    public void testExtractor() {
        OpenCalaisConfiguration openCalaisConfiguration =
                OpenCalaisConfiguration.OpenCalaisConfigurationBuilder.create(APIKEY).build();
        EntityExtractor entityExtractor = new EntityExtractor();
        entities = entityExtractor.Extractor(reader,openCalaisConfiguration);
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        assertFalse(entities.isEmpty());

        for (Entity entity: entities) {
            assertEquals(entity.getName(),name[i++]);
            assertEquals(entity.getInstances(),instances[j++]);
            assertEquals(entity.getType(),type[k++]);
            assertEquals(entity.getRelevancies(),relevancies[l++]);
        }
    }

}

