package Runnables;

import javax.swing.plaf.TableHeaderUI;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        var builder = Stream.<Object>builder();
        List<FileUploadRunnable> fileUploadRunnables = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            final File file = new File("C:/Users/marin/Desktop/java.txt "+i);
            final FileUploadRunnable runnable = new FileUploadRunnable(

                    file,
                    "http://upload.com"
            );
            fileUploadRunnables.add(runnable);
            // runnable.run();
        }
        runAll(fileUploadRunnables);
        runAllRunnables( fileUploadRunnables);


        ////////////////////////////THREAD///////////////////////////////
        Thread.currentThread();//stanal en thread@ vori mej ashxatuma
         Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;

                while(true){
                    System.err.println("print "+i++);
                    try{
                    Thread.sleep(1000);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                        break;
                    }
                }
            }
        });
         thread1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                AppUtils.sleep(5);
                thread1.interrupt();
            }
        }).start();



    }
    public static void runAll(List<FileUploadRunnable> fileUploadRunnables) {
        for(final FileUploadRunnable runnable : fileUploadRunnables)
        {
            run(runnable);
        }
    }

    public static void runAllRunnables(List<? extends Runnable> runnableList) {
       // runnableList.add(null);//baci null-ic urish ban ches kara avelacnes mej@ ete extend-a anum
        // ete ? ches kara, ete ? super-a karas
        for(final Runnable runnable : runnableList)
        {
            run(runnable);
        }
    }
    public static void run(Runnable runnable){

        Thread thread = new Thread(runnable);
        thread.start();//amen mekn ira thread-na unenum
       //thread.run();//sagh mainum en  linum


    }
}