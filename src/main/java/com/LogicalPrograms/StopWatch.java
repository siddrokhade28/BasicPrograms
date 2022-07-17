package com.LogicalPrograms;
import java.util.*;
/*Desc -> Write a Stopwatch Program for measuring the time that elapses between
the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.
 */

public class StopWatch {
    public long startTimer=0;
    public long stopTimer=0;
    public long elapsed;

    //to start timer
    public void start()
    {
        startTimer=System.currentTimeMillis();
        System.out.println("Start Time is: "+startTimer);
    }

    // to stop timer
    public void stop()
    {
        stopTimer=System.currentTimeMillis();
        System.out.println("Stop Time is: "+stopTimer);
    }
    //Elapsed Time
    public long getElapsedTime()
    {
        elapsed=stopTimer-startTimer;
        return elapsed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch sw=new StopWatch();

        System.out.println("Press '1' to Start Time: ");
        int ch = scanner.nextInt();
        sw.start();

        System.out.println();
        System.out.println("Press '2' to Stop Time: ");
            ch = scanner.nextInt();
        sw.stop();

        long l=sw.getElapsedTime();
        System.out.println();
        System.out.println("Total Time Elapsed(in millisec) is:"+l);
        System.out.println();
        System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");



    }
}
