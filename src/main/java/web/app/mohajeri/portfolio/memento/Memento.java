package web.app.mohajeri.portfolio.memento;

public class Memento {
    public static void main(String[] args) {
        System.out.println("Memento Pattern ");

        var history = new History();
        var editor = new Editor(history);

        editor.setContent("A");
        editor.setContent("B");
        editor.setContent("c");
        System.out.println(editor.getContent());
        editor.restore();

        System.out.println(editor.getContent());
        System.out.println(editor.getContent());
    }
}
