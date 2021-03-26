package Extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Is it Sunny");
        stringList.add("Sunny it is");
        stringList.add("Hello World");
        stringList.add("hello World");
        stringList.add("sunny is it");
        stringList.add("hello World");
        stringList.add("hello World");
        stringList.add("hello World");
        stringList.add("hello World");
        stringList.add("Hello world");
        stringList.add("sunny is It");

        List<String> outputs = getUniqueStrings(stringList);
        for (String phrase : outputs) {
            System.out.println(phrase);
        }
    }

    private static List<String> getUniqueStrings(List<String> stringList) {
        List<String> words1, words2;
        int count = stringList.size();
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                words1 = Arrays.asList(stringList.get(i).split(" "));
                words1.replaceAll(String::toLowerCase);
                words2 = Arrays.asList(stringList.get(j).split(" "));
                words2.replaceAll(String::toLowerCase);
                if (words1.containsAll(words2) &&
                        words2.containsAll(words1)) {
                    stringList.set(i, stringList.get(j));
                    stringList.remove(j);
                    j--;
                    count--;
                }
            }
        }
        return stringList;
    }
}
