# Question
- [234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) `Leetcode` `Easy`


<hr>

# Solution

 class Solution {
    
    ListNode left;
    public boolean isPalindrome(ListNode head) {
    
      ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reversed(slow);
        fast = head;
        
        while(slow!=null){
            if(fast.val != slow.val){
               return false;
            }
             slow = slow.next;
                fast = fast.next;
        }
         return true;
    }
    
    public ListNode reversed(ListNode head){
        
        ListNode prev = null;
        
        while(head!=null){
            ListNode next_node = head.next;
            
            head.next = prev;
            prev = head;
            head  = next_node ;
        }
        return prev;
    }
}

 <hr>   

 # Reference video
 - [LeetCode Palindrome Number Solution Explained](https://www.youtube.com/watch?v=UPdSViixmDs) `youtube`


 <hr>
 
 ![Screenshot (129)](https://user-images.githubusercontent.com/66193463/135141446-84264421-02dd-402d-beee-bf6bba7c038c.png)


