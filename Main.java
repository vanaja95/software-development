package coding;

//Node class represents a single element in the linked list
class Node {
 int data;
 Node next;

 public Node(int data) {
     this.data = data;
     this.next = null;
 }

}

//LinkedList class represents the linked list data structure
class LinkedList {
 Node head;

 // Insert a new element at the end of the linked list
 public void insert(int data) {
     Node newNode = new Node(data);
     if (head == null) {
         head = newNode;
     } else {
         Node current = head;
         while (current.next != null) {
             current = current.next;
         }
         current.next = newNode;
     }
 }

 // Delete an element from the linked list
 public void delete(int data) {
     if (head == null) return;

     if (head.data == data) {
         head = head.next;
         return;
     }

     Node current = head;
     while (current.next != null) {
         if (current.next.data == data) {
             current.next = current.next.next;
             return;
         }
         current = current.next;
     }
 }

 // Search for an element in the linked list
 public boolean search(int data) {
     Node current = head;
     while (current != null) {
         if (current.data == data) return true;
         current = current.next;
     }
     return false;
 }

 // Reverse the order of the elements in the linked list
 public void reverse() {
     Node prev = null;
     Node current = head;
     Node next = null;

     while (current != null) {
         next = current.next;
         current.next = prev;
         prev = current;
         current = next;
     }
     head = prev;
 }

 // Find the middle element of the linked list
 public int findMiddle() {
     Node slow = head;
     Node fast = head;

     while (fast != null && fast.next != null) {
         slow = slow.next;
         fast = fast.next.next;
     }
     return slow.data;
 }

 // Merge two sorted linked lists
 public void merge(LinkedList other) {
     if (head == null) {
         head = other.head;
         return;
     }

     Node current = head;
     while (current.next != null) {
         current = current.next;
     }
     current.next = other.head;
 }

 // Print the linked list
 public void print() {
     Node current = head;
     while (current != null) {
         System.out.print(current.data + " ");
         current = current.next;
     }
     System.out.println();
 }
}

public class Main {
 public static void main(String[] args) {
     LinkedList list = new LinkedList();

     // Insert elements
     list.insert(1);
     list.insert(2);
     list.insert(3);
     list.insert(4);
     list.insert(5);

     // Print the linked list
     System.out.println("Linked List: ");
     list.print();

     // Reverse the linked list
     list.reverse();
     System.out.println("Reversed Linked List: ");
     list.print();

     // Search for an element
     System.out.println("Is 3 in the list? " + list.search(3));

     // Delete an element
     list.delete(3);
     System.out.println("Linked List after deleting 3: ");
     list.print();

     // Find the middle element
     System.out.println("Middle element: " + list.findMiddle());

     // Merge two sorted linked lists
     LinkedList other = new LinkedList();
     other.insert(6);
     other.insert(7);
     other.insert(8);
     list.merge(other);
     System.out.println("Merged Linked List: ");
     list.print();
 }
}

