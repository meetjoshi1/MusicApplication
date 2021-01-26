import java.util.ArrayList;
import java.util.List;

public class User {

    private List<PlayList> playList = new ArrayList<>();

    public PlayList cretePlayList() {
        PlayList playList = new PlayList();
        this.playList.add(playList);
        return playList;
    }

    public List<PlayList> getPlayList() {
        return this.playList;
    }

    public void removePlayList(PlayList removeplayList) {
        this.playList.remove(removeplayList);
    }
}
