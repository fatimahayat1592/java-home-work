package homeWorkClass9;

public class Task7 {
    public static void main(String[] args) {
        //From an array of integer elements find the largest number.
        int [] numbers={21,31,51,61};
        int largest=numbers[0];
        for (int number : numbers) {
            if(number>largest){
                largest=number;
            }
        }
        System.out.println(largest);

    }
}
