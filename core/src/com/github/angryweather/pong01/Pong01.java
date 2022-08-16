package com.github.angryweather.pong01;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.Random;

public class Pong01 extends ApplicationAdapter {

    static final int SCREEN_WIDTH = 1280;
    static final int SCREEN_HEIGHT = 720;
    ShapeRenderer shapeRenderer;
    private OrthographicCamera camera;
    private BitmapFont helloFont;
    private BitmapFont scoreOneFont;
    private BitmapFont scoreTwoFont;
    private SpriteBatch batch;
    private GlyphLayout hello;
    private GlyphLayout scoreOne;
    private GlyphLayout scoreTwo;
    private float helloCenterX;
    private float helloY;
    private LeftPlayer playerOne;
    private RightPlayer playerTwo;
    private Wall wall;
    private CollisionDetector collisionDetector;
    private Ball ball;
    private String gameState;

    @Override
    public void create() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 1280, 720);

        helloFont = new BitmapFont();
        hello = new GlyphLayout();
        hello.setText(helloFont, "Hello\nPong!");
        helloCenterX = (SCREEN_WIDTH - hello.width) / 2;
        int offsetHelloY = 50;
        helloY = (SCREEN_HEIGHT - offsetHelloY);
        helloFont.getData().setScale(1.3f);

        shapeRenderer = new ShapeRenderer();
        batch = new SpriteBatch();


        playerOne = new LeftPlayer(20f, 20f);
        // playerTwo position is based on player's width and height
        playerTwo = new RightPlayer(this.SCREEN_WIDTH - 40f, this.SCREEN_HEIGHT - 100f);


        // score fonts
        scoreOneFont = new BitmapFont();
        scoreOneFont.getData().scale(5f);
        scoreTwoFont = new BitmapFont();
        scoreTwoFont.getData().scale(5f);
        scoreOne = new GlyphLayout();
        scoreTwo = new GlyphLayout();
        scoreOne.setText(scoreOneFont, Integer.toString(playerOne.getScore()));
        scoreTwo.setText(scoreTwoFont, Integer.toString(playerTwo.getScore()));

        wall = new Wall();
        collisionDetector = new CollisionDetector();

        ball = new Ball();

        gameState = "Menu";
    }


    @Override
    public void render() {
        camera.update();
        shapeRenderer.setProjectionMatrix(camera.combined);

        ScreenUtils.clear(0.2f, 0.2f, 0.2f, 1);

        // render Paddles and the ball
        shapeRenderer.setColor(Color.WHITE);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        playerOne.render(shapeRenderer);
        playerTwo.render(shapeRenderer);

        ball.render(shapeRenderer);

        // user input
        playerOne.move();
        playerTwo.move();


        if (Gdx.input.isKeyPressed(Input.Keys.ENTER)) {
            if (gameState.equals("Menu")) {
                gameState = "Play";
                Random randomX = new Random();
                Random randomY = new Random();

                ball.setDx((randomX.nextFloat(0, 2)) > 1 ? 400 : -400);
                ball.setDy(randomY.nextFloat(-400, 401));

            } else if (gameState.equals("Play")) {
                gameState = "Menu";
            }

        }

        if (gameState.equals("Menu")) {
            ball.centerBall();
        } else {
            ball.move();
            if (collisionDetector.isCollidingWithTopWall(wall, ball)
                    || collisionDetector.isCollidingWithBottomWall(wall, ball)) {
                ball.setDy(-ball.getDy());
            }
            if (collisionDetector.isPlayerCollidingWithBall(ball, playerOne)
                    || collisionDetector.isPlayerCollidingWithBall(ball, playerTwo)) {
                System.out.println("COLLISION!!!");
//                System.out.println("playerOne: " + playerOne.getX() + playerOne.getHeight() + " ball: " + ball.getX());
//                System.out.println("playerTwo: " + playerTwo.getX() + " ball: " + ball.getX());
                Random randomY = new Random();
                ball.setDx(-ball.getDx());
                ball.setDy(randomY.nextFloat(-400, 401));
            }
        }


        if (collisionDetector.isCollidingWithTopWall(wall, playerOne)) {
            playerOne.setY(wall.topWall - playerOne.getHeight());
        } else if (collisionDetector.isCollidingWithBottomWall(wall, playerOne)) {
            playerOne.setY(wall.bottomWall);
        } else if (collisionDetector.isCollidingWithTopWall(wall, playerTwo)) {
            playerTwo.setY(wall.topWall - playerTwo.getHeight());
        } else if (collisionDetector.isCollidingWithBottomWall(wall, playerTwo)) {
            playerTwo.setY(wall.bottomWall);
        }

        shapeRenderer.end();

        batch.begin();
        helloFont.draw(batch, hello, helloCenterX, helloY);
        scoreOneFont.draw(batch, scoreOne, 400, SCREEN_HEIGHT - 50);
        scoreTwoFont.draw(batch, scoreTwo, SCREEN_WIDTH - 400 - scoreTwo.width, SCREEN_HEIGHT - 50);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        helloFont.dispose();
        scoreOneFont.dispose();
        shapeRenderer.dispose();
    }
}
