package QuestionsAnswers;
import java.util.*;

public class LinkedList {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null; Node curr = null;
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            if (head == null) {
                head = new Node(sc.nextInt());
                curr = head;
            }else {
                curr.next = new Node (sc.nextInt());
                curr = curr.next;
            }
        }

        head = ReverseLinkedList.recursive(head);
        printList(head);
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
}

class ReverseLinkedList{
    public static Node recursive(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        
        Node newHead = recursive(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;
    }
    public static Node iterative(Node head) {
        Node prev = null;
        
        while(head!=null){
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
        next = null;
    }
}