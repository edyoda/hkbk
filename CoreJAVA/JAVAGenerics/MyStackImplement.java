package JAVAGenerics;

import java.util.EmptyStackException;

public class MyStackImplement<T> implements MyStack<T> {
	private int maxSize;
    private Object[] array;
    private int top;
	
    
    @Override
	public void push(Object number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T pop() {
		 if(this.isEmpty())
	            throw new EmptyStackException();
	        return element(top--);
	}

	@SuppressWarnings("unchecked")
	private T element(int index) {
	        return (T)array[index];
	}

	@Override
	public T peek() {
		if(this.isEmpty())
            throw new EmptyStackException();
        return element(top);
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		 return top == maxSize-1;
	}

}

interface MyStack<T> {
  void push(T number);
  T pop();
  T peek();
  boolean isEmpty();
  boolean isFull();
}

