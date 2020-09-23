package factorymethoddemo;

public class Main {

    public static void main(String[] args) {
        FactoryMethodAnimal factoryMethodAnimal = (FactoryMethodAnimal) FactoryMethodAnimal.create("tiger");
        System.out.println();
    }
}
