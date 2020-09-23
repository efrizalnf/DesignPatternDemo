package java.abstractfactory;

interface Arena {

    public static void start(){

    }
}

class ArenaEasy implements Arena{
    public void start(){
        System.out.println("Arena Easy");
    }
}
