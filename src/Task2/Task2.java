package Task2;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class Task2 {

    // 2. Вывести все простые числа от 1 до 1000
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 2; i <= n; i++) {
            prost_num(i);
        }
    }

    public static void prost_num(int n){
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        if (flag){
            System.out.println(n);
        }

    }
}
