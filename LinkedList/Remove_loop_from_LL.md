# Question
- [Remove loop in Linked List](https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1) `Leetcode` `Medium`

# Solution

 public static void removeLoop(Node head){
       
        Node slow = head;
        Node fast = head;
        
       while(fast!=null && fast.next!=null){
           slow =slow.next;
           fast = fast.next.next;
           
           if(slow == fast){
               break;
           }
       }
       
       if(fast == head){
           while(fast.next!=slow){
               fast = fast.next;
           }
           fast.next = null;
       }
       else if(slow == fast){
           slow = head;
           
           while(slow.next!=fast.next){
               slow = slow.next;
               fast = fast.next;
              
           }
           fast.next = null;
       }
        
    }

