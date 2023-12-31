package Comparator_Implementation;

import java.util.Comparator;

// this class is used for comparing the last names of the people and sort them in ascending order, using the compare method of Comparator<T> interface
public class HelperClassCompareLastNames implements Comparator<Student> {

    public int compare(Student a, Student b){  // overriding compare method to compare first names of students

        int x = a.getLastName().charAt(0);
        int y = b.getLastName().charAt(0);

        if(x>y){
            return 1;
        } else if (x<y) {
            return -1;
        } else if (x == y) {
            return 0;
        }
        return 0;
    }
}
