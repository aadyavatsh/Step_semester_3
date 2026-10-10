public class Q3 {
    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("No signal readings");
            return;
        }
        char bestColor = signalLog.charAt(0), currentColor = bestColor;
        int bestLength = 1, currentLength = 1;
        for (int i = 1; i < signalLog.length(); i++) {
            char c = signalLog.charAt(i);
            if (c == currentColor) currentLength++;
            else {
                currentColor = c;
                currentLength = 1;
            }
            if (currentLength > bestLength) {
                bestLength = currentLength;
                bestColor = currentColor;
            }
        }
        System.out.println("Longest Streak: '" + bestColor + "' | Length: " + bestLength);
    }
    public static void main(String[] args) { findLongestStreak("RRGGGYRR"); }
}
