package com.stripe.model;

import com.stripe.net.APIResource;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Fee extends APIResource {
  Long amount;
  String application;
  String currency;
  String description;
  String type;
}
