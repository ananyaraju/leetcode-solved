class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int elements[] = arr.clone();
        Arrays.sort(elements);
        int rank = 1;
        for (int x: elements)
            if (!map.containsKey(x))
                map.put(x, rank++);
        for (int i=0; i<arr.length; i++)
            arr[i] = map.get(arr[i]);
        return arr;
    }
}