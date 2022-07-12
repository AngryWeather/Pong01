package com.github.angryweather.pong01;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class Player {
    ShapeRenderer shapeRenderer;
    int score = 0;


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
