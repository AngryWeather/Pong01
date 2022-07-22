package com.github.angryweather.pong01;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class Player {
    private int score = 0;
    private final int width = 20;
    private final int height = 80;
    private final int speed = 100;
    private final float x;
    private float y;

    public Player(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.rect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

    public abstract void move();
}
