public class ThreadSynchronizedExample
{
    public static final int NUM_THREADS = 4;
    public static void main(String[] args)
    {
        ThreadManager tm = new ThreadManager();
        ThreadWorker[] threads = new ThreadWorker[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++)
        {
            threads[i] = new ThreadWorker(tm, i);
            threads[i].start();
        }

        // join is not required if we aren't doing anything else in main
        // but most of the time we will have more to do after the threads
        // complete their work
        for (int i = 0; i < NUM_THREADS; i++)
        {
            try
            {
                threads[i].join();
            }
            catch (InterruptedException ie)
            {
                System.out.println("oh no!");
            }
        }
    }
}
