package com.feori.game;

import com.badlogic.gdx.Game;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class FeoriGame extends Game {
    @Override
    public void create() {
        setScreen(new IntroScreen(this));
    }
}
