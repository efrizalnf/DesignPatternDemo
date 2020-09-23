package kotlin.singleton

import java.singletondemo.OrderService

class App {
    fun main(args: Array<String>) {
        val orderService = OrderService()
        orderService.save("0001")
    }
}