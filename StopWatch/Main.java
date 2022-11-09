package StopWatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch sw = new StopWatch();
        System.out.print("Nhap vao startTime: ");
        long startTime = sc.nextLong();
        System.out.print("Nhap vao endTime: ");
        long endTime = sc.nextLong();
        sw.getStartTime(startTime);
        sw.getEndTime(endTime);
        sw.start();
        System.out.println(sw.getElapsedTime());
    }
}
