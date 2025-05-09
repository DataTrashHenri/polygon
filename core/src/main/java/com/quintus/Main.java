package com.quintus;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;
import java.util.List;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    Renderer renderer;
    Shape shape;
    double t;
    Path testPath;
    Shape wurzel = new Complex(new Point(100,100),500,x-> (float) ((float) x*x*0.01));
    List<Point> points = new ArrayList<>();

    BezierCurve curve;
    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("libgdx.png");
        renderer=new Renderer();
        shape = new Complex(new Point(0,100), Gdx.graphics.getWidth(), t-> (float) Math.sin(t*0.01)*100);

        points.add(new Point(100,400));
        points.add(new Point(200,600));
        points.add(new Point(250,550));
        points.add(new Point(400,700));
        points.add(new Point(350,600));
        curve = new BezierCurve(points);
        //testPath = new Path(new Path(new Point(0,0)),new Path(new Point(100,500)));
        t=0;
    }

    @Override
    public void render() {
        if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
            Gdx.app.exit();
        }
        t+=0.05;
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        renderer.render(curve);
        //renderer.render(shape);
        //renderer.render(testPath);
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
