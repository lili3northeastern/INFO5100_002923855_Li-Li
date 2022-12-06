package Exercise.Exercise5;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
import javax.xml.parsers.*;

public class XMLUtil {
    public static Object getBean() {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("XMLUtil.xml"));

            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String className = classNode.getNodeValue();


            Class<?> c = Class.forName(className);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
