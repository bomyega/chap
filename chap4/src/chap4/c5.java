package chap4;

public class c5 {
	String title;
	String author;
	int ISBN; 
	
	public c5(String title,String author, int ISBN) {
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c5 a=new c5("박예인","박예인",123);
		
		System.out.println(a.title);
		System.out.println(a.author);
		System.out.println(a.ISBN);
	}

}
