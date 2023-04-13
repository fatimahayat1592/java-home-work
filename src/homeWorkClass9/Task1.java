package homeWorkClass9;

public class Task1 {
    public static void main(String[] args) {
       // Create an array of chars and store grades into it: A,B,C,D.
        // Then print a grade B (use 2 different ways of creating an array).
        char [] symbols={'A','B','C','D'};
        System.out.println(symbols[1]);
        System.out.println();
        char [] symbol=new char[4];
        symbol[0]='A';
        symbol[1]='B';
        symbol[2]='C';
        symbol[3]='D';
        System.out.println(symbol[1]);
    }
}
