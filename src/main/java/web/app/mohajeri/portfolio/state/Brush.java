package web.app.mohajeri.portfolio.state;

public class Brush implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw line");
    }
}
