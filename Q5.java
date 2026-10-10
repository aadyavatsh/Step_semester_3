import java.util.Arrays;
public class Q5 implements Comparable<Q5> {
    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;

    public Q5(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name; this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage; this.injured = injured;
    }
    public static boolean isDraftable(int matchesPlayed) { return matchesPlayed >= 10; }
    public static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }
    @Override public int compareTo(Q5 other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }
    public static String draftAndRank(Q5[] players) {
        Q5[] selected = new Q5[players.length];
        int count = 0;
        for (Q5 p : players)
            if (isDraftable(p.matchesPlayed) || isDraftable(p.matchesPlayed, p.injured))
                selected[count++] = p;
        selected = Arrays.copyOf(selected, count);
        Arrays.sort(selected);
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < selected.length; i++) {
            if (i > 0) out.append(" | ");
            out.append(i + 1).append(". ").append(selected[i].name);
        }
        return out.toString();
    }
    public static void main(String[] args) {
        Q5[] players = {
            new Q5("Virat",15,48.0,false), new Q5("Rahul",7,55.0,false),
            new Q5("Sameer",3,60.0,false), new Q5("Dev",12,20.0,true)
        };
        System.out.println(draftAndRank(players));
    }
}
