package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Transfer extends APIResource implements MetadataStore<Transfer>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  Long amountReversed;
  String applicationFee;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<BalanceTransaction> balanceTransaction;
  BankAccount bankAccount;
  Long created;
  String currency;
  Long date;
  String description;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Account> destination;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Charge> destinationPayment;
  String failureCode;
  String failureMessage;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  @Getter(AccessLevel.NONE) TransferReversalCollection reversals;
  Boolean reversed;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Charge> sourceTransaction;
  String sourceType;
  String statementDescriptor;
  String status;
  String transferGroup;
  String type;

  /**
   * The {@code account} attribute.
   *
   * @return the {@code account} attribute
   * @deprecated Prefer using the {@link #bankAccount} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-05-19">API version 2014-05-19</a>
   */
  @Deprecated
  BankAccount account;

  /**
   * The {@code other_transfers} attribute.
   *
   * @return the {@code other_transfers} attribute
   * @deprecated Prefer using the {@link BalanceTransaction#list} method instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-08-04">API version 2014-08-04</a>
   */
  @Deprecated
  List<String> otherTransfers;

  @Deprecated
  String recipient;

  /**
   * The {@code statement_description} attribute.
   *
   * @return the {@code statement_description} attribute
   * @deprecated Prefer using the {@link #statementDescriptor} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-12-17">API version 2014-12-17</a>
   */
  @Deprecated
  String statementDescription;

  /**
   * The {@code summary} attribute.
   *
   * @return the {@code summary} attribute
   * @deprecated Prefer using the {@link BalanceTransaction#list} method instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-08-04">API version 2014-08-04</a>
   */
  @Deprecated
  Summary summary;

  // <editor-fold desc="balanceTransaction">
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String balanceTransactionID) {
    this.balanceTransaction = setExpandableFieldID(balanceTransactionID, this.balanceTransaction);
  }

  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction c) {
    this.balanceTransaction = new ExpandableField<BalanceTransaction>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="destination">
  public String getDestination() {
    return (this.destination != null) ? this.destination.getId() : null;
  }

  public void setDestination(String destinationID) {
    this.destination = APIResource.setExpandableFieldID(destinationID, this.destination);
  }

  public Account getDestinationObject() {
    return (this.destination != null) ? this.destination.getExpanded() : null;
  }

  public void setDestinationObject(Account c) {
    this.destination = new ExpandableField<Account>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="destinationPayment">
  public String getDestinationPayment() {
    return (this.destinationPayment != null) ? this.destinationPayment.getId() : null;
  }

  public void setDestinationPayment(String destinationPaymentID) {
    this.destinationPayment = setExpandableFieldID(destinationPaymentID, this.destinationPayment);
  }

  public Charge getDestinationPaymentObject() {
    return (this.destinationPayment != null) ? this.destinationPayment.getExpanded() : null;
  }

  public void setDestinationPaymentObject(Charge destinationPayment) {
    this.destinationPayment
        = new ExpandableField<Charge>(destinationPayment.getId(), destinationPayment);
  }
  // </editor-fold>

  /**
   * Returns the {@code reversals} list.
   *
   * @return the {@code reversals} list
   */
  public TransferReversalCollection getReversals() {
    if (reversals.getURL() == null) {
      reversals.setURL(String.format("/v1/transfers/%s/reversals", getId()));
    }
    return reversals;
  }

  // <editor-fold desc="sourceTransaction">
  public String getSourceTransaction() {
    return (this.sourceTransaction != null) ? this.sourceTransaction.getId() : null;
  }

  public void setSourceTransaction(String sourceTransactionID) {
    this.sourceTransaction = setExpandableFieldID(sourceTransactionID, this.sourceTransaction);

  }

  public Charge getSourceTransactionObject() {
    return (this.sourceTransaction != null) ? this.sourceTransaction.getExpanded() : null;
  }

  public void setSourceTransactionObject(Charge sourceTransaction) {
    this.sourceTransaction
        = new ExpandableField<Charge>(sourceTransaction.getId(), sourceTransaction);
  }
  // </editor-fold>

  public static Transfer create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, (RequestOptions) null);
  }

  @Deprecated
  public static Transfer create(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public static Transfer create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Transfer.class), params, Transfer.class, options);
  }

  public static Transfer retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, (RequestOptions) null);
  }

  @Deprecated
  public static Transfer retrieve(String id, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public static Transfer retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Transfer.class, id), null, Transfer.class,
        options);
  }

  public static Transfer retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Transfer.class, id), params, Transfer.class,
        options);
  }

  @Deprecated
  public Transfer cancel()
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return cancel((RequestOptions) null);
  }

  @Deprecated
  public Transfer cancel(String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return cancel(RequestOptions.builder().setApiKey(apiKey).build());
  }

  public Transfer cancel(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Transfer.class, this.id) + "/cancel", null,
        Transfer.class, options);
  }

  @Override
  public Transfer update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  @Deprecated
  public Transfer update(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  @Override
  public Transfer update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Transfer.class, this.id), params,
        Transfer.class, options);
  }

  public TransferTransactionCollection transactions(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return transactions(params, (RequestOptions) null);
  }

  @Deprecated
  public TransferTransactionCollection transactions(
      Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return transactions(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public TransferTransactionCollection transactions(
      Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    String url = String.format("%s%s", instanceURL(Transfer.class, this.getId()), "/transactions");
    return requestCollection(url, params, TransferTransactionCollection.class, options);
  }

  public static TransferCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  public static TransferCollection list(Map<String, Object> params,
                      RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return requestCollection(classURL(Transfer.class), params, TransferCollection.class, options);
  }

  @Deprecated
  public static TransferCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  @Deprecated
  public static TransferCollection all(Map<String, Object> params,
                     String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  @Deprecated
  public static TransferCollection all(Map<String, Object> params,
                     RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, options);
  }
}
