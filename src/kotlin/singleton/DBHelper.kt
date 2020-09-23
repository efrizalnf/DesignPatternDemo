package kotlin.singleton

import java.singletondemo.DBHelper
import java.sql.Connection

class DBHelper {
    lateinit var conn: Connection

    @JvmName("getConn1")
    fun getConn(): Connection? {
        if (conn == null) {
            conn = conn
        }
        return conn
    }

}

