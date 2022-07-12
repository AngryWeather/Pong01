package com.github.angryweather.pong01;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class Player {
    Paddle paddle;
    int score = 0;
    float x;
    float y;

    public Player() {

    }

    public int getScore() {
        return this.score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public abstract void render(ShapeRenderer shapeRenderer);
}
