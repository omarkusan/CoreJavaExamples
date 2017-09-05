package AbstractClassChallenge;

public class Main {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList(null);
		list.traverse(list.getRoot());
		String str = "Hi! I am Omar";
		String[] data = str.split(" ");
		for (String string : data) {
			list.addItem(new Node(string));
		}
		list.traverse(list.getRoot());
		
	}
}
