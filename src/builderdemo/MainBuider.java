package builderdemo;

public class MainBuider {

    public static void main(String[] args) {
        CustomerBuilder customerBuilder;
        customerBuilder = new CustomerBuilder()
                .setName("Lilis")
                .setId("1")
                .setAddress("Bandung")
                .setEmail("aan@gmail.com")
                .build();
        CustomerBuilder customerBuilder1 = new CustomerBuilder()
                .setEmail("nurjanah@gmail.com")
                .setName("nurjanah")
                .build();
        System.out.println(customerBuilder1);
        System.out.println(customerBuilder);
    }
}
