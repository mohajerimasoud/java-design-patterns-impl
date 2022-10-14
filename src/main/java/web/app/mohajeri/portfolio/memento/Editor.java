package web.app.mohajeri.portfolio.memento;

public class Editor {
    private String content;
    private History history;

    public Editor(History history) {
        this.history = history;
    }


    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore() {
        System.out.println("restore value : "+ history.pop().content() );

        content = history.pop().content();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        history.push(this.createState());
    }

    @Override
    public String toString() {
        return "Editor{" +
                "content='" + content + '\'' +
                '}';
    }
}
