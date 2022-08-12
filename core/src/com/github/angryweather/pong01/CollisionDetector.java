package com.github.angryweather.pong01;

import java.awt.*;

public class CollisionDetector {

    public CollisionDetector() {

    }


    public boolean isCollidingWithTopWall(Wall wall, Object entity) {
        if (entity instanceof Player) {
            Player player = (Player) entity;
            if (player.getY() + player.getHeight() > wall.topWall) {
                System.out.println("testCollision");
                return true;
            }
        }
        return false;
    }
}
