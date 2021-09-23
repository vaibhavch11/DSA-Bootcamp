# Question
- [Check if array is sorted ](https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1#) `GFG`


# Solution


class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
         if(n == 0 || n == 1){
              return true;
          }
    
         if(arr[n-1]<arr[n-2]){
              return false;
          }
          
          return arraySortedOrNot(arr,n-1);
         
        
    }
}

![Screenshot (111)](https://user-images.githubusercontent.com/66193463/134552642-cf03114a-1071-4059-9059-113ec5637bd6.png)
