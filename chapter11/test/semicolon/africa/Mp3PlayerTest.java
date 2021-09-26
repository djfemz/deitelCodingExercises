package semicolon.africa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class Mp3PlayerTest {
    Mp3Player myMp3;

    @BeforeEach
    void setUp() {
        myMp3 = new Mp3Player();
        myMp3.power();
    }

    @Test
    void testThatMp3PlayerCanBeTurnedOn() {
        assertTrue(myMp3.isOn());
    }

    @Test
    void testThatMp3PlayerCanBeTurnedOff() {
        myMp3.power();
        assertFalse(myMp3.isOn());
    }

    @Test
    void testThatMp3PlayerCanPlayMusic() {
        Music newSong = new Music("ye", 1, Duration.ofSeconds(60));
        myMp3.play(newSong);
        assertEquals(newSong, myMp3.currentSong());
    }

    @Test
    void testThatMusicPlayerCanIncreaseVolumeInFivePercentIncrements() {
        myMp3.volumeUp();
        myMp3.volumeUp();
        assertEquals(10, myMp3.volume());
    }

    @Test
    void testThatVolumeCannotGoBeyondHundred() {
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeUp();

        assertEquals(100, myMp3.volume());
    }

    @Test
    void mp3playerCanDecreaseVolumeInFivePercentDecrement() {
        myMp3.volumeUp();
        myMp3.volumeUp();
        myMp3.volumeDown();
        assertEquals(5, myMp3.volume());
    }

    @Test
    void testThatVolumeCannotBeDecreaseBelowZero() {
        myMp3.volumeUp();
        myMp3.volumeDown();
        myMp3.volumeDown();
        assertEquals(0, myMp3.volume());
    }

    @Test
    void testThatMp3PlayerCanPauseMusic() {
        Music newSong = new Music("ye", 1, Duration.ofSeconds(60));
        myMp3.play(newSong);
        myMp3.pause();
        assertFalse(myMp3.isPlaying());
    }

    @Test
    void testThatMp3PlayerCanPlayNextMusic() {
        Music newSong = new Music("ye", 1, Duration.ofSeconds(60));
        Music newSongOne = new Music("hey boy", 2, Duration.ofSeconds(60));
        Music newSongTwo = new Music("booty call", 3, Duration.ofSeconds(60));
        Playlist defaultPlaylist = myMp3.getPlaylist("default playlist");
        defaultPlaylist.addToPlaylist(newSong);
        defaultPlaylist.addToPlaylist(newSongOne);
        defaultPlaylist.addToPlaylist(newSongTwo);
        myMp3.play(newSong);
        myMp3.next();
        myMp3.next();
        assertEquals(newSongTwo, myMp3.currentSong());
    }

    @Test
    void testThatMp3PlayerCanPlayPreviousMusic() {
        Music newSong = new Music("ye", 1, Duration.ofSeconds(60));
        Music newSongOne = new Music("hey boy", 2, Duration.ofSeconds(60));
        Music newSongTwo = new Music("booty call", 3, Duration.ofSeconds(60));
        Playlist defaultPlaylist = myMp3.getPlaylist("default playlist");
        defaultPlaylist.addToPlaylist(newSong);
        defaultPlaylist.addToPlaylist(newSongOne);
        defaultPlaylist.addToPlaylist(newSongTwo);
        myMp3.play(newSong);
        myMp3.next();
        myMp3.previous();
        assertEquals(newSong, myMp3.currentSong());
    }
}