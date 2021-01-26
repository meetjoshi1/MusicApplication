import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MusicApplicationTest {
    private User user ;
    private Song song;

    @Before
    public void setUp() throws Exception {
        user = new User();
        song = new Song("");
    }

    @Test
    public void checkPlaylist(){
        user.cretePlayList();
        assertNotNull(user.getPlayList().get(0));
    }

    @Test
    public void addSonginPlayList(){
        user.cretePlayList();
        user.getPlayList().get(0).addSong(song);
        List<PlayList> actualList = user.getPlayList();
        assertEquals(song, actualList.get(0).getSong().get(0));

        List<PlayList> playList = user.getPlayList();
        Song song1 = new Song("Rihana1 Song");
        Song song2 = new Song("Rihana2 Song");
        Song song3 = new Song("Rihana3 Song");

        playList.get(0).addSong(song1);
        playList.get(0).addSong(song2);
        playList.get(0).addSong(song3);

        assertEquals(4, user.getPlayList().get(0).getSong().size());
        assertEquals(song1, user.getPlayList().get(0).getSong().get(1));

    }


}
