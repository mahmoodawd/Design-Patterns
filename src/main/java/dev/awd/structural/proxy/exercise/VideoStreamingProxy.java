package dev.awd.structural.proxy.exercise;

public class VideoStreamingProxy implements StreamingService {
    private final StreamingService service;
    private final User user;

    public VideoStreamingProxy(User user) {
        this.user = user;
        service = new VideoStreamingService();
    }

    @Override
    public void startStream(String mediaId) {
        if (user.hasPermission(mediaId)) {
            service.startStream(mediaId);
        } else System.err.println("NO PERMISSION");
    }
}
