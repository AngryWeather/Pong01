package com.github.angryweather.pong01;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

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

    }


    @Override
    public void render() {
        camera.update();
        shapeRenderer.setProjectionMatrix(camera.combined);

        ScreenUtils.clear(0.2f, 0.2f, 0.2f, 1);

        // render Paddles
        shapeRenderer.setColor(Color.WHITE);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        playerOne.render(shapeRenderer);
        playerTwo.render(shapeRenderer);

        // user input
        playerOne.move();
        playerTwo.move();
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
