public class pangram {
    public static boolean isPangram(String sentence) {
        // Create a boolean array to mark the presence of each letter (A-Z)
        boolean[] alphabet = new boolean[26];
        int totalChars = 0; // Total alphabet characters found in the sentence

        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    totalChars++;
                }
            }
        }

        // Check if all 26 alphabet characters are present
        return totalChars == 26;
    }

    public static void main(String[] args) {
        String inputSentence = "The most important thing in the world is peace";
        boolean isPangram = isPangram(inputSentence);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

    }
}





