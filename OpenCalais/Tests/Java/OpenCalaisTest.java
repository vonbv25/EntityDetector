import com.ojt1.Calais;
import com.ojt1.CalaisSoap;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * Created by OJT4 on 7/24/14.
 */
public class OpenCalaisTest {
    private String API = "ksgda5hzzy6wz8xtcunjjsn5";
    private String testContent = "The Constitution of the Philippines  +\n" +
            "            (Filipino: Saligang Batas ng Pilipinas), popularly known as the 1987 Constitution, +\n" +
            "            is the constitution or the supreme law of the Republic of the Philippines.  +\n" +
            "            It was enacted in 1987, during the administration of President Corazon C. Aquino";

    private void testRun() {
        Calais service = new Calais();
        CalaisSoap port= service.getCalaisSoap();
        String paramsXML ="";

        String line;

        try{
            FileReader input = new FileReader(OpenCalaisTest.class.getResource("paramsXML.xml").getFile());
            BufferedReader bufRead = new BufferedReader(input);

            while((line=bufRead.readLine())!=null){
                paramsXML+= line;
                System.out.println(line);

            }
        }catch(IOException e){
            System.out.println(e);
        }

        String result = port.enlighten(API,testContent,paramsXML);
        System.out.println("Result = "+result);
    }

    @Test
    public void runTest1(){
        testRun();
    }


}
