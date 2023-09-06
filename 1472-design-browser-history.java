class BrowserHistory {

    class Node {
        String page;
        Node prev;
        Node next;
        Node(String page) {
            this.page = page;
            prev = null;
            next = null;
        }
    }

    Node head;
    Node curr;

    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        curr = head;
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        curr.next = newNode;
        newNode.prev = curr;
        curr = newNode;
    }
    
    public String back(int steps) {
        while (steps > 0 && curr.prev != null) {
            curr = curr.prev;
            steps--;
        }
        return curr.page;
    }
    
    public String forward(int steps) {
        while (steps > 0 && curr.next != null) {
            curr = curr.next;
            steps--;
        }
        return curr.page;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */