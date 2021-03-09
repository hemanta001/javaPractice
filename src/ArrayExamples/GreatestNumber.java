package ArrayExamples;

public class GreatestNumber {
    public void findMax(){

        int[] arrayOfNumbers=new int[]{12,4,3,7,2,13,10};
//        System.out.println("The number at index 0 "+arrayOfNumbers[0]);
        int maxNumber=arrayOfNumbers[0];
       for(int i=1;i<arrayOfNumbers.length;i++){
           if(arrayOfNumbers[i]>maxNumber){
               maxNumber=arrayOfNumbers[i];
           }
       }
        System.out.println("The greatest number is "+maxNumber);
    }

}
