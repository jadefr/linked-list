package com.company;

public class LinkedList {
    private Node head;

    public void addData(int data) {
        Node newHead = new Node(data, head);
        head = newHead;
    }

    public void printList() {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public void deleteData(int data) {

        // check if first element
        if (head.data == data) {
            head = head.next;
        }

        Node current = head;
        Node last = null;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
            }
            last = current;
            if (last.next == null) {
                break;
            }
            current = current.next;
        }
    }
}
