package school.lesson13.task6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class CharactersQueue implements Queue {
    private final int BEGIN_SIZE = 15;
    private int size;
    private Object[] queue;
    private Iterator iterator;
    private int iteratorsIndex;
    private Смещение головы очереди в массиве

    public CharactersQueue() {
        this.size = 0;
        queue = new Object[this.BEGIN_SIZE];
        iteratorsIndex = 0;

        iterator = new Iterator() {
            @Override
            public boolean hasNext() {
                return iteratorsIndex < size;
            }

            @Override
            public Object next() {
                if (hasNext()){
                    return
                }
                return null;
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return this.queue;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        this.size = 0;
        queue = new Object[this.BEGIN_SIZE];
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

}
