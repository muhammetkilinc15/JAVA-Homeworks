package Week5;

import java.util.Random;

public class EXC6 {
    /**
     * (Stopwatch) Design a class named StopWatch. The class contains:
     * Private data fields startTime and endTime with getter methods.
     * A no-arg constructor that initializes startTime with the current time.
     * A method named start() that resets the startTime to the current time.
     * A method named stop() that sets the endTime to the current time.
     * A method named getElapsedTime() that returns the elapsed time for the
      stopwatch in milliseconds.
     * Draw the UML diagram for the class then implement the class. Write a test program
     * that measures the execution time of sorting 100,000 numbers using selection sort.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random random = new Random();
        for (int i=0;i<10000;i++){
            arr[i]= random.nextInt(10000);
        }
        StopWatch stopWatch = new StopWatch();
        selectionShort(arr);
        stopWatch.stopTime();
        System.out.println("Sorting took "+stopWatch.getElapsedTime()+" milliseconds ");
    }
    public static int[] selectionShort(int[] arr){
        for (int i=0;i<arr.length-1;i++){

            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}

class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return this.startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void startTime(){
        this.startTime= System.currentTimeMillis();
    }
    public void stopTime(){
        this.endTime= System.currentTimeMillis();
    }

    // Return the elapsed time
    public long getElapsedTime() {

        return getEndTime() - getStartTime();
    }

}

