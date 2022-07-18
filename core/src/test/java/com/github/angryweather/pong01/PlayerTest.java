package com.github.angryweather.pong01;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import junit.framework.TestCase;
import org.junit.Test;

public class PlayerTest extends TestCase {
    Player playerOne = new Player(20f, 20f);
    Player playerTwo = new Player(1280 - 40f, 720 - 100f);

    @Test
    public void testGetWidth() {
        assertEquals(20, playerOne.getWidth());
    }

    public void testGetHeight() {
        assertEquals(80, playerOne.getHeight());
    }

    public void testGetX() {
        assertEquals(20f, playerOne.getX());
        assertEquals(1240f, playerTwo.getX());
    }

    public void testGetY() {
        assertEquals(20f, playerOne.getY());
        assertEquals(620f, playerTwo.getY());
    }

    public void testSetY() {
    }

    public void testGetScore() {
        assertEquals(0, playerOne.getScore());
        assertEquals(0, playerTwo.getScore());
    }

    public void testSetScore() {
    }
}