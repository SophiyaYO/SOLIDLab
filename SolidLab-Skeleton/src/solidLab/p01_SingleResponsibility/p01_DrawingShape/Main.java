package solidLab.p01_SingleResponsibility.p01_DrawingShape;

import solidLab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Renderer;
import solidLab.p01_SingleResponsibility.p01_DrawingShape.interfaces.RendererImpl;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);

        Renderer renderer = new RendererImpl();

        rectangle.draw(renderer);
        System.out.println("Hello World");
    }
}
