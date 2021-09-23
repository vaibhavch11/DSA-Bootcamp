# Question
- [231. Power of Two](https://leetcode.com/problems/power-of-two/) `Leetcode`


# Solution
class Solution {
    public boolean isPowerOfTwo(int n) {
        
    
        
        if(n == 0) return false;
        if(n == 1) return true;
        
        if(n%2 == 0){
            return isPowerOfTwo(n/2);
        }
        else{
            return false;
        }

    }
}





![Screenshot (114)](https://user-images.githubusercontent.com/66193463/134553980-25d4b074-32a6-4bd7-a3ba-3be3ec695a1d.png)
