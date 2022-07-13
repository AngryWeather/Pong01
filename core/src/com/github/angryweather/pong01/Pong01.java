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
    private SpriteBatch batch;
    private GlyphLayout hello;
    private float helloCenterX;
    private float helloY;
    private Player playerOne;
    private Player playerTwo;

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

        playerOne = new Player(shapeRenderer, 20f, 20f);
        playerTwo = new Player(shapeRenderer, (SCREEN_WIDTH - 20f), (SCREEN_HEIGHT - 20f));


    }


    @Override
    public void render() {
        camera.update();
        shapeRenderer.setProjectionMatrix(camera.combined);

        ScreenUtils.clear(0.2f, 0.2f, 0.2f, 1);

        // render Paddles
        shapeRenderer.setColor(Color.WHITE);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        playerOne.render();
        playerTwo.render();
        shapeRenderer.end();

        batch.begin();
        helloFont.draw(batch, hello, helloCenterX, helloY);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        helloFont.dispose();
        shapeRenderer.dispose();
    }
}
