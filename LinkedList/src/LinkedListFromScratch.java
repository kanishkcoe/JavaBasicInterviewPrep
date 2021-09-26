import java.util.Scanner;

public class LinkedListFromScratch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        LinkedList linkedList = new LinkedList();
        do {
            menu();

            System.out.print("Enter Choice : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter number : ");
                    int number = scanner.nextInt();
                    linkedList.createLinkedList(number);
                    System.out.println(number + " inserted to the list.");
                    break;
                case 2:
                    System.out.println("Enter number : ");
                    number = scanner.nextInt();
                    linkedList.insertNodeAtEnd(number);
                    System.out.println(number + " inserted to the list.");
                    break;
                case 3:
                    System.out.println("Enter number : ");
                    number = scanner.nextInt();
                    linkedList.insertNodeAtBeginning(number);
                    System.out.println(number + " inserted to the list.");
                    break;
                case 4:
                    Node node = linkedList.deleteNodeAtBegin();
                    System.out.println(node.data + " deleted from the list.");
                    break;
                case 5:
                    node = linkedList.deleteNodeAtEnd();
                    System.out.println(node.data + " deleted from the list.");
                    break;
                case 6:
                    linkedList.printList();
                    break;
            }
        } while(choice != 7);

        System.out.println("Program ended!");
    }

    private static void menu() {
        System.out.println("------------------Menu--------------------");
        System.out.println("1. create list");
        System.out.println("21. insert at the end of the list");
        System.out.println("3. insert in the beginning of the list");
        System.out.println("4. delete from the beginning of the list");
        System.out.println("5. delete from the end of the list");
        System.out.println("6. print the list");
        System.out.println("7. Quit");

    }

}
