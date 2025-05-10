package other;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Test1 {
    public static void main(String[] args) {
        help4();
    }

    private static void help1() {
        int a = 5;
        System.out.println(a << 1);
        System.out.println(a << 2);
        System.out.println(a << 3);
        System.out.println(a << 4);
        System.out.println(a << 5);
        System.out.println(a << 6);
        System.out.println(a << 7);
        System.out.println(a << 8);
        System.out.println(a << 9);
        System.out.println(a << 10);
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(a << 8));
        System.out.println(Integer.toBinaryString(a << 9));
        System.out.println(Integer.toBinaryString(a << 10));
        System.out.println(Integer.toBinaryString(a << 11));
    }

    private static void help2() {
        int c = 20;
        System.out.println(Integer.toBinaryString(20));
        System.out.println(Integer.toBinaryString(c >> 1));
        System.out.println(Integer.toBinaryString(c >> 2));
        System.out.println(Integer.toBinaryString(c >> 3));
        System.out.println(Integer.toBinaryString(c >> 4));
        System.out.println(Integer.toBinaryString(c >> 5));
        System.out.println(Integer.toBinaryString(c >> 6));
    }

    private static void help3() {
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        queue.offer(1);
    }

    private static void help4() {
        int a = (1 << 29) - 1;
        System.out.println(Integer.toBinaryString(-1));
    }
}
