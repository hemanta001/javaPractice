package ArrayExamples;

class Main{
    public static void main(String args[]){
        float a[]=new float[7];//declaration and instantiation
        float b=10;
        a[0]=10;//initialization
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;
        a[5]=40;
        a[6]=70;
        //traversing array
        for(int i=0;i<a.length;i++)//length is the property of array
            System.out.println(a[i]);
    }}
