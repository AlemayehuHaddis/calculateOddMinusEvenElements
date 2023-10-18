public class Main {
    public static void main(String[] args) {

        int[] sampleData = {3,  6, 4, 9, 8};
        int result = calculateOddMinusEvenElements(sampleData);

        System.out.println(String.valueOf(result));

    }
    static int calculateOddMinusEvenElements(int[] givenArray){
        int sumOfEvenElements = 0;
        int sumOfOddElements = 0;

        for (int j : givenArray) {
            if (j % 2 == 0) {
                sumOfEvenElements += j;
            } else
                sumOfOddElements += j;
        }
        return sumOfOddElements - sumOfEvenElements;
    }
}
