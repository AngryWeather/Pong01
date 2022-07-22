package com.github.angryweather.pong01;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class LeftPlayer extends Player{

    public LeftPlayer(float x, float y) {
        super(x, y);
    }


    @Override
    public void move() {
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            setY(getY() + getSpeed() * Gdx.graphics.getDeltaTime());
            System.out.println(getY());
        }
    }
}
