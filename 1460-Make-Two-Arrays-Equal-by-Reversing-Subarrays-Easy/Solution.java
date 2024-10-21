class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        HashMap<Integer, Integer> values1 = new HashMap<>();
        HashMap<Integer, Integer> values2 = new HashMap<>();

        for (int i = 0; i < target.length; i++) {
            if (values1.containsKey(target[i])) {
                int add = values1.get(target[i]) + 1;
                values1.put(target[i], add);
            } else {
                values1.put(target[i], 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (values2.containsKey(arr[i])) {
                int add = values2.get(arr[i]) + 1;
                values2.put(arr[i], add);
            } else {
                values2.put(arr[i], 1);
            }
        } 

       boolean can = values1.entrySet().stream()
    .allMatch(entry -> entry.getValue().equals(values2.get(entry.getKey())));

    return can;

    }
}