package dev.awd.creational.prototype.exercise;

public abstract class GUIButton implements Cloneable {
    protected String label;
    protected String tooltip;
    protected String color;
    protected int xPosition;
    protected int yPosition;

    public GUIButton(String label, String tooltip, String color, int xPosition, int yPosition) {
        this.label = label;
        this.tooltip = tooltip;
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public String getLabel() {
        return label;
    }

    public String getTooltip() {
        return tooltip;
    }

    public String getColor() {
        return color;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    @Override
        public abstract GUIButton clone() throws CloneNotSupportedException;
}
