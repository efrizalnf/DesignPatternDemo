package kotlin.singleton

import java.singletondemo.DBHelper

class OrderService {
    fun save(idString: String){
        DBHelper.getConnections().nativeSQL("INSERT INTO...");
    }
}