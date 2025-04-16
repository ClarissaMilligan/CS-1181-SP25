public class ThreadWorker extends Thread
{
    private ThreadManager boss;
    private int threadID = 0;

    public ThreadWorker(ThreadManager boss, int ID)
    {
        this.boss = boss;
        threadID = ID;
    }

    @Override
    public void run()
    {
        int jobIndex = boss.getNextJob();
        while (jobIndex != -1)
        {
            boss.doWork(jobIndex, threadID);
            jobIndex = boss.getNextJob();
        }
    }
}
