package CList;
public class CListMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLIst<String> s = new CLIst<String>(); //���Ḯ��Ʈ ��ü s����
		s.insert("pear"); s.insert("cherry");
		s.insert("orange"); s.insert("apple");
		s.print();
		System.out.print(": s�� ���� = " + s.size() + "\n");
		
		s.delete();
		s.print();
		System.out.print(": s�� ���� = " + s.size());System.out.println();
		
	}

}
