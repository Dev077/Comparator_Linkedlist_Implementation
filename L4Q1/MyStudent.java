package L4Q1;

public class MyStudent {

    // Two private data fields to store the first name and the score values of students
    private String firstName;
    private Double score;

    public MyStudent(){ // constructor without argument used for assigning the values to the fields declared above
        this.firstName = "Dev";
        this.score = 100.00;
    }

    public MyStudent(String fn, Double sc){ // constructor with argument used for assigning the values ,passed in parameters, to the fields declared above
        this.firstName = fn;
        this.score = sc;
    }

    // overriding the toString method
    public String toString(){
        return (firstName + ":" + String.format("%.2f",score));
    }
}
