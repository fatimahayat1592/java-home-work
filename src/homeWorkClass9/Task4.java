package homeWorkClass9;

public class Task4 {
    public static void main(String[] args) {
        //Create an array of cars and store 6 elements into it.
        // Using 2 different loops print all values from the array.
        String [] cars={"Toyota","Honda","Aurora","Ferrari","Mercedes","Suzuki"};
        for (String car : cars) {
            System.out.print(car+" ");
        }
        System.out.println();

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+" ");

        }
        System.out.println();
        int j=0;
        while(j<cars.length){
            System.out.print(cars[j]+" ");
            j++;
        }


    }
}
