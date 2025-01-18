package GUI;

import Component.Component;

public abstract class GUIElement implements Component {
    protected GUIElement parent;
    protected int x, y;
    protected float width, height;
    protected boolean isHovered, isPressed;

    public GUIElement(int x, int y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public abstract void update();

    public abstract void render();
}
