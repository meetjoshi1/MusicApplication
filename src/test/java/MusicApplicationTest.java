import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicApplicationTest {
    private User user ;
    @Before
    public void setUp() throws Exception {
        user = new User();
    }

    @Test
    public void checkPlaylist(){
        user.cretePlayList(null);
        assertEquals(null, user.getPlayList());
    }

    @Test
    public void addSonginPlayList(){
        Song song = new Song();
        user.cretePlayList(song);
        PlayList expectedList = user.getPlayList();
        assertEquals(song, expectedList.getSong() );
    }


}
