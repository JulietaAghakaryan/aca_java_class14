package Runnables;

public final class AppUtils {

    private AppUtils(){

    }

    public static void sleep(int sec){

        final long start = System.currentTimeMillis();
        while(System.currentTimeMillis()-start<sec*1000){

        }
    }
}
