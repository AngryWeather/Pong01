package com.github.angryweather.pong01;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class RightPlayer extends Player implements Movable{

    public RightPlayer(float x, float y) {
        super(x, y);
    }

    @Override
    public boolean isScored(Ball ball) {
        return ball.getX() + ball.getWidth() > this.getX() + this.getWidth();
    }


    @Override
    public void move() {
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            moveUp();
        } else if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            moveDown();
        }
    }
}
