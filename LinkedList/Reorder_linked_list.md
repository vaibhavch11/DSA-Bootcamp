# Question
- [143. Reorder List](https://leetcode.com/problems/reorder-list/) `Leetcode`


<hr>

# Solution

 
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return;
        }
        
        ListNode last = head.next;
        ListNode seclast = head;
        
        while(last.next!=null){
            last = last.next;
            seclast = seclast.next;
        }
        
               
        ListNode temp = head.next;
        head.next = last;
        last.next = temp;
        seclast.next = null;
        
        
        reorderList(temp);  
 
    }

 <hr>   

 # Reference video
 - [Fold a Linked List](https://www.youtube.com/watch?v=U4M9O8UxB6I) `youtube`


 <hr>

![Screenshot (132)](https://user-images.githubusercontent.com/66193463/135320593-5f2d86c6-b727-47b0-b0aa-caf923131106.png)
