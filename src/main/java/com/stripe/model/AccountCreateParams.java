package com.stripe.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountCreateParams {

  private String type;
  private LegalEntity legalEntity;

  /**
   * Account create params internal constructor.
   */
  AccountCreateParams(String type, LegalEntity legalEntity) {
    this.type = type;
    this.legalEntity = legalEntity;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String type;
    private LegalEntityBuilder legalEntityBuilder = new LegalEntityBuilder(this);

    Builder() {}

    public Builder setType(String type) {
      this.type = type;
      return this;
    }

    public LegalEntityBuilder beginLegalEntity() {
      return legalEntityBuilder;
    }

    public AccountCreateParams build() {
      return new AccountCreateParams(type, legalEntityBuilder.build());
    }
  }

  /**
   * Inner classes and their builders.
   */
  @Getter
  @Setter
  static class AdditionalOwner {
    Address address;

    public AdditionalOwner(Address address) {
      this.address = address;
    }
  }

  public static class AdditionalOwnerBuilder implements NestedBuilder<AdditionalOwnerArrayBuilder> {
    @Getter
    private AdditionalOwnerArrayBuilder parent;
    private AddressBuilder addressBuilder = new AddressBuilder(this);

    AdditionalOwnerBuilder(AdditionalOwnerArrayBuilder parent) {
      this.parent = parent;
    }

    public AddressBuilder beginAddress() {
      return addressBuilder;
    }

    AdditionalOwner build() {
      return new AdditionalOwner(addressBuilder.build());
    }
  }

  @Getter
  @Setter
  static class LegalEntity {
    List<AdditionalOwner> additionalOwners;

    LegalEntity(List<AdditionalOwner> additionalOwners) {
      this.additionalOwners = additionalOwners;
    }
  }

  public static class LegalEntityBuilder implements NestedBuilder<Builder> {
    @Getter
    Builder parent;
    AdditionalOwnerArrayBuilder additionalOwnerArrayBuilder =
        new AdditionalOwnerArrayBuilder(this, parent -> new AdditionalOwnerBuilder(parent));

    LegalEntityBuilder(Builder parent) {
      this.parent = parent;
    }

    public AdditionalOwnerArrayBuilder beginArrayAdditionalOwners() {
      return additionalOwnerArrayBuilder;
    }

    LegalEntity build() {
      return new LegalEntity(additionalOwnerArrayBuilder.build());
    }
  }

  public static class AdditionalOwnerArrayBuilder implements NestedBuilder<LegalEntityBuilder> {
    @Getter
    private LegalEntityBuilder parent;

    private List<AdditionalOwnerBuilder> array = new ArrayList<>();
    private Function<AdditionalOwnerArrayBuilder, AdditionalOwnerBuilder> elementBuilder;

    AdditionalOwnerArrayBuilder(LegalEntityBuilder parent,
                                Function<AdditionalOwnerArrayBuilder,
                                    AdditionalOwnerBuilder> additionalOwnerBuilder) {
      this.parent = parent;
      this.elementBuilder = additionalOwnerBuilder;
    }

    /**
     * Begin additional owner.
     */
    public AdditionalOwnerBuilder beginAdditionalOwner() {
      AdditionalOwnerBuilder ownerBuilder = elementBuilder.apply(this);
      array.add(ownerBuilder);
      return ownerBuilder;
    }

    List<AdditionalOwner> build() {
      return array.stream().map(AdditionalOwnerBuilder::build).collect(Collectors.toList());
    }
  }

  @Getter
  @Setter
  static class Address {
    String city;
    String country;
    String postalCode;

    public Address(String city, String country, String postalCode) {
      this.city = city;
      this.country = country;
      this.postalCode = postalCode;
    }
  }

  public static class AddressBuilder implements NestedBuilder<AdditionalOwnerBuilder> {
    String city;
    String country;
    String postalCode;

    @Getter
    AdditionalOwnerBuilder parent;

    AddressBuilder(AdditionalOwnerBuilder parent) {
      this.parent = parent;
    }

    public AddressBuilder setCity(String city) {
      this.city = city;
      return this;
    }

    public AddressBuilder setCountry(String country) {
      this.country = country;
      return this;
    }

    public AddressBuilder setPostalCode(String postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    Address build() {
      return new Address(city, country, postalCode);
    }
  }
}
