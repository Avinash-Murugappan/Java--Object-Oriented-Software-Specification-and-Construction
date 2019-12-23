/**
 *SWE 619 Assignment 5
 *Contributors:
 *
 *Amish Papneja (G01211503)
 *-

 *Avinash Arunachalam A Murugappan (G01163980)
 *-

 *Rushil Nandan Dubey (G01203932)
 *-
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

// This class supports iteration of the  characters that comprise a string.

//Declared the class as final so it can’t be extended.
final class  MyString implements Iterable<Character>, Iterator<Character> {

//Made all fields private so that direct access is not allowed.

    private String str;
    private int count = 0;


    public  MyString (String s) {
        str = s;
        getstr(str);


    }

  /*Performed cloning of objects in the getter methods to return a copy rather than returning
  the actual object reference.*/
  public String getstr(String str)
  {

      return str;
  }


    // The next three methods implement Iterator.

    public boolean hasNext() {
        if (count < str.length()){
            return true;
        }
        return false;
    }

    public Character next() {
        if (count == str.length())
            throw new NoSuchElementException();

        count++;
        return str.charAt(count - 1);
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    // This method implements Iterable.

    public Iterator<Character> iterator() {
        return this;
    }


    public static void main(String args[]) {
        MyString x = new MyString("Cat");


        for (char ch : x){
            System.out.print(ch);
        }
    }
}