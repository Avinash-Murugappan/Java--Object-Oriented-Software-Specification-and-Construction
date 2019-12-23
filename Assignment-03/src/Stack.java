/**
 * Bloch's Stack example page 60, 3rd edition
 * SWE-619 Assignment 3
 * Contributors: Amish, Avinash, Rushil Nandan
 **/

import java.util.*;

private final class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;


    private Stack(int n) {
        // this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
        elements = new Object[n];
    }

    //public void push (Object e) {
       // ensureCapacity();
        //elements[size++] = e;
    // }
        public Stack push (Object e) {
        Stack result = new Stack (size +1);
        System.arraycopy(elements,0, result.elements,0, size);
        result.size = size+1;
        result.elements[size+1]=e;
        return result;

        }


    public Object pop () {
      if (size == 0) throw new IllegalStateException("Stack.pop");
     Object result = elements[--size];
    elements[size] = null;
    return result;
     }



    private void ensureCapacity() {
        if (elements.length == size) {
            Object oldElements[] = elements;
            elements = new Object[2*size + 1];
            System.arraycopy(oldElements, 0, elements, 0, size);
        }
    }

    public static void main(String arg[]){


    }


}