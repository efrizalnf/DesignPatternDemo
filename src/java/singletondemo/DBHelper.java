package java.singletondemo;

import java.sql.Connection;

public class DBHelper {
    private static Connection connection;

    public static Connection getConnections(){
        if(connection==null){
//            connection = new Connection();
        }
        return connection;
    }
}
