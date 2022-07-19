package com.github.angryweather.pong01;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class Player {
    private final int width = 20;
    private final int height = 80;
    private final int speed = 100;

    public Player() {

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public abstract float getX();

    public abstract float getY();

    public abstract void setY(float y);

    public abstract int getScore();
    public abstract void setScore(int score);
    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.rect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

    public abstract void move();
}
