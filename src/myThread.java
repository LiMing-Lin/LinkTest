public class myThread {


    public static void main(String[] args) {
        myThreadtest thread1 = new myThreadtest();
        thread1.start();

        for (int i = 0; i < 100; i++) {
            if( i % 2 == 0){
                System.out.println( Thread.currentThread().getName() + i);
            }
        }

    }
}

class myThreadtest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if( i % 2 == 0){
                System.out.println( myThreadtest.currentThread().getName() + i);
            }
        }
    }
}