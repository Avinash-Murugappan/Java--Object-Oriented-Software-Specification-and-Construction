/**
  * Bloch's Stack example page 60, 3rd edition
  */

import java.util.*;

public class Stack {

   private Object[] elements;
   private int size = 0;
   private static final int DEFAULT_INITIAL_CAPACITY = 16;


   public Stack() {
     this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
   }

   public void push (Object e) {
     ensureCapacity();
     elements[size++] = e;
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
   private void repOk(Stack st)
   {
	   if(st==null)
	   {
		   throw new NullPointerException("stack is null");
	   }
   }
   @Override
   public String toString()
   {
	   String temp="STACK  BEGINS \n";
	   for(int i=elements.length-1;i>=0;i--)
	   {
		   if(elements[i]==null) continue;
		   temp=temp+i+" element is ||"+elements[i]+"||\n";
	   }
	return temp;
	   
   }
   public static void main(String args[])
   {
	   Stack st=new Stack();
	   st.push("YO");
	   st.push("YO");
	   st.push("HONEY");
	   st.push("Singh");
	   System.out.println(st.toString());
	   
	   
   }

}