package com.company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger logger = LogManager.getLogger();

    private static final String xmlPath = "d:\\out.xml";
    private static final String xsdPath = "d:\\out.xsd";

    public static void main(String[] args) {

        if (XmlManage.validateXMLSchema(xsdPath, xmlPath)) {
            logger.info("XML is correct!");
        } else {
            logger.info("XML is incorrect!");
            return;
        }

        if(dbMigrate.migrateDB(xmlPath, xsdPath,
                "jdbc:mysql://localhost:3307/servers?serverTimezone=Europe/Moscow&useSSL=false",
                "root", "358132134Mm")) {
            System.out.println("Data is migrated successfully!");
        }else {
            System.out.println("Error while process migrating!");
        }

    }
}
