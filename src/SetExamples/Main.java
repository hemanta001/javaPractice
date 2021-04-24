package SetExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> countryList=new ArrayList<>();

        Set<String> countrySet=new HashSet<>();

        countryList.add("Nepal");
        countryList.add("Bhutan");
        countryList.add("China");
        countryList.add("Japan");
        countryList.add("Bhutan");
        countryList.add("China");
        countryList.add("Afganistan");

        countrySet.add("Nepal");
        countrySet.add("Japan");
        countrySet.add("Bhutan");
        countrySet.add("China");
        countrySet.add("Afganistan");
        System.out.println("---------------list------------------");
        System.out.println(countryList);

        for(String country:countryList){
            System.out.println(country);
        }


        System.out.println("---------------set------------------");
        System.out.println(countrySet);
        for(String country:countrySet){
            System.out.println(country);
        }
        countrySet.remove("Japan");
        System.out.println("---------------set after remove------------------");
        System.out.println(countrySet);

        countrySet.forEach(System.out::println);
    }
}
