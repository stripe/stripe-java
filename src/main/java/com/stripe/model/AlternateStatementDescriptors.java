package com.stripe.model;

public final class AlternateStatementDescriptors extends StripeObject {
	protected String kana;
	protected String kanji;

	public String getKana() {
		return kana;
	}

	public void setKana(String kana) {
		this.kana = kana;
	}

	public String getKanji() {
		return kanji;
	}

	public void setKanji(String kanji) {
		this.kanji = kanji;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		AlternateStatementDescriptors that = (AlternateStatementDescriptors) o;

		if (kana != null ? !kana.equals(that.kana) : that.kana != null) {
			return false;
		}
		return kanji != null ? kanji.equals(that.kanji) : that.kanji == null;
	}

	@Override
	public int hashCode() {
		int result = kana != null ? kana.hashCode() : 0;
		result = 31 * result + (kanji != null ? kanji.hashCode() : 0);
		return result;
	}
}
