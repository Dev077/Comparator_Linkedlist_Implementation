package Comparator_Implementation;

import java.util.Comparator;

// this class is used for comparing the first names of the people and sort them in ascending order, using the compare method of Comparator<T> interface
public class HelperClassCompareFirstNames implements Comparator<Student> {

    public int compare(Student a,Student b) { // overriding compare method to compare first names of students
        int x = a.getFirstname().charAt(0);
        int y = b.getFirstname().charAt(0);

        if(x>y){
            return 1;
        } else if (x<y) {
            return -1;
        } else if (x == y) {
            int z = a.getFirstname().charAt(1);
            int s = b.getFirstname().charAt(1);
            if(z>s){
                return 1;
            } else if (z<s) {
                return -1;
            }

        }
        return 0;
    }
}
