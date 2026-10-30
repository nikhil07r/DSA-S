class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head, fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}
