package academy.learnprogramming;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        //The argument won't accept primitive type
        //ArrayList<int> intArrayList = new ArrayList<int>();

        // Long way of doing it to understand
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
            intArrayList.add(Integer.valueOf(i)); // <-- Autoboxing
        }

        for(int i=0; i<=10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); // <-- Unboxing
        }

        // Short way of doing it
        Integer myIntValue = 56; // Java will convert primitive type 56 into "Integer.valueOf(56);"
        int myInt = myIntValue.intValue(); // myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl); // Java will convert the dbl into "Double.valueOf(dbl)" <-- Autoboxing
        }

        for(int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i); // Java will convert the "myDoubleValues.get(i)" into "myDoubleValues.get(i).doubleValue()" <-- Unboxing
            System.out.println(i + "--> " + value);
        }
    }
}
