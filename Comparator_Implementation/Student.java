package Comparator_Implementation;

public class Student implements Comparable<Student>{

    // declared three private data fields: firstName, lastName and score. Each one to store first name, last name and score respectively
    private String firstName;
    private String lastName;
    private Double score;

    public Student(){ // constructor without argument used for assigning the values to the fields declared above
        this.firstName = "Dev";
        this.lastName = "Chaudhari";
        this.score = 100.00;
    }

    public Student(String fn,String ln, Double sc){ // constructor with argument used for assigning the values ,passed in parameters, to the fields declared above
        this.firstName = fn;
        this.lastName = ln;
        this.score = sc;
    }

    // overriding the toString method
    public String toString(){
        return ("\b\b\n\t" +firstName + " " + lastName + ":" + String.format("%.2f",score));
    }

    public Double getScore(){
        return score;
    } // used to get value from score field

    public void setScore(Double x){
        this.score = x;
    } // used to update the score field

    public String getFirstname(){
        return firstName;
    }  // used to get value from firstName field

    public String getLastName(){
        return lastName;
    }  // used to get value from firstName field

    public void setFirstName(String fn){
        this.firstName = fn;
    } // used to update the firstName field

    public void setLastName(String ln){
        this.lastName = ln;
    } // used to update the lastName field

    // overriding the compareTo method
    public int compareTo(Student st){
        if (st.getScore() < score){
            return -1;
        } else if (score < st.getScore()) {
            return 1;
        } else if (score == st.getScore()) {
            return 0;
        }
        return 0;
    }


}


