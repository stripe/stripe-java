package com.stripe.model;

import com.stripe.net.APIResource;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class StatusTransitions extends APIResource {
  Long canceled;
  Long fulfiled;
  Long paid;
  Long returned;
}
