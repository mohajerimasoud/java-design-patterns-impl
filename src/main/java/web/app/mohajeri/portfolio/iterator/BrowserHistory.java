package web.app.mohajeri.portfolio.iterator;

public class BrowserHistory {

    private IteratorHistory linksList;

    public void createIterator(){
        linksList = new ArrayIterator<String>();
    }
    public BrowserHistory() {    }

    public void add(String link){
        linksList.addItem(link);
    }
    public void back(){
        linksList.previousItem();
    }
    public void next(){
        linksList.nextItem();
    }
    public void show(){
        linksList.lastItem();
    }


}
