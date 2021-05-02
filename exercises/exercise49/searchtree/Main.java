package de.renemeier.udemy.timbuchalka.exercises.exercise49.searchtree;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        for (int i=0;i<20;i++){
            System.out.println("\n");
        }

        list.removeItem(new Node("Sydney"));
        list.removeItem(new Node("Unknown"));
        list.traverse(list.getRoot());
        list.addItem(new Node("Frankfurt"));
        list.traverse(list.getRoot());
    }
}
