import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MusicApplicationTest {
    private User user ;
    private Song song;
    private Song song1;
    private Song song2;
    private Song song3;

    @Before
    public void setUp() throws Exception {
        user = new User();
        song = new Song("","","");
        song1 = new Song("Rihana1 Song","Jezz","Rehana");
        song2 = new Song("Rihana2 Song","Jezz","Rehana");
        song3 = new Song("Rihana3 Song","Jezz","Rehana");
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
        playList.get(0).addSong(song1);
        playList.get(0).addSong(song2);
        playList.get(0).addSong(song3);

        assertEquals(4, user.getPlayList().get(0).getSong().size());
        assertEquals(song1, user.getPlayList().get(0).getSong().get(1));

    }

    @Test
    public void removeSongfrom_PlayList(){

       user.cretePlayList();
       user.getPlayList().get(0).addSong(song1);
       user.getPlayList().get(0).addSong(song2);
       List<PlayList> playList = user.getPlayList();
       playList.get(0).removeSong(song1);

        assertEquals(1, user.getPlayList().get(0).getSong().size());
        assertFalse(user.getPlayList().get(0).getSong().contains(song1));
    }

    @Test
    public void removePlayList(){
       PlayList playList1 =  user.cretePlayList();
       PlayList playList2 = user.cretePlayList();
       PlayList playList3 = user.cretePlayList();

       user.removePlayList(playList2);

       assertEquals(2,user.getPlayList().size());
       assertFalse(user.getPlayList().contains(playList2));

    }

    @Test
    public void arrangePlayList(){
        user.cretePlayList();
        user.getPlayList().get(0).addSong(song1);
        user.getPlayList().get(0).addSong(song2);

        assertEquals(song1, user.getPlayList().get(0).getSong().get(0));
        assertEquals(song2, user.getPlayList().get(0).getSong().get(1));

        user.getPlayList().get(0).getSong().set(0,song2);
        user.getPlayList().get(0).getSong().set(1,song1);

        assertEquals(song2, user.getPlayList().get(0).getSong().get(0));
        assertEquals(song1, user.getPlayList().get(0).getSong().get(1));
   }

   @Test
   public void availableSongs(){
      MusicLibrary  musicLibrary = new MusicLibrary();
      musicLibrary.addSongs(song1);
      musicLibrary.addSongs(song2);

      musicLibrary.displayMusicLibrary();
      assertEquals(2, musicLibrary.displayMusicLibrary().size());
   }






}
