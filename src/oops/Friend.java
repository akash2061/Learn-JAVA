package oops;

public class Friend {
    String name;
    static int numOffriends;

    Friend(String name) {
        this.name = name;
        numOffriends++;
    }

    static void displayTotalFriends() {
        System.out.println("Total number of friends: " + numOffriends);
    }
}
