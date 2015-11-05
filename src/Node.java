
//interview problems size of list, reverse list, covert circular to singly
public class Node
{
    Node next;
    Node prev;
    String data;

    public Node(String data)
    {
        this.data = data;
    }
}

class List{
    Node head;
    Node tail;

    public void addToHead(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null)
        {
            head.prev = newNode;
        }
        else {
            tail = newNode;
        }
        head = newNode;
    }

    public void addToTail(String data) {
        Node newNode = new Node(data);
        newNode.prev = tail;
        //tail is null when list is empty
        if (tail != null)
        {
            tail.next = newNode;
        }
        //if list is empty set head and tail
        else {
            head = newNode;
        }
        tail = newNode;
    }

    public void delete(String data) {
        Node current = head;

        while (current != null && !current.data.equals(data)) {
            current = current.next;
        }
        //we find it
        if (current != null) {
            if (current == head) {
                head = head.next;
            }
            else {
                current.prev.next = current.next;
            }

            if (current == tail) {
                tail = tail.prev;
            }
            else
            {
                current.next.prev = current.prev;
            }


            //not necessarily, java will do it for us
//            current.prev = null;
//            current.next = null;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + ",");
            current = current.next;
        }
        System.out.println();
    }
}

class Main {
    public static void main (String[] args) {
//        List list = new List();
//        list.print();
//        list.addToHead("test1");
//        list.print();
//        list.addToHead("test2");
//        list.print();

        List list2 = new List();
        list2.addToTail("tail2");
        list2.print();
        list2.addToTail("tail3");
        list2.print();


    }
}
