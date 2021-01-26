import jdk.internal.jimage.ImageStream;

import java.util.ArrayList;
import java.util.List;

public class User extends MusicLibrary{
    public MusicLibrary musicLibrary;
    private List<PlayList> playLists = new ArrayList<>();

    public PlayList cretePlayList() {
        PlayList playList = new PlayList();
        this.playLists.add(playList);
        return playList;
    }

    public List<PlayList> getPlayList() {
        return this.playLists;
    }

    public void removePlayList(PlayList removeplayList) {
        this.playLists.remove(removeplayList);
    }

//    public List<Song> serachSongFromLibrary(Song song1) {
//        return musicLibrary.displayMusicLibrary();
//    }
}

