package com.stripe.model;

import com.stripe.net.APIResource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fee extends APIResource {
	Long amount;
	String application;
	String currency;
	String description;
	String type;
}
