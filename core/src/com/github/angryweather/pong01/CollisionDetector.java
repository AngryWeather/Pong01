package com.github.angryweather.pong01;

public class CollisionDetector {

    public CollisionDetector() {

    }

    public boolean isColliding(Wall wall, Player player) {
        if (player.getY() + player.getHeight() > wall.topWall) {
            System.out.println("true");
            return true;
        } else {
            return false;
        }

    }
}
