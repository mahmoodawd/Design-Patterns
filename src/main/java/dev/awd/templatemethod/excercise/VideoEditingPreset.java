package dev.awd.templatemethod.excercise;

import java.util.List;

public abstract class VideoEditingPreset {


    public void applyPreset(List<Preset> presets) {
        enhanceVideoQuality();
        applyColorCorrection();
        enhanceAudioQuality();
        applyFilters();
        renderVideo();
    }

    private void enhanceVideoQuality() {
        System.out.println("Enhancing Video in Progress.....");
    }

    abstract protected void applyColorCorrection();

    private void enhanceAudioQuality() {
        System.out.println("Enhancing Audio in Progress.....");
    }

    private void applyFilters() {
        System.out.println("Applying Filters.....");
    }

    abstract protected void renderVideo();
}
