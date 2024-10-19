import Lesson1.Factorial;
import Lesson1.TriangularNumber;

public class Main {

//    1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
//            (произведение чисел от 1 до n)
    public static void main(String[] args){
        int n = 4;
        TriangularNumber count = new TriangularNumber(n);
        System.out.println(count.rez);

        Factorial count_fact = new Factorial(n);
        System.out.println(count_fact.rez);


    }
}
