package com.github.angryweather.pong01;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Player {
    private final int width = 20;
    private final int height = 80;
    private int score = 0;
    private final float x;
    private float y;

    public Player(final float x, float y) {
        this.x = x;
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getScore() {
        return this.score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.rect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
