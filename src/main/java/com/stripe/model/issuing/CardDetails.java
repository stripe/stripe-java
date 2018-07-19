package com.stripe.model.issuing;

import com.stripe.model.ExpandableField;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CardDetails extends APIResource {
  String object;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
    ExpandableField<Card> card;
  String cvc;
  Integer expMonth;
  Integer expYear;
  String number;

  // <editor-fold desc="card">
  public String getCard() {
    return (this.card != null) ? this.card.getId() : null;
  }

  public void setCard(String cardId) {
    this.card = setExpandableFieldID(cardId, this.card);
  }

  public Card getCardObject() {
    return (this.card != null) ? this.card.getExpanded() : null;
  }

  public void setCardObject(Card c) {
    this.card = new ExpandableField<Card>(c.getId(), c);
  }
  // </editor-fold>
}
