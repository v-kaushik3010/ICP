class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveDuplicatesfromSortedList_83 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        ListNode res = deleteDuplicates(head);
        while(res!= null){
            System.out.print(res.val + " ");
            res= res.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        
        ListNode res= head;
        while(head!= null && head.next!= null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }return res;
    }
}
