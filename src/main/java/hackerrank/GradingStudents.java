package hackerrank;

import java.util.List;
import java.util.stream.Collectors;

/**
 * HackerLand University has the following grading policy:
 *
 * Every student receives a  in the inclusive range from  to .
 * Any  less than  is a failing grade.
 * Sam is a professor at the university and likes to round each student's  according to these rules:
 *
 * If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
 * If the value of  is less than , no rounding occurs as the result will still be a failing grade.
 * Examples
 *
 *  round to  (85 - 84 is less than 3)
 *  do not round (result is less than 40)
 *  do not round (60 - 57 is 3 or higher)
 */

public class GradingStudents {
    public static void main(String[] args) {
        System.out.println(
                gradingStudents(List.of(4,73,67, 38, 33))
        );
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        return grades.stream().map(GradingStudents::performGrading)
        .collect(Collectors.toList());

    }

    private static int performGrading(int grade){
        int result = 0;
        if (grade < 40 || grade > 40 && grade % 5 == 0 ) return  grade;
        result = (grade + 1 ) % 5 == 0 ? grade + 1: (grade + 2 ) % 5 == 0? grade + 2: grade;
        return result;
    }


}
