package com.github.angryweather.pong01;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Ball {
    final int width = 20;
    final int height = 20;
    float x = Pong01.SCREEN_WIDTH / 2f  - getWidth() / 2f;
    float y = Pong01.SCREEN_HEIGHT / 2f + getHeight() / 2f;

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

    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.rect(getX(), getY(), getWidth(), getHeight());
    }
}
