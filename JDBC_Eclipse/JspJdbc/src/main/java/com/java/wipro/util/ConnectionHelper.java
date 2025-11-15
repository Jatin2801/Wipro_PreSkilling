package com.java.wipro.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

public class ConnectionHelper {

    public static Connection getConnection() {
        Connection con = null;
        try {
            InputStream input = ConnectionHelper.class.getClassLoader().getResourceAsStream("db.properties");
            if (input == null) {
                System.out.println("❌ db.properties not found in classpath");
                return null;
            }

            Properties prop = new Properties();
            prop.load(input);

            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            String user = prop.getProperty("user");
            String password = prop.getProperty("password");

            System.out.println("✅ Loading driver: " + driver);
            System.out.println("✅ Connecting to: " + url);

            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Database connection successful");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
