package Stack4; //2
 import java.util.EmptyStackException;
public class ListStack <E> {
	private Node<E> top; //���� top �׸��� ���� Node�� ����Ű�� ����
	private int size; //������ �׸� ��
	ListStack() { //���� ������
		top = null;
		size = 0;
	}
	public int size() { return size;} //������ �׸��� ���� ����
	public boolean isEmpty() { return size ==0;} //������ empty�̸� 	true����
	public void push(E newItem) {//���� push����
		Node newNode = new Node(newItem, top); //����Ʈ �պκп� ����
		top = newNode; //top�� �� ��� ����Ŵ
		size++; //���� �׸� �� 1 ���� 
	}
	public E peek() { //���� top �׸��� ����
		if(isEmpty()) throw new EmptyStackException(); 
		return top.getItem();
	}
	public E pop() { //���� pop ����
		if(isEmpty()) throw new EmptyStackException();
		E topItem = top.getItem(); //���� top �׸��� topItem�� ����
		top = top.getNext(); //top �� top �ٷ� �Ʒ� �׸��� ����Ŵ
		size--;  //���� �׸� ���� 1����
		return topItem;
	}
	public void print() { //������ �׸���� top���� ���ʷ� ���
		if(isEmpty()) System.out.print("������ �������.");
		else
			for(Node p = top; p != null; p = p.getNext())
				System.out.print(p.getItem()+"\t");
		System.out.println();
	}
}
