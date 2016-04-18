package com.stripe.model;

public class Money extends StripeObject {
	Long amount;
	String currency;
	SourceTypes sourceTypes;

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public SourceTypes getSourceTypes() {
		return sourceTypes;
	}

	public void setSourceTypes(SourceTypes sourceTypes) {
		this.sourceTypes = sourceTypes;
	}

	public static class SourceTypes extends StripeObject {
		Long alipayAccount;
		Long bankAccount;
		Long bitcoinReceiver;
		Long card;

		public Long getAlipayAccount() {
			return alipayAccount;
		}

		public void setAlipayAccount(Long alipayAccount) {
			this.alipayAccount = alipayAccount;
		}

		public Long getBankAccount() {
			return bankAccount;
		}

		public void setBankAccount(Long bankAccount) {
			this.bankAccount = bankAccount;
		}

		public Long getBitcoinReceiver() {
			return bitcoinReceiver;
		}

		public void setBitcoinReceiver(Long bitcoinReceiver) {
			this.bitcoinReceiver = bitcoinReceiver;
		}

		public Long getCard() {
			return card;
		}

		public void setCard(Long card) {
			this.card = card;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}

			SourceTypes st = (SourceTypes) o;
			return equals(alipayAccount, st.alipayAccount) &&
				equals(bankAccount, st.bankAccount) &&
				equals(bitcoinReceiver, st.bitcoinReceiver) &&
				equals(card, st.card);
		}
	}
}
