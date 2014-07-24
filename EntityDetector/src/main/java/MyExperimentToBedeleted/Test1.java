package MyExperimentToBedeleted;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import javax.swing.text.html.HTMLDocument;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/**
 * Created by OJT4 on 6/30/2014.
 */
public class Test1 {


    public static void main(String[] args) throws Exception {
        final WebClient webClient = new WebClient(BrowserVersion.FIREFOX_24);
        final HtmlPage htmlPage = webClient.getPage("http://www.majorgeeks.com/");
        //System.out.println(htmlPage.asText();
        final List<DomElement> divs = htmlPage.getElementsByTagName("div");
        for (DomElement div : divs) {
//             if (div.getAttribute("class").equals("geekydate") ){
//                 System.out.println(div.getFirstChild().getNodeValue());
//
//             }
            if (div.getAttribute("class").equals("pageheader")) {
//                    Iterator iterator = div.getChildElements().iterator();
//                    while (iterator.hasNext()) {
//                        System.out.println( );
//                    }

            }
        }




        System.out.print(divs.size());

        System.out.println();
    }
}
