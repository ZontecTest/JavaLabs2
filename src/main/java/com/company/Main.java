package com.company;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.*;

public class Main {

    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        if(main.java.com.company.dbMigrate.migrateDB("<xml path>", "<xsd path>",
                "<url>",
                "<user>", "<password>")) {
            System.out.println("Data is migrated successfully!");
        }else {
            System.out.println("Error while process migrating!");
        }
        return;
    }
}
