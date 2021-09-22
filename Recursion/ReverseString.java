## Question
- [Reverse String Question Link](https://leetcode.com/problems/reverse-string/) `Leetcode`

## Answer
class Solution {
    public void reverseString(char[] arr) {
        int left = 0;
        int right = arr.length-1;
        
        
        while(left<=right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
             left++;
             right--;
        }
       
        
    }
}
