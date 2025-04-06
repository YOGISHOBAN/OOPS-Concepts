package ConstructorsPrograms;
//Constructor Overloading
public class Book {
	String title,author;
	double price;
	Book(String title,String author)
	{
		this.title=title;
		this.author=author;
	}
	Book(String title,String author,double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
public static void main(String[] args)
{
	Book b=new Book("Sons of Fortune", "Jefrey Archer");
	Book b1=new Book("Sons of Fortune", "Jefrey Archer",589);
	System.out.println("Book Details");
	System.out.println("Title :"+b.title);
	System.out.println("Author :"+b.author);
	System.out.println("price :"+b1.price);
}

}
