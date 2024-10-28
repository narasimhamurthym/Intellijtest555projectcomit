abstract class NewImplementatio{
      protected abstract void chat(int version, String name);
     public abstract  void call();
     double sum()
      {
          final double pi=3.142;
          int r=10;
          //double result=pi*r*r;
          return pi*r*r;

     }
}
class Subclassimp extends NewImplementatio{

     protected void chat(int version, String name)
    {

        System.out.println(version +" "+ name);
    }
     public void call()
     {
         System.out.println("implementing the video call feature");
     }
}
public class AbstactmethodandClass {
    public static void main(String[] args) {
        Subclassimp  sus= new Subclassimp();
          sus.chat(5,"whatsAPP");
         double st= sus.sum();
        System.out.println(st);
        sus.call();
    }
}
