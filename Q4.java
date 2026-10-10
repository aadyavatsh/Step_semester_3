public class Q4 {
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0, max = Integer.MIN_VALUE, maxIndex = -1;
        String maxSection = "";
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > max) { max = sectionA[i]; maxIndex = i; maxSection = "Section A"; }
            totalB += sectionB[i];
            if (sectionB[i] > max) { max = sectionB[i]; maxIndex = i; maxSection = "Section B"; }
        }
        String status = totalA == totalB ? "Balanced" : "Not Balanced";
        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB
                + " | Status: " + status + " | Highest Quantity: " + max
                + " (" + maxSection + ", Item " + (maxIndex + 1) + ")");
    }
    public static void main(String[] args) {
        analyzeInventory(new int[]{20,15,30}, new int[]{25,10,30});
    }
}
