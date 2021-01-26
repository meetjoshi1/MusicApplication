public class User {

    private PlayList playList;

    public void cretePlayList(Song song) {
        this.playList = new PlayList(song);
    }

    public PlayList getPlayList() {
        return this.playList;
    }
}
