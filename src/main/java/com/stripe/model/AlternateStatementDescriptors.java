package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode(callSuper = false)
public final class AlternateStatementDescriptors extends StripeObject {
	protected String kana;
	protected String kanji;
}
