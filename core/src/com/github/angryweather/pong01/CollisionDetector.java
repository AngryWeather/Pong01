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
            if (player.getY() + player.getHeight() > wall.topWall) {
                return true;
            }
        } else {
            Ball ball = (Ball) entity;
            if (ball.getY() + ball.getHeight() > wall.topWall) {
                return true;
            }
        }
        return false;
    }

    public boolean isCollidingWithBottomWall(Wall wall, Object entity) {
        if (entity instanceof Player) {
            Player player = (Player) entity;
            if (player.getY() < wall.bottomWall) {
                return true;
            }
        } else {
            Ball ball = (Ball) entity;
            if (ball.getY() < wall.bottomWall) {
                return true;
            }
        }
        return false;
    }
}
