class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sw = new Stack<>();
        Queue<Integer> stu = new LinkedList<>();
        for (int i=0; i<students.length; i++) {
            stu.add(students[i]);
            sw.push(sandwiches[sandwiches.length-i-1]);
        }
        int n = students.length*sandwiches.length;
        while (n-- > 0) {
            if (!sw.isEmpty() && stu.peek() == sw.peek()) {
                stu.poll();
                sw.pop();
            }
            else {
                if (stu.size() > 0)
                    stu.add(stu.remove());
                else
                    return 0;
            }
        }
        return stu.size();
    }
}