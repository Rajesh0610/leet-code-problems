class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode a = head;

        while (a != null && a.next != null) {
            if (a.val == a.next.val) {
                a.next = a.next.next; // remove duplicate
            } else {
                a = a.next;
            }
        }

        return head;
    }
}