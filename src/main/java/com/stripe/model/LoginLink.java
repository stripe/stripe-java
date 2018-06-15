package com.stripe.model;

import com.stripe.net.APIResource;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class LoginLink extends APIResource implements HasId {
  String object;
  Long created;
  String url;

  @Override
  public String getId() {
    throw new UnsupportedOperationException(
        "Login links are ephemeral and do not have an identifier");
  }
}
