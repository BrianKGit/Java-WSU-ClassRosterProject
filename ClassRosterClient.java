/*
 * Author: Brian Klein
 * Date: 9/25/17
 * Program: ClassRosterClient.java
 * Description:
 */
import java.util.*;

public class ClassRosterClient {
    
    public static void main(String [] args) {
        
        ArrayList<Student> studentList = new ArrayList<Student>();
        
        //Student s1 = new Student("Jon"); //error
        
        studentList.add(new UnderGraduate("Tom"));
        studentList.add(new Graduate("Joe"));
        studentList.add(new Graduate("Mary"));
        studentList.add(new UnderGraduate("Jim"));
        studentList.add(new UnderGraduate("Anne"));
        
        int [] temp = {78, 80, 76};
        int [] temp2 = {90, 97, 87};
        
        studentList.get(0).setTestList(temp);
        studentList.get(1).setTestList(temp2);
        studentList.get(2).setTestList(temp);
        studentList.get(3).setTestList(temp2);
        studentList.get(4).setTestList(temp);
        
        int count_graduate = 0;
        
        
        //process the studentList polymorphically
        
       for(int i=0; i<studentList.size(); i++){
           
           studentList.get(i).computeGrade();
           
           System.out.println( studentList.get(i).toString());
           
           if( studentList.get(i) instanceof Graduate ){
               count_graduate ++;
           }
       }
       
       System.out.println("\nNumber of Graduate Students: " + count_graduate);

    }
    
}
