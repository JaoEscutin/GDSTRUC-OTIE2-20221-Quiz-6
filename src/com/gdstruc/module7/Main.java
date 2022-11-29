package com.gdstruc.module7;

public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(23);
        tree.insert(15);
        tree.insert(16);
        tree.insert(17);
        tree.insert(28);
        tree.insert(22);
        tree.insert(11);


        System.out.println("Traverses tree in Descending order: ");
        tree.traverseInOrderDescending();

        //System.out.println(tree.get(25));
        System.out.println("\n======================\n ");

        System.out.println("Gets the minimum value in the tree: ");
        System.out.println("Min: " + (tree.getMin(tree.get(25))));


        System.out.println("\n======================\n ");

        System.out.println("Gets the maximum value in the tree: ");
        System.out.println("Max: " + (tree.getMax(tree.get(25))));

    }
}