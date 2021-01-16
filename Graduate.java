/*
 * Author: Brian Klein
 * Date: 9/25/17
 * Program: Graduate.java
 * Description:
 */

public class Graduate extends Student {

    public Graduate(String name) {
        super(name);
    }

    //override the abstract method
    @Override
    public void computeGrade() {

        int sum = 0;

        int[] temp = this.getTestList();

        for (int i = 0; i < NUM_OF_TESTS; i++) {
            sum += temp[i];
        }

        if (sum / NUM_OF_TESTS >= 80) {
            setGrade("Pass");
        } else {
            setGrade("Fail");
        }
    }
}
