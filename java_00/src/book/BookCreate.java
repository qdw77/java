package book;

import java.util.Scanner;

public class BookCreate {
	
	private static Scanner sc = new Scanner(System.in);
	//private static Scanner sc = new Scanner(System.in);
	
	public static void bookInfoInsert() {
		System.out.print("도서명을 입력해 주세요 : ");
		String bookTitle = sc.next();
		
		System.out.print("도서가격을 입력해주세요 : ");
		int bookPrice = sc.nextInt();
		
		System.out.print("도서의 저자는 누구인가요? : ");
		String bookAuthor = sc.next();
		
		System.out.print("출판사는 어디인가요? : ");
		String bookPublisher = sc.next();
		
		System.out.print("발행 년도는 언제인가요? : ");
		String bookPubYear = sc.next();
		
		System.out.print("도서 ISBN 코드를 입력해주세요 : ");
		String bookIsbn = sc.next();
		
		System.out.print("총 페이지 수는 몇 장인가요?? : ");
		int bookPage = sc.nextInt();
		
		Book b1 =new Book();
		
		b1.setTitle(bookTitle);
		b1.setPrice(bookPrice);
		b1.setAuthor(bookAuthor);
		b1.setPublisher(bookPublisher);
		b1.setPubYear(bookPubYear);
		b1.setIsbn(bookIsbn);
		b1.setPage(bookPage);
		
		
		bookInfoSelect(b1);
	}
	public static Book bookInfoSelect(Book book) {
		
		System.out.println(book.BookInfo());
		return book;
	}
}
