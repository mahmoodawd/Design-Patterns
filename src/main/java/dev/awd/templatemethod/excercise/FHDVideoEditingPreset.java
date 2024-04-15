package dev.awd.templatemethod.excercise;

public class FHDVideoEditingPreset extends VideoEditingPreset {
    @Override
    protected void applyColorCorrection() {
        System.out.println("Applying FHD Color Correction");
    }

    @Override
    protected void renderVideo() {
        System.out.println("Rendering........");
    }
}
