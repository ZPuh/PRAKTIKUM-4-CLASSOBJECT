package no12;

public class SpaceCraft {

    private int xPos;
    private int yPos;
    
    public void up() {
        yPos--;
    }

    public void down() {
        yPos++;
    }

    public void left() {
        xPos--;
    }

    public void right() {
        xPos++;
    }    
}
