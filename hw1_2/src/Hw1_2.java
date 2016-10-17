/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        float Wp=0,Gg=0;
        for (int i =0;i<credit.length;i++){
            Wp+=credit[i]*grade[i];
            Gg+=credit[i];
        }
        if (Gg>=0.0 || Gg<=4.0) return Wp/Gg;

        else  return 0.0f;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
