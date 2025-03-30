class SaleTicket implements Runnable{
    int ticket  = 100;
    Object o = new Object();
    @Override
    public void run() {
        while(true){

            synchronized ( o ){
                if( ticket > 0){
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "售票一张，票号为：" + ticket);
                    ticket--;
                }
                else{
                    break;
                }
            }

        }
    }
}
public class SaleTicketTest {
    public static void main(String[] args) {
        SaleTicket s = new SaleTicket();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
