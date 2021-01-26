import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private List<Song> songs = new ArrayList<>();

    public PlayList() {
    }

    public List<Song> getSong() {
        return this.songs;
    }

    public void addSong(Song song){
        this.songs.add(song);
    }
}
