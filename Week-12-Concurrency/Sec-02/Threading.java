public class Threading
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t1 = new CountingThread();
        Thread t2 = new LettersThread();

        t1.start();
        t2.start();

        t2.join();

        System.out.println("End done!");

        t1.join();

        System.out.println("End actually done!!");
    }
}
