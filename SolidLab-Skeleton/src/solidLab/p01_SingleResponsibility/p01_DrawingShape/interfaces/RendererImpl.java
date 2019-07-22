package solidLab.p01_SingleResponsibility.p01_DrawingShape.interfaces;

public class RendererImpl implements Renderer {
    @Override
    public void render(Shape shape) {
        System.out.println("Draw shape");
    }
}
