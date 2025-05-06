package icetask4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Q2{

public class FindTriplets {
    public static void main(String[] args) {
        int[] arr = {1, -2, 0, 5, -4};
        
        
        List<List<Integer>> validTriplets = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    // Check if the sum of the triplet is 2
                    if (arr[i] + arr[j] + arr[k] == 2) {
                        // Add the valid triplet to the list
                        validTriplets.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    }
                }
            }
        }
        // Print the valid triplets
        if (validTriplets.isEmpty()) {
            System.out.println("No valid triplets found.");
        } else {
            System.out.println("Valid triplets (x <= y <= z and sum = 2):");
            for (List<Integer> triplet : validTriplets) {
                System.out.println(triplet);
            }
        }
    }
}
}
    
    