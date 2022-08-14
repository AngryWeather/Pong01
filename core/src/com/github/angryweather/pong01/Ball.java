package com.github.angryweather.pong01;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.Random;

public class Ball implements Movable {
    final int width = 20;
    final int height = 20;
    float x = Pong01.SCREEN_WIDTH / 2f  - getWidth() / 2f;
    float y = Pong01.SCREEN_HEIGHT / 2f - getHeight() / 2f;
    float dx;
    float dy;

    public float getDx() {
        return dx;
    }

    public void setDx(float dx) {
        this.dx = dx;
    }

    public float getDy() {
        return dy;
    }

    public void setDy(float dy) {
        this.dy = dy;
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

    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.rect(getX(), getY(), getWidth(), getHeight());
    }

    public void centerBall() {
        setX(Pong01.SCREEN_WIDTH / 2f  - getWidth() / 2f);
        setY(Pong01.SCREEN_HEIGHT / 2f - getHeight() / 2f);
    }
    @Override
    public void move() {
        setX(getX() + getDx() * Gdx.graphics.getDeltaTime());
        setY(getY() + getDy() * Gdx.graphics.getDeltaTime());
    }
}
