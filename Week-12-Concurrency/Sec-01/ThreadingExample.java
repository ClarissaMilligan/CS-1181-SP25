public class ThreadingExample
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t1 = new CountUpThread();
        Thread t2 = new CountNegativeThread();

        t1.start();
        t2.start();

        t1.join();

        System.out.println("T1 is done!!!");

        t2.join();

        System.out.println("My program is done!!!");
    }
}
