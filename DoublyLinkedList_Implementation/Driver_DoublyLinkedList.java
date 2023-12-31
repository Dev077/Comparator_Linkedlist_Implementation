package DoublyLinkedList_Implementation;

public class Driver_DoublyLinkedList { //Driver class

    public static void myHeader(int labE_number, int q_number) // a public static method that works as an introduction for the output
    {
        System.out.println("=======================================================");
        System.out.println("Prepared By: Dev Chaudhari");
        System.out.println("Goal of this Project: Experimenting and Working with Doubly Linked List");
        System.out.println("=======================================================");
    }

    public static void myFooter(int labE_number, int q_number) // a public static method that works as a conclusion for the output
    {
        System.out.println("\n=======================================================");
        System.out.printf("Completion of the Project is successful!");
        System.out.println("\nSigning off - Dev");
        System.out.println("=======================================================");
    }

    public static void main(String[] args){ // driver method

        myHeader(4,1); // calling myHeader method which serves as an introduction to the lab question

        DoublyLinkedList<MyStudent> devList = new DoublyLinkedList<>(); // a reference variable of a MyStudent-type Doubly Linked List

        MyStudent s0 = new MyStudent(); // created an instance of MyStudent class called s0 and prompted the constructor without argument
        MyStudent s1 = new MyStudent("Harry", 67.35); // created an instance of MyStudent class called s1 and instantiated with the value in parameters
        MyStudent s2 = new MyStudent("Luna", 87.5); // created an instance of MyStudent class called s2 and instantiated with the value in parameters
        MyStudent s3 = new MyStudent("Vincent", 60.5); // created an instance of MyStudent class called s3 and instantiated with the value in parameters
        MyStudent s4 = new MyStudent("Hermione",89.2); // created an instance of MyStudent class called s4 and instantiated with the value in parameters

        System.out.println("Adding 4 students to the list.");
        // Added the first four students s0, s1, s2, s3 to the linked list using the addLast() method
        devList.addLast(s0);
        devList.addLast(s1);
        devList.addLast(s2);
        devList.addLast(s3);

        System.out.println("The list Content:");
        System.out.println(devList.toString()); // Printing the list using toString() method defined in MyStudent class

        // Finding the node info for s2 and then for s3 using findNode() method
        DoublyLinkedList.Node<MyStudent> any = devList.findNode(s2);
        DoublyLinkedList.Node<MyStudent> any1 = devList.findNode(s3);

        System.out.println("Adding Hermione to the list in between Luna and Vincent.....");
        devList.addBetween(s4,any,any1); // updating the list

        System.out.println("The list Content:");
        System.out.print(devList.toString()); // Printing the updated list using toString() method defined in MyStudent class

        myFooter(4,1); // calling myFooter method which serves as a conclusion to the lab question

    }
}
