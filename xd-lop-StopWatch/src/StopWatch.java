import java.util.Random;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void startTime() {
        this.startTime = System.currentTimeMillis();
    }

    public void stopTime() {
        this.endTime = System.currentTimeMillis();

    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}

class run {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.startTime();
        int[] array = new int[100000];
        Random rd = new Random();
        for (int i = 0; i < 100000; i++) {
            array[i] = rd.nextInt(100000);
        }

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[i] = array[min];
            array[min] = temp;
        }
        stopWatch.stopTime();
        System.out.println(stopWatch.getElapsedTime());
    }
}
