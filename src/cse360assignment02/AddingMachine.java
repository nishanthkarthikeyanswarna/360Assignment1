package cse360assignment02;

// class name
public class AddingMachine {
    private int total;
    private String str;

    //run the machine
    public AddingMachine() {
        total = 0;
        str = "0";
    }

    //gets the total
    public int getTotal() {
        return total;
    }

    //adds
    public void add(int value) {
        total += value;
        str += " + " + value;
    }

    //subtracts
    public void subtract(int value) {
        total -= value;
        str += " - " + value;
    }

    //override tostring
    public String toString() {
        return str;
    }

    //clears
    public void clear() {
        total = 0;
    }
}