package web.app.mohajeri.portfolio.state;

public class State {
    public static void main(String[] args) {
        System.out.println("State Pattern");
        Canvas canvas = new Canvas();
        Brush brushTool = new Brush();

        canvas.setCurrentTool(brushTool);
        canvas.mouseDown();
        canvas.mouseUp();

    }
}
