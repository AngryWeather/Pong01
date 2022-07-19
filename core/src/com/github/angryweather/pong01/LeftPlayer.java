package com.github.angryweather.pong01;

public class LeftPlayer extends Player{
    private int score = 0;
    private final float x = 20f;
    private float y = 20f;

    public LeftPlayer() {
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
