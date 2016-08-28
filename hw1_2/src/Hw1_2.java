/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        float TGrade,Grade=0,Credit=0;
        if(credit.length<grade.length||grade.length<credit.length)
        {
            System.out.println("Invaid inputs.");
            return 0;
        }
        else
        {
            for(int i=0;i<grade.length;i++)
            {
                Credit+=credit[i];
                Grade+=(grade[i]*credit[i]);
            }
        }
        TGrade=Grade/Credit;
        return TGrade;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
