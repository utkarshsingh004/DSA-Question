class Solution {

    private void swap(char[] c, int i, int j) {
        while (i < j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
    }

    private String rotate(char[] arr, int k) {
        int n = arr.length;
        char[] goal = arr.clone(); // fresh copy every time

        // left rotate by k positions using reversal method
        swap(goal, 0, k - 1);
        swap(goal, k, n - 1);
        swap(goal, 0, n - 1);

        return new String(goal); 
    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            String rotated = rotate(ch, i);
            if (rotated.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
