package java.singletondemo;

public class MainSingleton {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.save("0001");


    }
}
