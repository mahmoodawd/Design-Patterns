package dev.awd.creational.prototype.exercise;

public class LoginButton extends GUIButton{
    public LoginButton(String label, String tooltip, String color, int xPosition, int yPosition) {
        super(label, tooltip, color, xPosition, yPosition);
    }

    @Override
    public GUIButton clone() throws CloneNotSupportedException {
        return new LoginButton(this.label, this.tooltip, this.color, this.xPosition, this.yPosition);
    }
}
