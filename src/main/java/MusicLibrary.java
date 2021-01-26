import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
    private List<Song> musicLibrarysongs = new ArrayList<>();
    public void addSongs(Song song) {
        this.musicLibrarysongs.add(song);
    }

    public List<Song> displayMusicLibrary() {
        return this.musicLibrarysongs;
    }
}
