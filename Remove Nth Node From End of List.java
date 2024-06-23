class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return null;
        }

        ListNode firstNode = head;
        ListNode secondNode = head;

        for(int i = 0; i < n; i++) {
            if(firstNode == null) {
                return head;
            }
            firstNode = firstNode.next;
        }

        if(firstNode == null) {
            return head.next;
        }

        while(firstNode.next != null) {
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }

        secondNode.next = secondNode.next.next;

        return head;
    }
}
