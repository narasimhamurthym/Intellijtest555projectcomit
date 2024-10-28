interface Ani {
    void noise();
}
    class Dogee implements Ani
    {
     public  void noise(){
          System.out.println("Barking BOW BOW");
      }

    }class Catee implements Ani {
        public  void noise(){

            System.out.println("MEOW MEOW");
        }

    }


public class AbstractionWithInterface {
    public static void main(String[] args) {
        Ani Dogvoice= new Dogee();
        Ani Catvoice=new Catee();
        Dogvoice.noise();
        Catvoice.noise();


    }
}
