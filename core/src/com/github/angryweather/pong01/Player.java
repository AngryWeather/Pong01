package com.github.angryweather.pong01;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Player {
    final ShapeRenderer shapeRenderer;
    private final int width = 20;
    private final int height = 80;
    private int score = 0;
    private float x;
    private float y;

    public Player(ShapeRenderer shapeRenderer, float x, float y) {
        this.shapeRenderer = shapeRenderer;
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

    public void setX(float x) {
        this.x = x;
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
    public void render() {
        shapeRenderer.rect(x, y, this.getWidth(), this.getHeight());
    }
}
