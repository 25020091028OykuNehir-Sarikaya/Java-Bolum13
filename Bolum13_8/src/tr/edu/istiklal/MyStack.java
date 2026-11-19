package tr.edu.istiklal;
import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return " " + list.toString();
    }

    @Override
    public Object clone() {
        try {
            MyStack stack = (MyStack) super.clone();
            stack.list = new ArrayList<>(list);
            return stack;
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError(ex);
        }
    }
}