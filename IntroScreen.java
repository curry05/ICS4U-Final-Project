package com.feori.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class IntroScreen implements Screen {
    private FeoriGame game;
    private SpriteBatch batch;
    private Texture logo;

    public IntroScreen(FeoriGame game) {
        this.game = game;
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
        logo = new Texture("images/yuchien.png"); // put in core/assets
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        batch.draw(logo, 200, 150);
        batch.end();
    }

    @Override public void resize(int width, int height) {}
    @Override public void pause() {}
    @Override public void resume() {}
    @Override public void hide() {}

    @Override
    public void dispose() {
        batch.dispose();
        logo.dispose();
    }
}
