class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        char[] arr = word.toCharArray(); // Convert string to char array
        int j = -1;

        // Find the first occurrence of ch
        for (int i = 0; i < n; i++) {
            if (arr[i] == ch) { // Compare characters directly
                j = i;
                break; // Stop at the first occurrence
            }
        }

        // If ch is not found, return the original word
        if (j == -1) return word;

        // Reverse from 0 to j
        int i = 0;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return new String(arr); 
    }
}
