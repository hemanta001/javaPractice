package HashMap;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        Map<String,String> stringStringMap=new HashMap<>();
        stringStringMap.put("name","Hemanta");
        stringStringMap.put("place","Kathmandu");
        stringStringMap.put("office","Unlimited");
        stringStringMap.put("cast","Ghimire");
        stringStringMap.put("gender","male");
        stringStringMap.put("age","12");


        System.out.println("The value is "+stringStringMap.get("name"));
        System.out.println("The value is "+stringStringMap.get("office"));
        System.out.println("The value is "+stringStringMap.get("name"));
        System.out.println("The value is "+stringStringMap.get("cast"));
int i=0;
        for(Map.Entry map : stringStringMap.entrySet()){
            System.out.println((i+1)+"."+map.getKey() +" "+map.getValue());
//            i++;
            i=i+1;
        }

    }
}
