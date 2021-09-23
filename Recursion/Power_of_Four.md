# Question
- [342. Power of Four](https://leetcode.com/problems/power-of-four/) `Leetcode`


# Solution
class Solution {
    public boolean isPowerOfFour(int n) {
          
        if(n == 0) return false;
        if(n == 1) return true;
        
        if(n%4 == 0){
            return isPowerOfFour(n/4);
        }
        else{
            return false;
        }
    }
}




![Screenshot (116)](https://user-images.githubusercontent.com/66193463/134554764-1c602b23-18e7-4b93-956f-62f04db3aacd.png)
