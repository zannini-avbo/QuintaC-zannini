import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Thread> myThread = new ArrayList<Thread>();
        for (int i = 0; i < 10; i++) {
            HelloWorld obj = new HelloWorld(i);
            myThread.add(new Thread(obj));
        }

        for (int i = 0; i < 10; i++) {
            myThread.get(i).start();
        }
      

      System.out.println("This code is outside of the thread");
    }
  }