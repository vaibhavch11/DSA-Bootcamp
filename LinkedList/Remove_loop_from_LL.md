# Question
- [Remove loop in Linked List](https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1) `Leetcode` `Medium`


<hr>
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
    
 <hr>
 # Reference Video
- [Delete a Loop in a Linked List](https://www.youtube.com/watch?v=aIR0s1tY2Vk) `youtube`

<hr>


![Screenshot (127)](https://user-images.githubusercontent.com/66193463/134959127-f2042ab4-bfd8-4ccb-957b-4e7b58fde01a.png)

    
    

