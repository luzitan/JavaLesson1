package Lesson1;

public class TriangularNumber {
    public int num;
    public int rez;



    public TriangularNumber(int num){
        this.num = num;
        int sum = 0;
        for( int i = 1; i < num+1; i++){
            sum += i;
        }
        this.rez = sum;
    }
}
