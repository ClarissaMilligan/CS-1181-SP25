public class WorkerThread extends Thread
{
    private TaskManager boss;
    private int ID = 0;

    public WorkerThread(TaskManager boss, int ID)
    {
        this.boss = boss;
        this.ID = ID;
    }

    public void run()
    {
        int work = boss.getNextJob();
        while (work < boss.work.length)
        {
            boss.doWork(work, ID);
            work = boss.getNextJob();
        }
    }
}
