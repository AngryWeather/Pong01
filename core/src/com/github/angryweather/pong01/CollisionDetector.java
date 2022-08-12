package com.github.angryweather.pong01;

import java.awt.*;

public class CollisionDetector {

    public CollisionDetector() {

    }


    public boolean isCollidingWithTopBottomWall(Wall wall, Object entity) {
        if (entity instanceof Player) {
            Player player = (Player) entity;
            System.out.println(player.getY());
            if (player.getY() < wall.bottomWall) {
                return true;
            }
        }
        return false;
    }
}
