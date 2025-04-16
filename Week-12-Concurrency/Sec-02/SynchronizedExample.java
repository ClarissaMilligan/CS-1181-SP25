public class SynchronizedExample
{
    public static final int NUM_THREADS = 4;
    public static void main(String[] args) throws InterruptedException
    {
        TaskManager tm = new TaskManager();
        WorkerThread[] threads = new WorkerThread[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++)
        {
            threads[i] = new WorkerThread(tm, i);
            threads[i].start();
        }

        // not necessarily required unless we have other tasks to complete in main
        // but does not hurt to add it and is *usually* needed as we often do have
        // more tasks to complete after our worker threads finish
        for (int i = 0; i < NUM_THREADS; i++)
        {
            threads[i].join();
        }
    }
}
