package com.github.angryweather.pong01;



import org.junit.Assert;
import org.junit.Test;

public class PaddleTest {
    Paddle paddle = new Paddle();

    @Test
    public void testGetWidth() {
        Assert.assertEquals(20, paddle.getWidth());
    }

}