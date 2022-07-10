package com.github.angryweather.pong01;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Pong01 extends ApplicationAdapter {

	static final int SCREEN_WIDTH = 1280;
	static final int SCREEN_HEIGHT = 720;

	OrthographicCamera camera;


	@Override
	public void create () {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1280, 720);
	}


	@Override
	public void render () {
		camera.update();
		ScreenUtils.clear(0.2f, 0.2f, 0.2f, 1);

	}
	
	@Override
	public void dispose () {

	}
}
