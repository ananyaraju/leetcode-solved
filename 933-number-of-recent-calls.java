class RecentCounter {

    LinkedList<Integer> req;

    public RecentCounter() {
        this.req = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        this.req.addLast(t);
        while (this.req.getFirst() < t-3000)
            this.req.removeFirst();
        return this.req.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */