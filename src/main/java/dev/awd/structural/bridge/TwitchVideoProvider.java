package dev.awd.structural.bridge;

public class TwitchVideoProvider extends VideoProvider {
    private final VideoQuality quality;

    public TwitchVideoProvider(VideoQuality quality) {
        this.quality = quality;
    }

    @Override
    public void playback(String videoId) {
        quality.render();
        System.out.println("Twitch is Playing " + videoId);
    }
}
