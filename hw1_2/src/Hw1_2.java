/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        int numberOfCourses = grade.length;
        int totalCredits = 0;
        float weightedSum = 0.0f;
        float weightedAvg = 0.0f;
        for (int i = 0; i < numberOfCourses; i++) {
            totalCredits += credit[i];
            weightedSum += credit[i] * grade[i];
        }
        weightedAvg = weightedSum / totalCredits;
        return weightedAvg;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
