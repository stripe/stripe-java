package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.HashMap;
import java.util.Map;

public class Recipient extends APIResource implements MetadataStore<Recipient>, HasId {
	Long created;
	String id;
	String type;
	String name;
	Boolean livemode;
	Boolean deleted;
	String description;
	BankAccount activeAccount;
	String email;
	Boolean verified;
	Map<String, String> metadata;
	String defaultCard;
	RecipientCardCollection cards;

	public Long getCreated() {
		return created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDefaultCard() {
		return defaultCard;
	}

	public void setDefaultCard(String defaultCard) {
		this.defaultCard = defaultCard;
	}

	public RecipientCardCollection getCards() {
		return cards;
	}

	public BankAccount getActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(BankAccount activeAccount) {
		this.activeAccount = activeAccount;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getVerified() {
		return verified;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	public static Recipient create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static Recipient retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, (RequestOptions) null);
	}

	public static RecipientCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return all(params, (RequestOptions) null);
	}

	public Recipient update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	public DeletedRecipient delete() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return delete((RequestOptions) null);
	}

	public Card createCard(String token) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return createCard(token, (RequestOptions) null);
	}

	public Card createCard(Map<String, Object> params) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return createCard(params, (RequestOptions) null);
	}

	@Deprecated
	public Card createCard(String token, String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return createCard(token, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public Card createCard(String token, RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		Map<String, Object> postParams = new HashMap<String, Object>();
		postParams.put("card", token);

		return createCard(postParams, options);
	}

	@Deprecated
	public Card createCard(Map<String, Object> params, String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return createCard(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public Card createCard(Map<String, Object> params, RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.POST, String.format("%s/cards",
						instanceURL(Recipient.class, this.id)), params, Card.class, options);
	}

	@Deprecated
	public static Recipient create(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static Recipient create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Recipient.class), params, Recipient.class, options);
	}

	@Deprecated
	public static Recipient retrieve(String id, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static Recipient retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Recipient.class, id), null, Recipient.class, options);
	}

	@Deprecated
	public static RecipientCollection all(Map<String, Object> params,
			String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return all(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static RecipientCollection all(Map<String, Object> params,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.GET, classURL(Recipient.class), params, RecipientCollection.class, options);
	}

	@Deprecated
	public Recipient update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public Recipient update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Recipient.class, this.id), params, Recipient.class, options);
	}

	@Deprecated
	public DeletedRecipient delete(String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return delete(RequestOptions.builder().setApiKey(apiKey).build());
	}
	public DeletedRecipient delete(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.DELETE, instanceURL(Recipient.class, this.id), null, DeletedRecipient.class, options);
	}
}
