 Question
- [876. Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) `Leetcode`

<hr>

# Solution

  public ListNode middleNode(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
              slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
    }
    
    
    <hr>
    
   # Reference video
 - [Find the Middle Element of a LinkedList](https://www.youtube.com/watch?v=4JXC2Iq8T3c) `youtube`
    
  ![Screenshot (124)](https://user-images.githubusercontent.com/66193463/134958555-e491d44d-719d-46b0-8077-ff1a41b1129a.png)




