public class Q5 {
    public static void classifyWordLengths(String review) {
        int shortWords = 0, mediumWords = 0, longWords = 0;
        String cleaned = review.replaceAll("[^A-Za-z0-9\\s]", " ").trim();
        if (!cleaned.isEmpty()) {
            for (String word : cleaned.split("\\s+")) {
                int length = word.length();
                if (length <= 4) shortWords++;
                else if (length <= 8) mediumWords++;
                else longWords++;
            }
        }
        System.out.println("Short: " + shortWords + " | Medium: " + mediumWords + " | Long: " + longWords);
    }
    public static void main(String[] args) {
        classifyWordLengths("This movie was absolutely fantastic and thrilling");
    }
}
