package dev.awd.templatemethod.excercise;

public class HDVideoEditingPreset extends VideoEditingPreset {
    @Override
    protected void applyColorCorrection() {
        System.out.println("Applying HD Color Correction");
    }

    @Override
    protected void renderVideo() {
        System.out.println("Rendering........");
    }
}
