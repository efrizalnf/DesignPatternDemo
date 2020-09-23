package factorymethoddemo;

public class FactoryMethodAnimal {

    public static Animal create(String type) {
        if (type == "tiger") {
            return new Animal.Tiger();
        } else if (type == "dog") {
            return new Animal.Dog();
        } else if (type == "cat") {
            return new Animal.Cat();
        }
        return null;
    }
}
