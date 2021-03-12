package SortNumbers;

public class SortNumbers {

    public void sort() {
        int temp;
        int[] arrayOfNumbers = new int[]{10, 9, 88, 27, 63, 55, 91, 7};

        for (int i = 0; i < arrayOfNumbers.length; i++) {

            for (int j = i + 1; j < arrayOfNumbers.length; j++) {

                if (arrayOfNumbers[j] < arrayOfNumbers[i]) {
                    temp = arrayOfNumbers[j];
                    arrayOfNumbers[j] = arrayOfNumbers[i];
                    arrayOfNumbers[i] = temp;
                }
            }

        }
        System.out.println("the numbers sorted in descending order is ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println( arrayOfNumbers[i]);
        }

    }

}
