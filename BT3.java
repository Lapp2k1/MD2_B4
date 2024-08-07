import java.util.Date;
import java.util.Scanner;
import java.util.Random;

class StopWatch {
    private long startTime;
    private long endTime;

//    public StopWatch(long startTime, long endTime) {
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }

    public StopWatch() {
        this.startTime = new Date().getTime();
        this.endTime = new Date().getTime();
    }


//    public long getStartTime() {
//        return startTime;
//    }
//
//    public long getEndTime() {
//        return endTime;
//    }

    public long start() {
        return startTime = new Date().getTime();
    }

    public long stop() {
        return endTime = new Date().getTime();
    }

    public void getElapseTime() {
        System.out.println(startTime);
        System.out.println(endTime);
//        System.out.println("Nhấn enter để bắt đầu tính giờ: ");
//        startTime = System.currentTimeMillis();
//        System.out.println("Nhấn enter để kết thúc tính giờ: ");
//        endTime = System.currentTimeMillis();
        System.out.println("Thời gian đã trôi qua: " + (endTime - startTime) + "ms");
    }
}

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100000;
        int[] arr = new int[n];
        Random random = new Random();
        StopWatch stopWatch = new StopWatch();

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }

        stopWatch.start();

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        stopWatch.stop();
        stopWatch.getElapseTime();
    }
}
