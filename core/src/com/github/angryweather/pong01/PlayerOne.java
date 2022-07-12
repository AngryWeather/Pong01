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
    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.rect(this.getX(), this.getY());
    }
}
