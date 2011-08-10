package com.stripe.model;

public class Period {
	protected long start, end;

	public Period() {
	}

	public Period(long start, long end) {
		super();
		this.start = start;
		this.end = end;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getEnd() {
		return end;
	}

	public void setEnd(long end) {
		this.end = end;
	}
}
