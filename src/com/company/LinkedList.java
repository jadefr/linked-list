package com.company;

public class LinkedList {
    Node head;

    public void addData(int data) {
        Node newHead = new Node(data, head);
        head = newHead;
    }

    public void printList() {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
