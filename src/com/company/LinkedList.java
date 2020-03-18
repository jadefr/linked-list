package com.company;

import java.util.ArrayList;

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
        boolean isFound = false;

        // check if first element
        if (head.data == data) {
            head = head.next;
            isFound = true;
        }

        Node current = head;
        Node last = null;

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                isFound = true;
            }
            last = current;
            if (last.next == null) {
                break;
            }
            current = current.next;
        }

        if (!isFound) {
            System.out.println("Not found");
        }
    }
}
