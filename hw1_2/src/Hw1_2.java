
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        float float total=0,classes=0,gpa;
                for(int i=0; i<credit.length; i++){
                    total+=credit[i]*grade[i];
                    classes+=credit[i];
                }
                gpa = classes/total;
                return gpa;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
