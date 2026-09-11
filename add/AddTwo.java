package add;

/*
    Name: Rayna
    Partner A: Min Myat Thu
    Partner B: Bao Tran
*/

public class AddTwo {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(l1.val + l2.val);
        ListNode current = result;
        while(l1.next != null && l2.next != null) {
            current.next = new ListNode(l1.next.val + l2.next.val);
            l1 = l1.next;
            l2 = l2.next;
            current = current.next;
        }
        while(l1.next != null) {
            current.next = new ListNode(l1.next.val);
            l1 = l1.next;
            current = current.next;
        }
        while(l2.next != null) {
            current.next = new ListNode(l2.next.val);
            l2 = l2.next;
            current = current.next;
        }
        
        current = result;
        while(current.next != null) {
            if(current.val >= 10) {
                current.val -= 10;
                current.next.val++;
            }
            current = current.next;
        }
        if(current.val >= 10) {
            current.val -= 10;
            current.next = new ListNode(1);
        }

        return result;
    }
}