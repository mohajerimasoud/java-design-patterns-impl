package web.app.mohajeri.portfolio.iterator;

import java.util.ArrayList;
import java.util.List;

public class ArrayIterator<T> implements IteratorHistory<T> {
    private List<T> itemsList = new ArrayList<>();
    private int maxsize = 10;
    private int lookingIndex = 0;

    public ArrayIterator() {
        System.out.println("size " + itemsList.size());
        System.out.println("size " + itemsList.get(0));
//        System.out.println("size " + itemsList.get(0));

    }

    @Override
    public void addItem(T item) {
        if (itemsList.size() < maxsize &&
                lookingIndex == itemsList.size() - 1) {
            itemsList.add(item);
            lookingIndex = itemsList.size() - 1;
        } else if (itemsList.size() < maxsize &&
                lookingIndex != itemsList.size() - 1) {
            var tempArray = itemsList.subList(0, lookingIndex - 1);
            tempArray.add(item);
            itemsList = tempArray;

        } else {
            var tempArray = itemsList.subList(1, itemsList.size() - 1);
            tempArray.add(item);
            itemsList = tempArray;
        }
    }

    @Override
    public T show() {
        return null;
    }

    @Override
    public void previousItem() {
        lookingIndex = lookingIndex > 0 ? lookingIndex - 1 : 0;

    }

    @Override
    public void nextItem() {
        lookingIndex = lookingIndex < itemsList.size() - 1 ? lookingIndex + 1 : lookingIndex;
    }

    //    public T getItem
    public void lastItem() {
        lookingIndex = itemsList.size() > 0 ? itemsList.size() - 1 : 0;
    }
}
