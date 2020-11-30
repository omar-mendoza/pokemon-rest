package com.pokemon.api.model;

import java.util.List;

public class TestPokemon {

	private long count;
//	private String next;
//	private String previous;
	private List<Result> results;

	public long getCount() {
		return count;
	}

	public void setCount(long value) {
		this.count = value;
	}

//	public String getNext() {
//		return next;
//	}
//
//	public void setNext(String value) {
//		this.next = value;
//	}
//
//	public String getPrevious() {
//		return previous;
//	}
//
//	public void setPrevious(String value) {
//		this.previous = value;
//	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> value) {
		this.results = value;
	}

//	@Override
//	public String toString() {
//		return "TestPokemon [count=" + count + ", next=" + next + ", previous=" + previous + ", results=" + results
//				+ "]";
//	}
	
}
