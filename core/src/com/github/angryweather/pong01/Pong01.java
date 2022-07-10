package com.github.angryweather.pong01;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Pong01 extends ApplicationAdapter {

	static final int SCREEN_WIDTH = 1280;
	static final int SCREEN_HEIGHT = 720;

	private OrthographicCamera camera;
	private BitmapFont helloFont;
	private SpriteBatch batch;
	private GlyphLayout hello;
	private float helloCenterX;
	private float helloY;
	private final int offsetHelloY = 50;


	@Override
	public void create () {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1280, 720);

		helloFont = new BitmapFont();
		hello = new GlyphLayout();
		hello.setText(helloFont, "Hello\nPong!");
		helloCenterX = (this.SCREEN_WIDTH - hello.width) / 2;
		helloY = (this.SCREEN_HEIGHT - offsetHelloY);
		helloFont.getData().setScale(1.3f);

		batch = new SpriteBatch();


	}


	@Override
	public void render () {
		camera.update();
		ScreenUtils.clear(0.2f, 0.2f, 0.2f, 1);

		batch.begin();
		helloFont.draw(batch, hello, helloCenterX, helloY);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		helloFont.dispose();
	}
}
