package com.company;

public class Main {

    public static void main(String[] args) {

	    LinkedList linkedList = new LinkedList();

	    linkedList.addData(1);
	    linkedList.addData(2);
	    linkedList.addData(3);
	    linkedList.addData(4);
	    linkedList.addData(5);

	    linkedList.deleteData(0);

	    linkedList.printList();

    }
}
