package Driver;


import Calais.Entity;
import mx.bigdata.jcalais.CalaisObject;
import mx.bigdata.jcalais.CalaisResponse;

import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * Created by OJT4 on 7/18/2014.
 */
public class EntityExtractor  {

public static List<Entity> Extractor(URL url, OpenCalaisConfiguration calaisConfiguration) {
    List <Entity> entities = new ArrayList<Entity>();
    try {
        CalaisResponse response = calaisConfiguration.runAnalyzer().analyze(url,calaisConfiguration.runConfig());

        for (CalaisObject obj: response.getEntities()) {
            Entity entity = new Entity();
            entity.setType(obj.getField("_type"));
            entity.setName(obj.getField("name"));
            entity.setInstances(obj.getField("instances"));
            entity.setRelevancies(obj.getField("relevance"));
            entities.add(entity);
        }
    }
    catch (IOException e) {
        e.printStackTrace();
    }
    return entities;
}

    public List<Entity> Extractor(StringReader reader, OpenCalaisConfiguration calaisConfiguration) {
        List <Entity> entities = new ArrayList<Entity>();
        try {
            CalaisResponse response = calaisConfiguration.runAnalyzer().analyze(reader,calaisConfiguration.runConfig());

            for (CalaisObject obj: response.getEntities()) {
                Entity entity = new Entity();
                entity.setType(obj.getField("_type"));
                entity.setName(obj.getField("name"));
                entity.setInstances(obj.getField("instances"));
                entity.setRelevancies(obj.getField("relevance"));
                entities.add(entity);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return entities;
    }





}
