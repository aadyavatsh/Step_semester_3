import java.util.*;
public class Q5 {
    public static void printFilteredWordFrequency(String feedback) {
        String cleaned = feedback.toLowerCase().replace(".", " ").replace(",", " ")
                .replace("!", " ").replace("?", " ").replace(";", " ").replace(":", " ").trim();
        Set<String> stopWords = new HashSet<>(Arrays.asList("the","was","and","a","is","of","in"));
        Map<String, Integer> counts = new HashMap<>();
        if (!cleaned.isEmpty()) {
            for (String word : cleaned.split("\\s+")) {
                if (!stopWords.contains(word)) counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
        }
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(counts.entrySet());
        entries.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        for (Map.Entry<String, Integer> entry : entries)
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    public static void main(String[] args) {
        printFilteredWordFrequency("The mentor was great, the session was great and clear.");
    }
}
