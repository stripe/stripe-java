package com.stripe.net;

/** The base address to use for the request. */
public enum BaseAddress {
  /** https://api.stripe.com */
  API,
  /** https://connect.stripe.com */
  CONNECT,
  /** https://files.stripe.com */
  FILES,
  /** https://meter-events.stripe.com */
  METER_EVENTS
}
