package dev.awd;


import dev.awd.structural.bridge.*;

public class Main {
    public static void main(String[] args) {
        VideoProvider youtubeVideoProvider = new YoutubeVideoProvider(new HDVideoQuality());
        VideoProvider twitchVideoProvider = new TwitchVideoProvider(new SDVideoQuality());


        youtubeVideoProvider.playback("123");

        twitchVideoProvider.playback("123");
    }
}