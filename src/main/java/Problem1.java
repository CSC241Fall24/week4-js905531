// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        ListNode dummy = new ListNode(0);
        dummy.next=l1;
        ListNode current = dummy;
        while (current.next != null){
            current = current.next;
        }
        current.next = new ListNode(l2.val);
        current = current.next;
        ListNode pointer = l2;
        while (pointer.next != null){
            current.next = new ListNode(pointer.next.val);
            current = current.next;
            pointer=pointer.next;
        }
        return dummy.next;
    }
}