package Driver;

import Calais.Relations;
import mx.bigdata.jcalais.CalaisObject;
import mx.bigdata.jcalais.CalaisResponse;

import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by OJT4 on 7/17/2014.
 */
public class RelationExtrator {


    public static List<Relations> Extractor(URL url, OpenCalaisConfiguration openCalaisConfiguration) {
        List<Relations> relationsList = new ArrayList<Relations>();

        try{
            CalaisResponse response = openCalaisConfiguration.runAnalyzer().analyze(url,openCalaisConfiguration.runConfig());

            for (CalaisObject obj: response.getRelations()) {
                Relations relations = new Relations();
                relations.setType(obj.getField("type"));
                relations.setInstance(obj.getField("instances"));
                relationsList.add(relations);
           }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return relationsList;
    }
    public static List<Relations> Extractor(StringReader reader, OpenCalaisConfiguration openCalaisConfiguration) {
        List<Relations> relationsList = new ArrayList<Relations>();

        try{
            CalaisResponse response = openCalaisConfiguration.runAnalyzer().analyze(reader,openCalaisConfiguration.runConfig());

            for (CalaisObject obj: response.getRelations()) {
                Relations relations = new Relations();
                relations.setType(obj.getField("type"));
                relations.setInstance(obj.getField("instances"));
                relationsList.add(relations);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return relationsList;
    }
}
