package cn.tsa.lambda.test;

import java.util.Random;

/**
 * @author hongwei
 */
public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // 结果是个double类型的值，区间为[0.0,1.0）
            System.out.println("Math.random()=" + (int) (Math.random()* 10011) );

            Random random = new Random();
            int j = random.nextInt(100);
            System.out.println("Random()=" + j);
        }

    }
}
