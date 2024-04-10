//**************************************************Linked List ********************************** */
// Liked list : is custome Built data type i.e at every node of what data type of value we want to add at every node like string, int, float, char etc. so can cutomize the what we want to store at every node so that LinkedList is called as Cutom Built data type.
/// the size of linkLIst is 4 Nodes. If you wanto take extra memory then we have to give value to next node of LIkedLIst and It will add some more nodes that we want to LikedList.

// time complexity of LInkedList is O(n) always because when we want to find some element in LIknedLIst then we have to start from first element because the address of next element is stored nextNode of first element and so on.  

// LinkedList is dynamic in size because LinkedLIst is not a fixed size when we want to increase the size of LinkedList we can increase it. And wastage of space is also not compalsory like array.

// LinkedLIst is combination of nodes connected to each other.
// Nodes: Custom build Data type. i.e. is customly defined by user. Any node has two components 1st is Data and 2nd is Next which is of type Node.
// when we write "new" keyword that allocates the memory to that object that is created.

// In LinkedLIst Once the functions is returned the local variables of that function is erased or wanished so do not make "head" to local variable or attribute of addNode function. always define "head" outside of addNode function.

// In java there are nothing like pointers but they are called as addresses.

/// Advantageses of LinkedList : You can add element inside the LinkedList after you have declared the size of LInked LIst and you can add elment at middle or last or anywhere in LInked LIst.

// Disadvantages of LinkedLIst: you cannot know the address of previous node while traversing through linkedList

/// Node is the user defined custom attribute or variable that takes 4 bytes of memroy same like "Int" attribute.
import java.util.*;
// import java.io.*;

// class Node{
//     int Data;
//     Node next;  // Size of Node attributes is also same as int attributes is 4 bytes only
//     Node(int newData){
//         Data = newData;
//         next = null;
//     }
// }
// class List{
//     Node head;

//     void addAtFirst(int Data){
//         Node newNode = new Node(Data);

//         if(head == null){
//             head = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     void Reverse(int Data){

//         Node newNode = new Node(Data);

//         Node Prev,Next,Curr;
//         Prev = null;
//         Curr = head;
//         Next = Curr.next;

//         while(Curr != null){
//             Next = Curr.next;
//             Curr.next = Prev;
//             Prev = Curr;
//             Curr = Next;
//         }
//         head = Prev;
//        }

//     void addNode(int Data){

//         Node newNode = new Node(Data);
//         // System.out.println(newNode);  // for printing the address of each Node

//         if(head == null){
//             head = newNode;
//             return;
//         }
    
//         Node current;
//         current = head;
//         while(current.next != null){
//             current = current.next;
//         }
//         current.next = newNode;
//     }

    // void PrintList(){
    //     Node current;
    //     current = head; 
    //     while(current!=null){
    //         System.out.print(current.Data+" ");
    //         current = current.next;
    //     }
    // }
// }


// public class LinkedList{
//     public static void main(String[] args){
//         Scanner nc = new Scanner(System.in);
//         int n = nc.nextInt();

//         List ll = new List();

//         for(int i=0;i<n;i++){
//             int no = nc.nextInt();
//             // ll.addNode(no);        // for printing the linked list
//             // ll.addAtFirst(no);        // for taking input in reverse order and printing it
//             ll.Reverse(no);
//         }

//         ll.PrintList();
//     }
    
// }


// Circular Linked List: These type Linked List have Two pointers i.e Head and Tail Head always points to the First Node and Tail Always points to Last Node. So Tail.next is always points to Head so that is called as Circular Linked List. There is no node that Null every Node is connected with other. 

class Node{
    int Data;
    Node Next;
    Node(int newData){
        Data = newData;
        Next = null;
    }
}

class List{
    Node Head;
    Node Tail;

    void addNode(int Data){
        Node newNode = new Node(Data);

        // for adding the first Node
        if(Head==null){
            Head = newNode;
            Tail = newNode;
            Tail.Next = Head;
            return;
        }

        Tail.Next = newNode;
        newNode.Next = Head;
        Tail = newNode;

    }
    void PrintList(){
        Node current;
        current = Head; 
        while(current!=null){
            System.out.print(current.Data+" ");
            current = current.Next;
        }
    }
}

public class LinkedList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List ll = new List();

        for(int i=0;i<n;i++){
            int no = sc.nextInt();
            ll.addNode(no);
            ll.PrintList();        }
    }
}