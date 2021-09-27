# Question
- [141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) `Leetcode`


<hr>

# Solution

 public boolean hasCycle(ListNode head) {
        
        if(head==null || head.next==null){
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return true;
            }
        }
        return false;
        
    }
    
 <hr>   
    
 # Reference video
 - [Detect a Cycle in Linked List](https://www.youtube.com/watch?v=354J83hX7RI) `youtube`
  

 <hr>
    
  ![Screenshot (126)](https://user-images.githubusercontent.com/66193463/134955631-b6aaa10f-8325-4710-9174-c0f773aafa6c.png)





