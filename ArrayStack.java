package Stack;

	interface Stack{
		boolean	isEmpty();
		void push(char item);
		char pop();
		void delete();
		char peek();
	}

	class ArrayStack implements Stack {
	private int top;
	private int stackSize;
	private char itemArray[];
	
	public ArrayStack(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == -1); // stack���� ����ִ��� �˻�
	}

	public boolean isFull() {
		return (top == this.stackSize-1); //stack�� �� á���� �˻�
	}
	@Override
	public void push(char item) { //���� stack á���� Ȯ��
		// TODO Auto-generated method stub
		if(isFull()) {
			System.out.println("Inserting fail! Array Stack is full!!"); //������ ��á�ٰ� ���
		}
		else {
			itemArray[++top] = item; //top���� 1���� ��Ų���� itemArray�� item�� �Ҵ��ϰ�
			System.out.println("Inserted Item: " + item);  //���Ե� �����Ͱ��� ���
		}
	}

	@Override
	public char pop() { //stack�� ����ִ��� Ȯ��
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty"); //��������� ����ִٰ� ���
			return 0;
		}
		else {
			return itemArray[top--];//top�� ����Ű���ִ� ���� ���� return ���Ŀ� top���� 1����
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty"); //����ִ��� Ȯ��
		}
		else {
			top--; //top ���� 1����
		}
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("peeking fail! Array Stack is empty!!"); //stack�� ����ִ��� �˻��� ��������� �����͸� �����ü����ٰ� ���
			return 0;
		}
		else {
			return itemArray[top]; //top�������ִ� ���� return
		}//top����Ʈ�� �������� �˰����Ҷ� �� �޼ҵ� ����ϸ��
	}
	public void printlnStack() {
		if(isEmpty()) {
			System.out.println("Array Stack is empty!! %n %n");
		}
		else {
			System.out.println("Array Stack>>"); //stack ���� ������� �����
			for(int i = 0; i<=top; i++)
				System.out.printf("%c", itemArray[i]);
			System.out.println(); System.out.println();
		}
	}
}
