class thread1 implements Runnable{
    Thread t1;
    thread1( ){
        t1=new Thread(this,"thread1");
        t1.start();
    }
    public void run( ){
        try{
        while(true){
            System.out.println("BMS College Of Engineering");
            Thread.sleep(10000);
            }
        }
        catch(InterruptedException e){
            System.out.println("interrupted "+e);
        }
    }
}
class thread2 implements Runnable{
    Thread t2;
    thread2( ){
        t2=new Thread(this,"thread2");
        t2.start();
    }
    public void run( ){
        try{
        while(true){
            System.out.println("CSE");
            Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println("interrupted "+e);
        }
    }
}
public class threaddemo{
    public static void main(String args[]){
        System.out.println("press CONTROL+C to stop");
        thread1 obj1=new thread1( );
        thread2 obj2=new thread2( );
    }
}
