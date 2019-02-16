public class Book
{
	
	String bookName;
	String isbn;
	String author;
	String publisher;
	
	Book(String bookName, String isbn, String author, String publisher)
	{
		this.bookName=bookName;
		this.isbn=isbn;
		this.author=author;
		this.publisher=publisher;
	}
	
	public void setBookName(String bookName)	{	this.bookName=bookName;	}
	
	public void setIsbn(String isbn)			{	this.isbn=isbn;	}
	
	public void setAuthorName(String author)	{	this.author=author;	}
	
	public void setPublisher(String publisher)	{	this.publisher=publisher;	}
	
	public String getBookName()					{	return bookName;	}
	
	public String getIsbn()						{	return isbn;	}
	
	public String getAuthorName()				{	return author; 	}
	
	public String getPublisher()				{	return publisher;	}

	
	public void getBookInfo()
	{
		System.out.println("Book Info: "+bookName + " " +isbn + " " + author + " " + publisher );
	}
	
}

