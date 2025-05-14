//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    int findSum(int arr[]) {
        // code here
        // int sum =0;
        
        
        // for(int i=0; i<arr.length; i++) {
        //     boolean isDuplicate = false;
        //     int count =0;
            
        //     for(int j=0; j<arr.length; j++) {
        //         if(arr[i] == arr[j]) {
        //             count++;
        //             isDuplicate = true;
        //         }
        //     }
            
        //     if(count == 1) {
        //         sum +=arr[i];
        //     }
        // }
        
        // return sum;
        
        
        //Second approach
        
        //   Map<Integer, Integer> freqMap = new HashMap<>();

        // // Step 1: Count frequency of each number
        // for (int num : arr) {
        //     freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        // }

        // // Step 2: Sum elements that appear exactly once
        // int sum = 0;
        // for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
        //     if (entry.getValue() == 1) {
        //         sum += entry.getKey();
        //     }
        // }

        // return sum;
        
        //Third approach - java 8
        int result = Arrays.stream(arr).distinct().sum();
        return result;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.findSum(arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends