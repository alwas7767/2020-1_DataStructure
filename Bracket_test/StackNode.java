
package Bracket_test;

	interface Stack{
		boolean isEmpty();
		void push(char item);
		char pop();
		void delete();
		char peek();
	}
class StackNode {
	char data;
	StackNode link;
}

class LinkedStack implements Stack{
	private StackNode top;
	
	public boolean isEmpty() {
		return (top == null); //������ ����ִ��� �˻�
	}
	
	public void push(char item) { 
		StackNode newNode = new StackNode(); //newNode��ü ����
		newNode.data = item; //���ڷ� ���� item�� newNode�����Ϳ� �Ҵ��ϰ�
		newNode.link = top; //top�� newNode.link�� �Ҵ�
		top = newNode; //newNode�� top���� �Ҵ�
		System.out.println("Inserted Item: " + item); //���
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!"); //��������� ����־ �����Ҽ����� ���
			return 0; //0����
		}
		else {
			char item = top.data; //top�� ����Ű���ִ� �����͸� ���� item�� �Ҵ��ϰ�
			top = top.link; // top.link���� top�� �Ҵ��ϰ�
			return item; //item�� ����
		}
		
	}
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
		}
		else {
			top = top.link; // top.link���� top�� �Ҵ��Ѵ� �� ������ �ϰ��ִ�.
		}
	}
	public char peek() {
		if(isEmpty()) { //����ִ��� �˻�
			System.out.println("peeking fail! LinkedStack is empty!!");
			return 0; 
		}
		else {
			return top.data; //������� ������ top.data���� ����  
		//�� top�����Ϳ� ������Ͱ� �ִ��� Ȯ���ϴ°�
		}
	}
	public void printlnStack() {
		if(isEmpty())
			System.out.printf("Linked Stack is empty!! %n %n");
		else {
			StackNode temp = top;
			System.out.println("Linked Stack>>");
			while(temp != null) {
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
			}
			System.out.println();
		}
	}
}
