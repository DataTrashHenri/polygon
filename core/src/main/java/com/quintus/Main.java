package com.quintus;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    Renderer renderer;
    Shape shape;
    double t;

    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("libgdx.png");
        renderer=new Renderer();
        shape = new Complex(new Point(0,100), Gdx.graphics.getWidth(), t-> (float) Math.sin(t*0.01)*100);

        t=0;
    }

    @Override
    public void render() {
        if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
            Gdx.app.exit();
        }
        t+=0.05;
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);

        renderer.render(shape);

    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
