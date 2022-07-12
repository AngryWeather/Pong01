package com.github.angryweather.pong01;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class Player {
    ShapeRenderer shapeRenderer;
    Paddle paddle;
    int score = 0;
    float x;
    float y;


    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }


    public float getX() {
        return x;
    }


    public Player(ShapeRenderer shapeRenderer) {
        this.shapeRenderer = shapeRenderer;
    }

    public int getScore() {
        return this.score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public abstract void render();
}
