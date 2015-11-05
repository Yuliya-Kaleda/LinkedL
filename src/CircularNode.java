
public class CircularNode
{
    CircularNode next;
    String data;
    public CircularNode(String data) {
        this.data = data;
    }
}

class CircularList {
    CircularNode head;
    CircularNode newNode;

    public void addToHead(String data) {
        CircularNode newNode = new CircularNode(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        }

        CircularNode current = head;
        while (current.next != null && current.next != head) {
            current = current.next;
        }
        if (current.next != null)
        {
            current.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void delete (String data) {
        CircularNode current = head;

        if (head == null) {
            return;
        }
        //case when item we want to delete is the first element
        if (head.data.equals(data)) {
            head = null;
        }
        while (!current.next.data.equals(data)) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    public void insertAfter(String prevData, String newData)
    {
        CircularNode current = head;

        // traverse through list
        while(current != null && ! current.data.equals(prevData))
        {
            current = current.next;
        }

        if(current != null)
        {
            // then we know current is pointing to the node after
            // which we add 'newData'
            CircularNode newNode = new CircularNode(newData);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void print() {
        CircularNode current = head;
        while (current != null) {
            System.out.print(current.data + ",");
            current = current.next;
        }
        System.out.println();
    }
}

class CircularMain {
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.addToHead("yuliya");
        list.print();
//        list.addToHead("yuliya1");
//        list.print();

//        list.delete("yuliya1");
//        list.print();

//        list.insert("yuliya1", "yuliyaBetween");
//        list.print();


    }
}
