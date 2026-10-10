import java.util.Arrays;
class Playlist {
    private final String[] songs;
    private int count;
    public Playlist(int capacity) { songs = new String[capacity]; }
    public boolean addSong(String song) {
        if (count == songs.length) return false;
        songs[count++] = song; return true;
    }
    public String[] getSongs() { return Arrays.copyOf(songs, count); }
    public int getSongCount() { return count; }
}
public class Q2 {
    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A"); p.addSong("Song B");
        String[] copy = p.getSongs();
        copy[0] = "Hacked";
        System.out.println(Arrays.toString(p.getSongs()));
        System.out.println(p.getSongCount());
    }
}
