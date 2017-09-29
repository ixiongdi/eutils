package gov.nih.nlm.ncbi.eutils.service.base;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;
import java.lang.reflect.ParameterizedType;
import java.net.URL;
import java.util.Map;
import java.util.logging.Logger;

public class EBase<T> {

    private static final Logger logger = Logger.getGlobal();

    private String buildURL(String baseURL, Map<String, String> parameters) {
        StringBuilder sb = new StringBuilder(baseURL);

        if (parameters.isEmpty()) {
            return sb.toString();
        } else {
            sb.append("?");

            for (String key : parameters.keySet()) {
                sb.append(key);
                sb.append("=");
                sb.append(parameters.get(key));
                sb.append("&");
            }

            sb.deleteCharAt(sb.length() - 1);

            return sb.toString();
        }
    }

    private Class<T> getTClass() {
        Class<T> tClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return tClass;
    }

    protected T run(String baseURL, Map<String, String> parameters) throws Exception {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        saxParserFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        saxParserFactory.setFeature("http://xml.org/sax/features/validation", false);

        XMLReader xmlReader = saxParserFactory.newSAXParser().getXMLReader();

        URL url = new URL(buildURL(baseURL, parameters));
        logger.info(url.toString());

        InputSource inputSource = new InputSource(url.openStream());
        SAXSource source = new SAXSource(xmlReader, inputSource);


        JAXBContext jaxbContext = JAXBContext.newInstance(getTClass());
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        T eInfoResult = (T) unmarshaller.unmarshal(source);

        logger.info(eInfoResult.toString());

        return eInfoResult;
    }

//    public EInfoResult run(Map<String, String> map) throws Exception {
//
//        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
//
//        saxParserFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
//        saxParserFactory.setFeature("http://xml.org/sax/features/validation", false);
//
//        URL url = new URL(buildURL(map));
//
//        logger.info(url.toString());
//
//        JAXBContext jaxbContext = JAXBContext.newInstance(EInfoResult.class);
//
//        XMLReader xmlReader = saxParserFactory.newSAXParser().getXMLReader();
//        InputSource inputSource = new InputSource(url.openStream());
//        SAXSource source = new SAXSource(xmlReader, inputSource);
//
//        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//
//        EInfoResult eInfoResult = (EInfoResult) unmarshaller.unmarshal(source);
//
//        logger.info(eInfoResult.toString());
//
//        return eInfoResult;
//    }
}
