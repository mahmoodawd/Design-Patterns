package dev.awd.structural.bridge;

public class YoutubeVideoProvider extends VideoProvider {
    VideoQuality quality;

    public YoutubeVideoProvider(VideoQuality quality) {
        this.quality = quality;
    }

    @Override
    public void playback(String videoId) {
        quality.render();
        System.out.println("Youtube is Playing " + videoId);
    }
}
