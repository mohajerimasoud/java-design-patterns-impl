package web.app.mohajeri.portfolio.iterator;

public interface IteratorHistory<T>{
     void lastItem();
     void nextItem();
     void previousItem();
     void addItem(T item);
     T show();
}
