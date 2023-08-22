package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        DB db = new DB();
        db.dbConnect(
                "jdbc:sqlserver://DESKTOP-F63GOIU\\SQLEXPRESS:51446;databaseName=first_db;;encrypt=true;trustServerCertificate=true;",
                "sa", "12");

    }

    class DB {
        public DB() {
        }

        public void dbConnect(String db_connect_string, String db_userid, String db_password) {
            try {
                Connection conn = DriverManager.getConnection(db_connect_string, db_userid, db_password);
                System.out.println("connected");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

}