package semicolon.africa;

import java.time.Duration;

public class Music {
    private  String name;
    private int trackId;
    private Duration length;

    public Music(String name, int trackId, Duration length) {
        this.name = name;
        this.trackId = trackId;
        this.length = length;
    }

    @Override
    public String toString() {
        String returnString = "";
        return returnString + name + " " + trackId;
    }

    public Duration songDuration() {
        return length;
    }

    public int trackId(){
        return trackId;
    }
}
