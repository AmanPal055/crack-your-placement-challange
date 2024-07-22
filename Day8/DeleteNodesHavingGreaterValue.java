class Solution
{
    Node compute(Node head)
    {
        if(head.next == null)
            return head;
        Node connect = compute(head.next);
        if(head.data>=connect.data){
            head.next = connect;
            return head;
        }
        return connect;
    }
}
