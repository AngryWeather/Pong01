package com.github.angryweather.pong01;

import java.awt.*;

public class CollisionDetector {

    public CollisionDetector() {

    }

    public boolean isPlayerCollidingWithBall(Ball ball, Player player) {
        if (ball.getX() < player.getX() + player.getHeight() && ball.getX() + ball.getHeight() > player.getX()
                && ball.getY() < player.getY() + player.getHeight()
                && ball.getY() + ball.getHeight() > player.getY()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCollidingWithTopWall(Wall wall, Object entity) {
        if (entity instanceof Player) {
            Player player = (Player) entity;
            return player.getY() + player.getHeight() > wall.topWall;
        } else {
            Ball ball = (Ball) entity;
            return ball.getY() + ball.getHeight() > wall.topWall;
        }
    }

    public boolean isCollidingWithBottomWall(Wall wall, Object entity) {
        if (entity instanceof Player) {
            Player player = (Player) entity;
            return player.getY() < wall.bottomWall;

        } else {
            Ball ball = (Ball) entity;
            return ball.getY() < wall.bottomWall;
        }
    }
}
