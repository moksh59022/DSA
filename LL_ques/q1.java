package LL_ques;

import java.util.*;

public class q1 {

    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



    // Method to insert node at the end of the linked list
    public static Node insert_at_end(Node head, int data) {
        Node newNode = new Node(data);
        // If the list is empty, the new node becomes the head
        if (head == null) {
            return newNode;
        }

        Node current = head;
        // Traverse to the last node
        while (current.next != null) {
            current = current.next;
        }
        // Add the new node to the end
        current.next = newNode;
        return head;
    }

    // Method to delete node from the end of the linked list
    public static Node delete_at_end(Node head) {
        // If the list is empty, return null
        if (head == null) {
            return null;
        }
        // If there's only one node, the list becomes empty after deletion
        if (head.next == null) {
            return null;
        }

        Node current = head;
        // Traverse to the second-to-last node
        while (current.next.next != null) {
            current = current.next;
        }
        // Remove the last node
        current.next = null;
        return head;
    }

    // Method to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Size of the list
        Node head = null;

        // Insert elements at the end
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = insert_at_end(head, data);
        }

        // Delete the last element
        head = delete_at_end(head);

        // Print the list after deletion
        printList(head);
    }
}
