package IteratorImpl;

import java.util.Iterator;

public class MyArray<T> implements Iterable {

    private T[] elements;

    public MyArray(T[] elements)
    {
        this.elements=elements;
    }

    /**
     * get the element at an index position
     */

    public T getElement(int position)
    {
        return elements[position];
    }

    /**
     * set a element at a given index
     */

    public void setElement(int position, T element)
    {
        this.elements[position]=element;
    }

    /**
     * get the size of the array
     */

    public int getSize()
    {
        return elements.length;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    class ArrayIterator<T> implements Iterator<T>{

        int current=0;
        @Override
        public boolean hasNext() {
            if(current< elements.length)
                return false;
            else
                return true;
        }

        @Override
        public T next() {
            if(!hasNext())
                return (T) new Exception("Element not found");
            return (T) elements[current++];
        }
    }

    public static void main(String[] args) {

        String[] str= new String[]{"Dipanjan"};
        MyArray<String> myArr= new MyArray<>(str);

        // get and print the first values (prints "Dipanjan")
        System.out.println(myArr.getElement(0));


       myArr.setElement(0,"Lopa");
       System.out.println(myArr.getElement(0));

        for( Object s : myArr)
        {

            {
                System.out.println(s);
            }
        }
    }
}
