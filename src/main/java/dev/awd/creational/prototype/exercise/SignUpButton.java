package dev.awd.creational.prototype.exercise;

public class SignUpButton extends GUIButton{
    public SignUpButton(String label, String tooltip, String color, int xPosition, int yPosition) {
        super(label, tooltip, color, xPosition, yPosition);
    }

    @Override
    public GUIButton clone() throws CloneNotSupportedException {
        return new SignUpButton(this.label, this.tooltip, this.color, this.xPosition, this.yPosition);
    }
}
