package com.stripe.model;

import com.stripe.net.ApiResource;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class StatusTransitions extends ApiResource {
  Long canceled;
  Long fulfiled;
  Long paid;
  Long returned;
}
