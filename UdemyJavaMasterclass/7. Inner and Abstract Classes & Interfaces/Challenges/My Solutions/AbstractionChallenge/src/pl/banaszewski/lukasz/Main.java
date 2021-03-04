package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");

        MyLinkedList firstLL = new MyLinkedList("Value");
        System.out.println("Value is = " + firstLL.getValue());
    }
}
