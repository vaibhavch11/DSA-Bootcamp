# Question
- [326. Power of Three](https://leetcode.com/problems/power-of-three/submissions/) `Leetcode`


# Solution
class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n == 0) return false;
        if(n == 1) return true;
        
        if(n%3 == 0){
            return isPowerOfThree(n/3);
        }
        else{
            return false;
        }
        
    }
}


![Screenshot (115)](https://user-images.githubusercontent.com/66193463/134554358-1a3b931f-63ea-4319-936f-dabfc023ddfa.png)
