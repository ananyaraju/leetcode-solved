class ListNode {
    int data;
    ListNode next = null;
    ListNode(int data) {
        this.data = data;
    }
}

class MyLinkedList {

    ListNode head = null;
    int size = 0;

    public MyLinkedList() {
        head = null;
    }
    
    public int get(int index) {
        if (index>=size || index<0) return -1;
        ListNode curr = head;
        for (int i=0; i<index; i++) {
            curr = curr.next;
        }
        return curr != null ? curr.data : 0;
    }
    
    public void addAtHead(int val) {
        ListNode newhead = new ListNode(val);
        newhead.next = head;
        head = newhead;
        size++;        
    }
    
    public void addAtTail(int val) {
        if (head == null)
            head = new ListNode(val);
        else {
            ListNode curr = head;
            while (curr.next != null)
                curr = curr.next;
            curr.next = new ListNode(val);   
        }
        size++;     
    }
    
    public void addAtIndex(int index, int val) {
        if (index == size) addAtTail(val);
        else if (index>size) return;
        else {
            ListNode newnode = new ListNode(val);
            if (head == null)
                head = newnode;
            else if (index == 0) {
                newnode.next = head;
                head = newnode;
            }
            else {
                ListNode curr = head;
                ListNode prev = null;
                for (int i=0; i<index; i++) {
                    prev = curr;
                    curr = curr.next;
                }
                newnode.next = curr;
                prev.next = newnode;
            }
            size++;
        }     
    }
    
    public void deleteAtIndex(int index) {
        if (index>=size || index<0) return;
        ListNode curr = head;
        ListNode prev = null;
        for (int i=0; i<index; i++) {
            prev = curr;
            curr = curr.next;
        }
        if (prev == null)
            head = head.next;
        else
            prev.next = curr.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */