public class Main {
    public static void main(String[] args) {

        int[] sampleData = {3,  6, 4, 9, 8};
        int result = calculateOddMinusEvenElements(sampleData);

        System.out.println(String.valueOf(result));

    }
    static int calculateOddMinusEvenElements(int[] givenArray){
        int sumOfEvenElements = 0;
        int sumOfOddElements = 0;

        for(int i=0; i<givenArray.length; i++){
            if(givenArray[i] % 2  ==  0){
                sumOfEvenElements = sumOfEvenElements + givenArray[i];
            } else
                sumOfOddElements = sumOfOddElements + givenArray[i];
        }
        return sumOfOddElements - sumOfEvenElements;
    }
}