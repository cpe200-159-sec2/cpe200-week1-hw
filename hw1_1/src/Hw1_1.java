/**
 * Implement countEvenNum method which receives an array of integer and return the count of even number.
 **/
public class Hw1_1 {
    public int countEvenNum(int[] inputs)
    {
        int count = 0;
        for(int i=0;i<inputs.length;i++){
            if(inputs[i]%2==0) count++;
        }
        return count;
    }


    public static void main(String[] args) {
        Hw1_1 h = new Hw1_1();
        int[] inputs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("Number of event number is %d\n", h.countEvenNum(inputs));
    }
}
