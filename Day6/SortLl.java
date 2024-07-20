class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        if(head == null && head.next == null){
            return head;
        }
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        Node start = head;
        while(start!=null ){
            if(start.data==0)
                count_0 +=1;
            else if(start.data==1)
                count_1 += 1;
            else
                count_2 +=2;
            start = start.next;
        }
        start = head;
        while(start!=null){
            if(count_0>0){
                start.data = 0;
                count_0 -= 1;
            }
            else if(count_1>0){
                start.data = 1;
                count_1 -= 1;
            }
            else if(count_2>0){
                start.data = 2;
                count_2 -= 1;
            }
            start = start.next;
        }
        return head;
    }
}
