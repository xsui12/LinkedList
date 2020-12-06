public class LinkedList {
    static class ListNode(
        int val; 
        ListNode next;
        public ListNode(int val) {
            this.val = val;
    }
    ListNode head; 
    ListNode tail;
    int size;
    public LinkedList() { 
        head = null;
        tail = null;
        size = 0;
    }
}
