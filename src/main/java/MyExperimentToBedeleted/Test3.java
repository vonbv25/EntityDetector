package MyExperimentToBedeleted;

import gate.Gate;
import mx.bigdata.jcalais.CalaisClient;
import mx.bigdata.jcalais.CalaisConfig;
import mx.bigdata.jcalais.CalaisObject;
import mx.bigdata.jcalais.CalaisResponse;
import mx.bigdata.jcalais.rest.CalaisRestClient;
import org.junit.Assert;

import java.util.Iterator;

/**
 * Created by OJT4 on 7/14/2014.
 */
public class Test3 {
    public static void main(String[] args) throws Exception{
        CalaisClient client = new CalaisRestClient("ksgda5hzzy6wz8xtcunjjsn5");
        CalaisConfig config = new CalaisConfig();
//        config.set(CalaisConfig.ConnParam.CONNECT_TIMEOUT, null);
//        config.set(CalaisConfig.ConnParam.READ_TIMEOUT, null);
        config.set(CalaisConfig.UserParam.EXTERNAL_ID, null);
        config.set(CalaisConfig.ProcessingParam.CALCULATE_RELEVANCE_SCORE, null);

        CalaisResponse response = client.analyze("The Constitution of the Philippines " +
                "(Filipino: Saligang Batas ng Pilipinas), popularly known as the 1987 Constitution, " +
                "is the constitution or the supreme law of the Republic of the Philippines. " +
                "It was enacted in 1987, during the administration of President Corazon C. Aquino",config);
//        CalaisResponse response = client.analyze("Three Russian soldiers died and six were " +
//                "wounded when a Russian military truck blew up a rebel mine near the southern village of Alkhan-Yurt.\n" +
//                "\n",config);




//            CalaisObject object = response.getInfo();
//        System.out.println(object.toString());

//

        for (CalaisObject entity : response.getEntities()) {
//            System.out.println(entity.toString());
            Iterator it = entity.getList("instances").iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
//        {"name":"TestEntity","attributes":{},"_size":0}

//        System.out.print("\n");
//        for (CalaisObject entity : response.getRelations()) {
//            System.out.println(entity.toString());
//        }
//        System.out.print("\n");
//        for (CalaisObject entity : response.getTopics()) {
//            System.out.println(entity.toString());
//        }
//        System.out.print("\n");
//        for (CalaisObject entity : response.getSocialTags()) {
//            System.out.println(entity.toString());
//        }



//        {_typeGroup=entities, _type=Country, name=Liberia, _typeReference=http://s.opencalais.com/1/type/em/e/Country,
// instances=[{detection=[at the trial of former ]Liberian[ President Charles Taylor "
//            + " hope], prefix=at the trial of former , exact=Liberian, suffix= President Charles Taylor "
//                    + " hope, offset=35, length=8}], relevance=0.607, _uri=http://d.opencalais.com/genericHasher-1/58443e1a-67cb-34ab-87e3-986eaa86077d}

//        {_typeGroup=relations, _type=Trial, _typeReference=http://s.opencalais.com/1/type/em/r/Trial, person=http://d.opencalais.com/pershash-1/f12f7d01-e85f-3a0b-8d67-5705d72ce296, instances=[{detection=[Prosecutors at ]the trial of former Liberian President Charles Taylor[ "
//            + " hope the testimony of], prefix=Prosecutors at , exact=the trial of former Liberian President Charles Taylor, suffix= "
//                    + " hope the testimony of, offset=15, length=53}], _uri=http://d.opencalais.com/genericHasher-1/6727ebd0-ba73-302e-904d-de885035e4d1}

//        {_typeGroup=topics, category=http://d.opencalais.com/cat/Calais/Politics, classifierName=Calais,
// categoryName=Politics, score=1, _uri=http://d.opencalais.com/dochash-1/fb72adc2-4a95-3b81-896d-2eaa83a12c65/cat/1}

    //{_typeGroup=socialTag, id=http://d.opencalais.com/dochash-1/fb72adc2-4a95-3b81-896d-2eaa83a12c65/SocialTag/12,
    // socialTag=http://d.opencalais.com/genericHasher-1/ea31334e-799c-3064-82e9-c2772a373029,
        // name=Law_Crime, importance=1, _uri=http://d.opencalais.com/dochash-1/fb72adc2-4a95-3b81-896d-2eaa83a12c65/SocialTag/12}
    }
}
