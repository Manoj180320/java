import java.util.*;

class producer implements Runnable
{
    private Queue<Integer> que;
    private int maxSize;
    public producer(Queue<Integer> que,int maxSize)
    {
        this.que=que;
        this.maxSize=maxSize;
    }
    public void run()
    {
        try
        {
            for(int i=0;i<20;i++)
            {
                synchronized(que)
                {
                    while(que.size()== maxSize)
                    {
                        System.out.println("Queue is full,producer is waiting...");
                        que.wait();
                    }
                    System.out.println("Producer produces "+ i);
                    que.add(i);
                    que.notifyAll();
                }
                Thread.sleep(500);
            }

        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }
}

class consumer implements Runnable
{
    private Queue<Integer> que;
    consumer(Queue<Integer> que)
    {
        this.que=que;
    }
    public void run()
    {
        try
        {
            while(true)
            {
                synchronized(que)
                {
                    while(que.isEmpty())
                    {
                        System.out.println("Queue is empty , Consumer is waiting....");
                        que.wait();
                    }
                    int item=que.poll();
                    System.out.println("consumer consumes:"+item);
                    que.notifyAll();
                }
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }
}

public class Producer_Consumer {

    public static void main(String[] args) {

        Queue<Integer> que=new LinkedList();
        int maxSize=5;
        producer produce=new producer(que,maxSize);
        consumer consume=new consumer(que);
        Thread t1=new Thread(produce);
        Thread t2=new Thread(consume);
        t1.start();
        t2.start();
        try
        {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}
