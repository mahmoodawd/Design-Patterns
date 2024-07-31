package dev.awd.structural.proxy.exercise;

public class VideoStreamingService implements StreamingService {
    @Override
    public void startStream(String mediaId) {
        System.out.println("Playing media " + mediaId);
    }
}
