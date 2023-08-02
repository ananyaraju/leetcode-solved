class Solution {
    public static boolean isLeap(int y) {
        if ((y % 400 == 0) || (y % 100 != 0) && (y % 4 == 0))
            return true;
        return false;
    }
    public int dayOfYear(String date) {
        String parts[] = date.split("-");
        int days[] = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = Integer.valueOf(parts[2]);
        for (int i=1; i<Integer.valueOf(parts[1]); i++) {
            sum += days[i-1];
        }
        if (isLeap(Integer.valueOf(parts[0])) && Integer.valueOf(parts[1])>2)
            sum++;
        return sum;
    }
}