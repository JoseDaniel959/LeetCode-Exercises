package com.mycompany.app;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
s
public class App {
    public static void main(String[] args) {
        try{
            ExecutorService service = Executors.newCachedThreadPool();
            for(int i = 0; i<10 ;i++){
                service.execute(new Task(i));
            }
            service.shutdown();
            
        }
        catch(Error e){
            System.out.println("soy un error");
        }
    }
}

class Task implements Runnable{
    private final int taskId;

    public Task(int taskId){
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task with ID" + taskId + " being executed by Thread " + Thread.currentThread().getName());
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            throw new UnsupportedOperationException("Unimplemented method 'run'");

        }
    }
    
}