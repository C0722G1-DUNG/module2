package ss4.exercise.SstopWatch;

import ss4.exercise.SstopWatch.StopWatch;

import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        int choise;
        int sum = 0;
        System.out.println("ấn 1 để đếm");
        System.out.println("ấn 2 để dừng lại");
        do {
            choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    stopWatch.star();
                    System.out.println("thời gian hiện tại"+System.currentTimeMillis());
                    break;
                case 2:
                    for (int i = 0; i < 1000000000; i++) {
                        sum += i;
                    }
                    stopWatch.stop();
                    System.out.println("thời gian hiện tại"+System.currentTimeMillis());
                    System.out.println("thời gian chạy" + stopWatch.getElapsedTime());
                    break;
            }
        } while (choise == 1);
    }
}
