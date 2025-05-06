package icetask4;

import java.util.ArrayList; 
public class Q1 {
     public class ArrayListToArray {
    public static void main(String[] args) {
       ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("Biology");
        subjects.add("Probability");

        
        String[] subjectsArray = new String[subjects.size()];
        subjectsArray = subjects.toArray(subjectsArray);

        for (String subject : subjectsArray) {
            System.out.println(subject);
        }
    }
}
}
