class Multithreading extends Thread {
    public void run() {
        try {
            SingletonChocolateBoiler.getInstance();
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}

public class Multithread {
    public static void main(String []args) throws InterruptedException {
        int n = 8;
        for (int i = 0; i < n; i++) {
            Multithreading object = new Multithreading();
            object.start();
            object.join();
        }
    }
}

