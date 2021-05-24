package ro.fasttrackit.homework.exercises;

import static ro.fasttrackit.homework.exercises.ReadFile.readQuotes;

/*1) citiți fișierul quotes.txt
2)quotes txt are formatul:
AUTHOR~QUOTE
3)creați obiectul model Quote:
- id: int   (valoarea id-ului o dat voi, in ordinea in care le-ati citit din fișier: 1, 2, 3 )
- author:String
- quote: String
- favourite: boolean (este "mutabil" -> nu este final- are setter)
4) creați un obiect QuoteService care oferă următoarele metode:
- getAllQuotes():List<String>
- getQuotesForAuthor(String author): List<Quote>
- getAuthors(): List<String>
- setFavourite(int id)
- getFavourites():List<Quote>
- getRandomQuote():String : generați un număr random cu ajutorul obiectului java.util.Random si
returnați quote-ul cu acel id.*/

public class Main {
	public static void main(String[] args) throws Exception {
		QuoteService quoteService = new QuoteService(readQuotes());

		System.out.println("--------------------getAllQuotes--------------------");
		System.out.println(quoteService.getAllQuotes());
		System.out.println("-----------------getQuotesForAuthor-----------------");
		System.out.println(quoteService.getQuotesForAuthor("General Douglas MacArthur"));
		System.out.println("---------------------getAuthors---------------------");
		System.out.println(quoteService.getAuthors());
		System.out.println("--------------------setFavourite---------------------");
		quoteService.setFavourite(20);
		System.out.println("-------------------getFavourites---------------------");
		System.out.println(quoteService.getFavourites());
		System.out.println("-------------------getRandomQuote---------------------");
		System.out.println(quoteService.getRandomQuote());
	}
}
