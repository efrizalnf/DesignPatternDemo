package java.factorymethoddemo;

interface Animal {
   public static void speak(){

    }

    class Tiger implements Animal{
        public static void speak(){
            System.out.println("Roarrrr");
        }
    }

    class  Dog implements Animal{
        public static void speak() {
            System.out.println("gogogo");
        }
    }

    class Cat implements Animal{
       public static void speak(){
           System.out.println("Miawwww");
       }
    }

}
