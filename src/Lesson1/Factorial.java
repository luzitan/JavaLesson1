package Lesson1;

public class Factorial {
    public int num;
    public int rez;



    public Factorial(int num) {
        this.num = num;
        int fact = 1;
        for (int i = 2; i < num + 1; i++) {
            fact *= i;
        }
        this.rez = fact;
    }
}
