package com.quintus;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Renderer {
    private final ShapeRenderer shapeRenderer = new ShapeRenderer();

    public void render(Shape shape){
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.CORAL);
        for(Point point:shape.points){
            shapeRenderer.rect((float) (point.x+shape.x-1), (float) (point.y+shape.y-1),2,2);
        }
        shapeRenderer.end();
    }
}
