package Comparator_Implementation;

import java.util.ArrayList;
import java.util.Collections;

public class DriverForStudentClass { // driver class

    public static void myHeader(Student myInfo, int labE_number, int q_number) // a public static method that works as an introduction for the output
    {
        System.out.println("=======================================================");
        System.out.printf("Prepared By: %s %s",myInfo.getFirstname(),myInfo.getLastName());
        System.out.println("\nGoal of this Project: " +
                           "\nDemonstration of my understanding on" +
                           "\nusing Comparator<> Interface, Comparable<> Interface" +
                           "\nand Collections<> class with the help of a class called" +
                           "\nStudent and a couple of Helper classes");
        System.out.println("=======================================================");
    }

    public static void myFooter(int labE_number, int q_number) // a public static method that works as a conclusion for the output
    {
        System.out.println("\n=======================================================");
        System.out.printf("Completion of Lab Exercise %s-Q%s is successful!",labE_number,q_number);
        System.out.println("\nSigning off - Dev");
        System.out.println("=======================================================");
    }

    public static void main(String[] args) { // driver method

        myHeader(new Student(),4,2); // calling myHeader method which serves as an introduction to the lab question

        System.out.println("The Score Card:");

        ArrayList<Student> st = new ArrayList<>(); //Created an ArrayList<> of Students and instantiate it with no-argument constructor
        Student s0 = new Student();  // created an instance of Student class called s0 and prompted the constructor without argument
        Student s1 = new Student("Harry", "Potter",75.5); // created an instance of Student class called s1 and instantiated with the value in parameters
        Student s2 = new Student("Ronald", "Weasley", 86.0); // created an instance of Student class called s2 and instantiated with the value in parameters
        Student s3 = new Student("Hermione", "Granger", 91.7); // created an instance of Student class called s3 and instantiated with the value in parameters
        Student s4 = new Student("Parvati","Patil", 93.75); // created an instance of Student class called s4 and instantiated with the value in parameters

        // Added the students s0, s1, s2, s3, s4 to the Arraylist using the add() method
        st.add(s0);
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);

         // Printing the score-card by calling the toString() method of the ArrayList<>
            System.out.println("\t" + st+"\b\b");


        Collections.sort(st, Student::compareTo); // sorting and printing the list in descending order accordance with the score
        System.out.println("\nThe sorted list in terms of score in descending order....");
        for (int i = 0; i<st.size();i++){
            System.out.print("\t" + st.get(i).toString());
        }
        System.out.println();

        Collections.sort(st, new HelperClassCompareLastNames()); //sorting and printing the list in descending order accordance with the last name
        System.out.println("\nThe sorted list in terms of Last Names....");
        for (int i = 0; i<st.size();i++){
            System.out.print("\t" + st.get(i).toString());
        }
        System.out.println();

        Collections.sort(st, new HelperClassCompareFirstNames()); //sorting and printing the list in descending order accordance with the first name
        System.out.println("\nThe sorted list in terms of First Names....");
        for (int i = 0; i<st.size();i++){
            System.out.print("\t" + st.get(i).toString());
        }
        System.out.println();

        myFooter(4,2); // calling myFooter method which serves as a conclusion to the lab question
    }
}
