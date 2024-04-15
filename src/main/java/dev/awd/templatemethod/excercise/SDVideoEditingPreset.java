package dev.awd.templatemethod.excercise;

public class SDVideoEditingPreset extends VideoEditingPreset {
    @Override
    protected void applyColorCorrection() {
        System.out.println("Applying SD Color Correction");
    }

    @Override
    protected void renderVideo() {
        System.out.println("Rendering........");
    }
}
