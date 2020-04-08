package Queue3;
import java.util.NoSuchElementException;
public class ArrayQueue <E>{
	private E[] q; //q�� ���� �迭
	private int front, rear, size;
	public ArrayQueue() { //������
		 q = (E[]) new Object[2]; //�ʱ⿡ ũ�Ⱑ 2�� �迭 ����
		 front = rear = size = 0;
	}
	public int size() {return size;} //q��  �ִ� �׸��� ���� ����
	public boolean isEmpty() { return (size == 0);}// q�� empty�̸� true�� ����
	public void add(E newItem) { //ť ���� ����
		if ((rear+1%q.length ==front)) //����ִ� ���Ұ� 1������ ���(��, q�� full�� ���)
		resize(2*q.length); //q�� ũ�⸦ 2��� Ȯ��
		rear = (rear+1) % q.length;
		q[rear] = newItem; //�� �׸��� add
		size++;
	}
	public E remove() { //q ���� ����
		if(isEmpty()) throw new NoSuchElementException(); 
		front = (front+1) % q.length;
		E item = q[front];
		q[front] = null; //null�� ����� ������ �÷��ǵǵ���
		size--;
		if(size > 0 && size == q.length/4)//q�� �׸���� �迭 ũ���� 1/4�� �Ǹ�
			resize(q.length/2); //q�� 1/2ũ��� ���
		return item;
	}	
	private void resize(int newSize) { //q�� �迭 ũ������
		Object[] t = new Object[newSize]; //newSize ũ���� ���ο� �迭 t ����
		for(int i = 1, j = front+1; i < size +1; i++, j++) {
			t[i] = q[j%q.length]; //�迭q�� �׸���� �迭 t[1]�κ��� ����
		}
		front = 0;
		rear = size;
		q = (E[]) t; //�迭 t�� �迭 q��
	}
	public void print() { //q�� �׸���� ���
		if(isEmpty())
			System.out.print("q�� �������.");
		else {
			for(int i = 0; i < q.length; i++) System.out.print(q[i]+"\t ");
			System.out.println();
		}
	}
}