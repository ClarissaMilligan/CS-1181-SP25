public class TaskManager
{
    // does not need to be volatile in this specific case because it is only accessed via the synchronized method
    private static int nextJob = 0;
    public int[] work = {5, 5, 15, 7, 3, 16};

    public synchronized int getNextJob()
    {
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
            System.out.println("woops");
        }

        nextJob++;
        return job;
    }

    public void doWork(int value, int threadID)
    {
        System.out.println("THREAD " + threadID + " STARTS TASK " + value);
        for (int i = 0; i < work[value]; i++)
        {
            System.out.println(threadID + ": " + i);
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException ie)
            {
                System.out.println("oh no!");
            }
        }
    }
}
