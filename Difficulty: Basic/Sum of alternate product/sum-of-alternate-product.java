//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    public int altProduct(int[] arr) {
        // Your code goes here
        
    //     int sum = 0;
        
    //     int product;
        
    //     Arrays.sort(arr);
        
    //     for(int i=0; i<=arr.length-1; i++) {
            
    //         int start = arr[i];
    //         int end = arr[(arr.length-1)-i];
            
    //         if(start > end) 
    //         {
    //             sum = sum + product(start,end);
    //         }
            
    //         start++;
    //         end--;
    //     }
        
    //     return sum;
    // }
    
    // public int product(int start, int end) {
    //     return start*end;
    // }
    
        int sum = 0;
        int n = arr.length;

        Arrays.sort(arr);  // Step 1: Sort the array

        // Step 2: Only go through half the array
        for (int i = 0; i < n / 2; i++) {
            int start = arr[i];
            int end = arr[n - 1 - i];
            sum += start * end;
        }

        return sum;
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
            int res = obj.altProduct(arr);

            System.out.println(res);

            // System.out.println("~");
        }
    }
}

// } Driver Code Ends