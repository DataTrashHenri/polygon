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
        if (shape.getClass().equals(BezierCurve.class)) {
            for (var point : ((BezierCurve) shape).inputPoints) {
                shapeRenderer.setColor(Color.RED);
                shapeRenderer.rect((float) (point.x+shape.x-3), (float) (point.y+shape.y-3),6,6);
            }

        }
        shapeRenderer.end();
    }
    public void render(Path path){
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.CORAL);
        for (Point point:path.outputPoints) {
            shapeRenderer.rect(point.x, point.y, 2, 2 );
        }
        shapeRenderer.end();
    }
}
