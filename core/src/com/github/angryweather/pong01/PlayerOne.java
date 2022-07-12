package com.github.angryweather.pong01;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class PlayerOne extends Player{
    ShapeRenderer shapeRenderer;
    private Paddle paddle = new Paddle();
    private final float x = 30f;
    private float y = 30f;


    public PlayerOne(ShapeRenderer shapeRenderer) {

        super(shapeRenderer);
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    @Override
    public void render() {
        super.shapeRenderer.rect(this.getX(), this.getY(), paddle.getWidth(), paddle.getHeight());
    }
}
