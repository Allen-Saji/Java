package primepackage;
import java.io.FileWriter;
import java.io.IOException;



class OddThread extends Thread{
    public void run() {
        try {
            FileWriter fw = new FileWriter("odd.txt");
            int i=1;
            while(i<100) {
                fw.write(i+" ");
//                System.out.println("Odd number: " + i);
                i += 2;
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class EvenThread extends Thread{
    public void run(){
        try {
            FileWriter fw = new FileWriter("even.txt");
            int i=2;
            while(i<=100){
                fw.write(i+" ");
//            System.out.println("Even number: "+i);
                i+=2;
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class OddEvenThreads {
    public static void main(String[] args) throws IOException {
        OddThread ot = new OddThread();
        EvenThread et = new EvenThread();
        ot.setPriority(3);
        et.setPriority(2);
        ot.start();
        et.start();
    }
}


