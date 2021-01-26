import java.util.ArrayList;
import java.util.List;

public class User {

    private List<PlayList> playList = new ArrayList<>();

    public void cretePlayList() {
        this.playList.add( new PlayList());
    }

    public List<PlayList> getPlayList() {
        return this.playList;
    }
}
