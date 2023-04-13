package homeWorkClass9;

public class Task2 {
    public static void main(String[] args) {
      //  Create an array of names and store all names of your group.
        //  Then print your name from that array. (use 2 different ways of creating an array).
        String [] names={"Jose","ilyaB","Adrian","Brett","Ayaulym","Isaac","masud","Reshad","Katya","Ivan","Fatima"};
        System.out.println(names[10]);
        System.out.println();
        String [] name=new String[11];
        name[0]="jose";
        name[1]="IlyaB";
        name[2]="Adrian";
        name[3]="Brett";
        name[4]="Ayaulym";
        name[5]="Isaac";
        name[6]="masud";
        name[7]="Reshad";
        name[8]="Katya";
        name[9]="Ivan";
        name[10]="Fatima";
        System.out.println(name[10]);
    }
}
