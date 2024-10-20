package Task2;

import java.util.Objects;
import java.util.Scanner;

public class Task3 {
//    3. Реализовать простой калькулятор
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] s = num.split(" ");
        int num1 = Integer.parseInt(s[0]);
        int num2 = Integer.parseInt(s[2]);
        int res = 0;
        if (Objects.equals(s[1], "+")) {
            res = num1 + num2;
        } else if (Objects.equals(s[1], "-")) {
            res = num1 - num2;
        } else if (Objects.equals(s[1], "*")) {
            res = num1 * num2;
        } else if (Objects.equals(s[1], "/")) {
            res = num1 / num2;
        }
        System.out.println(res);


    }



}
