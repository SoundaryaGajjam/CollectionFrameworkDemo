package com.scp.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet<Integer> setOfInt=new HashSet<>();
		setOfInt.add(10);
		setOfInt.add(20);
		setOfInt.add(30);
		setOfInt.add(20);
		setOfInt.add(new Integer(10));
			
		System.out.println(setOfInt.size());
		System.out.println(setOfInt);
		
		HashSet<String> setOfStr=new HashSet<>();
		setOfStr.add("A");
		setOfStr.add("B");
		setOfStr.add("C");
		setOfStr.add("A");
		
		System.out.println(setOfStr.size());
		System.out.println(setOfStr);
		
		Book b1=new Book(10, "Mrutyinjay");
		Book b2=new Book(20, "Wise & otherwise");
		Book b3=new Book(30, "Yayati");
		Book b4=new Book(10, "Mrutyinjay");
		Book b5=new Book(40, "The Kiss of my life");
		Book b6=b4;
		
		/*HashSet<Book> setOfBook=new HashSet<>();
		System.out.println(setOfBook.add(b1));
		System.out.println(setOfBook.add(b2));
		System.out.println(setOfBook.add(b3));
		System.out.println(setOfBook.add(b4));
		System.out.println(setOfBook.add(b5));
		System.out.println(setOfBook.add(b6));
		*/
		//System.out.println(setOfBook.size());
		//System.out.println(setOfBook);
		
		
		HashMap<Book,String> mapOfBooks=new HashMap<>();
		System.out.println(mapOfBooks.put(b1,"Shivaji Savant"));
		System.out.println(mapOfBooks.put(b2,"Sudha Murthi"));
		System.out.println(mapOfBooks.put(b3,"Shivaji Savant"));
		System.out.println(mapOfBooks.put(b4,"XYZ"));
		System.out.println(mapOfBooks.put(b5,"Imran Hashmi"));
		System.out.println(mapOfBooks.put(b6,"Shivaji Savant"));
		
		System.out.println(mapOfBooks.size());
		//System.out.println(mapOfBooks);
		
		printBookInfo(mapOfBooks);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void printBookInfo(HashMap<Book, String> mapOfBooks) {
		
		System.out.println("****** Using keySet **********");
		Set<Book>setOfBook=mapOfBooks.keySet();
		Iterator<Book> itr=setOfBook.iterator();
		while(itr.hasNext()){
			Book bKey=itr.next();
			System.out.println("Key : "+bKey+" Value : "+mapOfBooks.get(bKey));
		}
		
		System.out.println("$$$$$$ Using Values $$$$$$$$");
		Collection<String> listOfBook=mapOfBooks.values();
		Iterator<String>itr1=listOfBook.iterator();
		while(itr1.hasNext()){
			String val=itr1.next();
			System.out.println("Values : "+val);
		}
		
		System.out.println("@@@@@@@@@ using EntrySet @@@@@@@@@@");
		Set<Entry<Book,String>> setOfEntry=mapOfBooks.entrySet();
		Iterator<Entry<Book,String>>itrE=setOfEntry.iterator();
		while(itrE.hasNext()){
			Entry<Book,String>ent=itrE.next();
			System.out.println("Key : "+ent.getKey()+" Value : "+ent.getValue());
		}
		
	}
	
	

}
class Book{
	private int bookId;
	private String bookName;
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		//result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookId != other.bookId)
			return false;
		/*if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;*/
		return true;
	}


	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "\nBook [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	
}
