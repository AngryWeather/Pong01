package com.github.angryweather.pong01;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class PlayerOne extends Player{
    ShapeRenderer shapeRenderer;
    private Paddle paddle = new Paddle();
    private final float x = 10f;
    private float y = 30f;


    public PlayerOne(ShapeRenderer shapeRenderer) {

        super(shapeRenderer);
    }

    @Override
    public void render() {
        this.shapeRenderer.rect(this.getX(), this.getY(), paddle.getWidth(), paddle.getHeight());
    }
}
