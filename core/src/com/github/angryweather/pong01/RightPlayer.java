package com.github.angryweather.pong01;

public class RightPlayer extends Player{
    private int score;
    private final float x = Pong01.SCREEN_WIDTH - 40f;
    private float y = Pong01.SCREEN_HEIGHT - 100f;

    public RightPlayer() {
        super();
    }

    @Override
    public float getX() {
        return this.x;
    }

    @Override
    public float getY() {
        return this.y;
    }

    @Override
    public void setY(float y) {
        this.y = y;
    }

    @Override
    public int getScore() {
        return this.score;
    }

    @Override
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void move() {

    }


}
