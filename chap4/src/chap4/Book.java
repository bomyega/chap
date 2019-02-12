package chap4;

public class Book {
	String title;
	String author;
	int ISBN; 
	
	public Book() {
		this(null,null,0);
		System.out.println("생성자 호출됨");
	}
	public Book(String t, String a, int i) {
		this.title=t;
		this.author=a;
		this.ISBN=i;
	}
	public Book(String t, int i) {
		this(t,"dd",i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book java =new Book("java jdk","황기태",3333);
		Book dd=new Book("holly",1);
		Book dsds =new Book();
		
		System.out.println(java.title);
		System.out.println(dd.author);
		System.out.println(dsds.ISBN);
	}

}
