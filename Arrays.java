import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {

        String[] friendsArray = new String[4];

        String[] friendsArray2 = {"Eduardo", "liam", "Kyan", "Rey"};


        ArrayList<String> friendsArrayList = new ArrayList<String>();

        ArrayList<String> friendsArrayList2 =
                new ArrayList<String>(java.util.Arrays.asList("Eduardo","Liam", "Kyan", "Rey"));

        ArrayList<String> myFriendsList = new ArrayList<>();

        myFriendsList.add("Eduardo");
        myFriendsList.add("Liam");
        myFriendsList.add("Kyan");
        myFriendsList.add("Rey");
        myFriendsList.add("Angel");

        System.out.println("\n my fifth friend is " + myFriendsList.get(4));

        System.out.println("\n the size (number of elements)  " + myFriendsList.size());

        // Set change the data in an element
        myFriendsList.set(0,"Eduardo");
        System.out.println("\n my first friend is now..." + myFriendsList.get(0));

        // Remove the 3rd element
        myFriendsList.remove(2);

        // output the list without a for loop
        System.out.println(myFriendsList);

        int myFriendNumber = 1;

        //Output the list with a for loop
        for (int i = 0; i < myFriendsList.size(); i++) {
            System.out.println(" friend " + myFriendNumber + " is " + myFriendsList.get(i));
            myFriendNumber++;
        }

        // add list elements with a for loop
        for (int i = 0; i < 10; i++){
            // use.add()
            myFriendsList.add(i+4, " new friend ");
            System.out.println( " new friend added to list");

            // output the list without a for loop
            System.out.println(myFriendsList);

            // output the list with a for/each loop
            for (String s ; myFriendsList) {
                System.out.println();

            }
    }
}