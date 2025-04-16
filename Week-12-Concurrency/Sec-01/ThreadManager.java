public class ThreadManager
{
    // should not actually need to be volatile in this exact situation because
    // it is only accessed via a synchronized method
    private static int nextJob = 0;
    private static int work[] = {3, 3, 14, 16, 7, 4, 2};
    public static final int NUM_JOBS = work.length;

    public synchronized int getNextJob()
    {
        if (nextJob > NUM_JOBS - 1)
        {
            return -1;
        }
        int job = nextJob;

        // this pause is here to illustrate the need for the synchronized keyword
        // remove the synchronized keyword to see the race condition occur
        // (skipped and duplicated work)
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException ie)
        {
            System.out.println("oops");
        }

        nextJob++;
        return job;
    }

    public void doWork(int index, int threadID)
    {
        System.out.println("THREAD #" + threadID + " STARTS JOB #" + index);
        for (int i = 1; i <= work[index]; i++)
        {
            System.out.println("Thread #" + threadID + ": " + i);
            try
            {
                Thread.sleep(250);
            }
            catch (InterruptedException ie)
            {
                System.out.println("Uh oh!");
            }
        }
    }
}
