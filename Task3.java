public class Task3 {
    public static void main(String[] args) {

        //There is a numeric array at the input, it is necessary to output array elements that are multiples of 3
        int[] inputArray = {2, 6, 9, 12, 15, 18, 21, 25, 30};

        System.out.println("Multiples of 3:");
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 3 == 0) {
                System.out.print(inputArray[i] + " ");
            }
        }
    }
}
