public class LinkedList {

    private Node start;

    public LinkedList() {
        this.start = null;
    }

    public Node createLinkedList(int number) {
        Node node = new Node();
        node.data = number;
        node.next = null;
        node.previous = null;

        this.start = node;
        return this.start;
    }

    public void insertNodeAtEnd(int number) {
        Node node = new Node();
        node.data = number;
        node.next = null;
        node.previous = null;

        //no linked list created yet
        if (this.start == null) {
            this.start = node;
            return;
        }
        Node currentNode;

        currentNode = this.start;

        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
        node.previous = currentNode;
    }

    public void insertNodeAtBeginning(int number) {
        Node node = new Node();
        node.data = number;
        node.next = null;
        node.previous = null;

        //no linked list created yet
        if (this.start == null) {
            this.start = node;
            return;
        }

        this.start.previous = node;
        node.next = this.start;
        this.start = node;
    }

    public Node deleteNodeAtEnd() {
        if(this.start == null) {
            System.out.println("No node present in the list. UNDERFLOW!!");
            return null;
        }

        Node nodeToDelete;
        if(this.start.next == null) {
            nodeToDelete = this.start;
            this.start = null;
        }

        Node currentNode;

        currentNode = this.start;

        while(currentNode.next.next != null) {
            currentNode = currentNode.next;
        }

        //now current node is the second last node.
        nodeToDelete = currentNode.next;
        currentNode.next = null;
        return nodeToDelete;
    }

    public Node deleteNodeAtBegin() {
        if(this.start == null) {
            System.out.println("No node present in the list. UNDERFLOW!!");
            return null;
        }

        Node nodeToDelete;
        if(this.start.next == null) {
            nodeToDelete = this.start;
            this.start = null;
        }

        nodeToDelete = this.start;
        this.start = this.start.next;
        this.start.previous = null;

        return nodeToDelete;
    }

    public void printList() {
        Node currentNode = this.start;

        System.out.println("--------------------");
        while(currentNode != null) {
            System.out.print(currentNode.data + ", ");
            currentNode = currentNode.next;
        }
        System.out.println();
        System.out.println("--------------------");
    }

}
