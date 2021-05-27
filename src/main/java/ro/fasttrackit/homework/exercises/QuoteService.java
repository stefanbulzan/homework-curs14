package ro.fasttrackit.homework.exercises;

import java.util.*;

public class QuoteService {
	private final List<Quote> quotes;

	public QuoteService(List<Quote> quotes) {
		this.quotes = new ArrayList<>();
		this.quotes.addAll(quotes);
	}

	public List<String> getAllQuotes() {
		List<String> result = new ArrayList<>();
		for (Quote quote : quotes) {
			result.add(quote.getQuote());
		}
		return result;
	}

	public List<Quote> getQuotesForAuthor(String author) {
		List<Quote> result = new ArrayList<>();
		for (Quote quote : quotes) {
			if (quote.getAuthor().equals(author)) {
				result.add(quote);
			}
		}
		return result;
	}

	public List<String> getAuthors() {
		List<String> result = new ArrayList<>();
		for (Quote quote : quotes) {
			result.add(quote.getAuthor());
		}
		return result;
	}

	public Set<String> setFavourite(int id) {
		Set<String> result = new HashSet<>();
		for (Quote quote : quotes) {
			if (quote.getId() == id) {
				result.add(quote.getQuote());
			}
		}
		return result;
	}

	public List<Quote> getFavourites() {
		List<Quote> result = new ArrayList<>();
		for (Quote quote : quotes) {
			if (quote.isFavourite()) {
				result.add(quote);
			}
		}
		return result;
	}

	public String getRandomQuote() {
		Random random = new Random();
		int randomNumber = random.nextInt();
		for (Quote quote : quotes) {
			if (quote.getId() == randomNumber) {
				quotes.add(quote);
			}
		}
		return null;
	}
}
