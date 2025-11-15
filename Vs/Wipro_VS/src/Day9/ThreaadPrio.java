package Day9;

public class ThreaadPrio {
    public static void main(String[] args) {
        Thread t1 = new Thread(new SampleThread("T1"));
        Thread t2 = new Thread(new SampleThread("T2"));
        SampleThread t3 = new SampleThread("T3");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        t1.setPriority(3);
        t2.setPriority(5);
        t3.setPriority(8);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        t1.setDaemon(true);
        System.out.println(t1.getPriority());
        t1.start();
        t2.start();
        t3.start();
    }
}

class SampleThread extends Thread{
    private String name;
    SampleThread(String name ){
        this.name = name;
    }
    public void run(){
        System.out.println("sample thread called" + name);
    }
}
