package ArrayStack2;
import java.util.EmptyStackException;

public class ArrayStack2<E> {
	private E s[]; //������ ���� �迭
	private int top; // ������ top�׸��� �迭���� �ε���
	public ArrayStack2() {//���� ������
		s = (E[]) new Object[1]; //�ʱ⿡ ũ�Ⱑ 1�� �迭����
		top = -1;
	}
	public int size() { return top+1;} //���ÿ� �ִ� �׸��� ���� ����
	public boolean isEmpty() {return (top == -1);} // ������ empty�̸� true����
	//peek(), push(), pop(), resize() �޼ҵ弱��
	
	public E peek() {//���� top �׸��� ���븸�� ����
		if(isEmpty()) throw new  EmptyStackException(); // underflow �� ���α׷� ����
		return s[top];
	}
	
	public void push(E newItem) { //push����
		if (size() == s.length) //������ �� á����
			resize(2*s.length); //������ 2���� ũ��� Ȯ��
		s[++top] = newItem; //top�� 1�����Ŀ� �� �׸��� push 
	}
	public E pop() { //pop ����
		if(isEmpty()) throw new EmptyStackException(); //underflow �� ���α׷� ����
		E item = s[top]; //top�� ����Ű�� �׸��� item�� ��Ų�Ŀ� 
		s[top--] = null; //top�� ����Ű�� ���� null�� �ʱ�ȭ�Ŀ� 1����
		if(size() > 0 && size() == s.length/4) //�׸��� ���� �迭�� ũ�⺸��  1/4�����̸� 
			resize(s.length/2); //������ 1/2 ũ��� ��� 
		return item;
	}
    private void resize(int newSize) { 
        Object[] t = new Object[newSize]; 
        for(int i = 0; i < size(); i++) 
           t[i] = s[i];
           s = (E[]) t;
     }
	public void print() { 
		if(isEmpty())
			System.out.print("�迭�� �������.");
		else
			for(int i = 0; i< s.length; i++) System.out.print(s[i]+"\t");
		System.out.println();
	}
}
