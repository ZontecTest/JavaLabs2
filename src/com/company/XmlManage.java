package com.company;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.*;

public abstract class XmlManage {

    private static final Logger logger = LogManager.getLogger();

    public static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        logger.info("XML validate started!");
        try {

            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException e) {
            logger.error("Exception: " + e.getMessage());
            return false;
        } catch (org.xml.sax.SAXException e1) {
            logger.error("SAX Exception: " + e1.getMessage());
            return false;
        }
        return true;
    }

}
