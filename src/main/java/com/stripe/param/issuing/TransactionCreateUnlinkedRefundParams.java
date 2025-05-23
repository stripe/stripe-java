// File generated from our OpenAPI spec
package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class TransactionCreateUnlinkedRefundParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> The total amount to attempt to refund. This amount is in the
   * provided currency, or defaults to the cards currency, and in the <a
   * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
   */
  @SerializedName("amount")
  Long amount;

  /** <strong>Required.</strong> Card associated with this unlinked refund transaction. */
  @SerializedName("card")
  String card;

  /**
   * The currency of the unlinked refund. If not provided, defaults to the currency of the card.
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Details about the seller (grocery store, e-commerce website, etc.) where the card authorization
   * happened.
   */
  @SerializedName("merchant_data")
  MerchantData merchantData;

  /** Additional purchase information that is optionally provided by the merchant. */
  @SerializedName("purchase_details")
  PurchaseDetails purchaseDetails;

  private TransactionCreateUnlinkedRefundParams(
      Long amount,
      String card,
      String currency,
      List<String> expand,
      Map<String, Object> extraParams,
      MerchantData merchantData,
      PurchaseDetails purchaseDetails) {
    this.amount = amount;
    this.card = card;
    this.currency = currency;
    this.expand = expand;
    this.extraParams = extraParams;
    this.merchantData = merchantData;
    this.purchaseDetails = purchaseDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String card;

    private String currency;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private MerchantData merchantData;

    private PurchaseDetails purchaseDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public TransactionCreateUnlinkedRefundParams build() {
      return new TransactionCreateUnlinkedRefundParams(
          this.amount,
          this.card,
          this.currency,
          this.expand,
          this.extraParams,
          this.merchantData,
          this.purchaseDetails);
    }

    /**
     * <strong>Required.</strong> The total amount to attempt to refund. This amount is in the
     * provided currency, or defaults to the cards currency, and in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /** <strong>Required.</strong> Card associated with this unlinked refund transaction. */
    public Builder setCard(String card) {
      this.card = card;
      return this;
    }

    /**
     * The currency of the unlinked refund. If not provided, defaults to the currency of the card.
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TransactionCreateUnlinkedRefundParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TransactionCreateUnlinkedRefundParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * TransactionCreateUnlinkedRefundParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link TransactionCreateUnlinkedRefundParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Details about the seller (grocery store, e-commerce website, etc.) where the card
     * authorization happened.
     */
    public Builder setMerchantData(
        TransactionCreateUnlinkedRefundParams.MerchantData merchantData) {
      this.merchantData = merchantData;
      return this;
    }

    /** Additional purchase information that is optionally provided by the merchant. */
    public Builder setPurchaseDetails(
        TransactionCreateUnlinkedRefundParams.PurchaseDetails purchaseDetails) {
      this.purchaseDetails = purchaseDetails;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class MerchantData {
    /**
     * A categorization of the seller's type of business. See our <a
     * href="https://stripe.com/docs/issuing/merchant-categories">merchant categories guide</a> for
     * a list of possible values.
     */
    @SerializedName("category")
    Category category;

    /** City where the seller is located. */
    @SerializedName("city")
    String city;

    /** Country where the seller is located. */
    @SerializedName("country")
    String country;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Name of the seller. */
    @SerializedName("name")
    String name;

    /**
     * Identifier assigned to the seller by the card network. Different card networks may assign
     * different network_id fields to the same merchant.
     */
    @SerializedName("network_id")
    String networkId;

    /** Postal code where the seller is located. */
    @SerializedName("postal_code")
    String postalCode;

    /** State where the seller is located. */
    @SerializedName("state")
    String state;

    /** An ID assigned by the seller to the location of the sale. */
    @SerializedName("terminal_id")
    String terminalId;

    /** URL provided by the merchant on a 3DS request. */
    @SerializedName("url")
    String url;

    private MerchantData(
        Category category,
        String city,
        String country,
        Map<String, Object> extraParams,
        String name,
        String networkId,
        String postalCode,
        String state,
        String terminalId,
        String url) {
      this.category = category;
      this.city = city;
      this.country = country;
      this.extraParams = extraParams;
      this.name = name;
      this.networkId = networkId;
      this.postalCode = postalCode;
      this.state = state;
      this.terminalId = terminalId;
      this.url = url;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Category category;

      private String city;

      private String country;

      private Map<String, Object> extraParams;

      private String name;

      private String networkId;

      private String postalCode;

      private String state;

      private String terminalId;

      private String url;

      /** Finalize and obtain parameter instance from this builder. */
      public TransactionCreateUnlinkedRefundParams.MerchantData build() {
        return new TransactionCreateUnlinkedRefundParams.MerchantData(
            this.category,
            this.city,
            this.country,
            this.extraParams,
            this.name,
            this.networkId,
            this.postalCode,
            this.state,
            this.terminalId,
            this.url);
      }

      /**
       * A categorization of the seller's type of business. See our <a
       * href="https://stripe.com/docs/issuing/merchant-categories">merchant categories guide</a>
       * for a list of possible values.
       */
      public Builder setCategory(
          TransactionCreateUnlinkedRefundParams.MerchantData.Category category) {
        this.category = category;
        return this;
      }

      /** City where the seller is located. */
      public Builder setCity(String city) {
        this.city = city;
        return this;
      }

      /** Country where the seller is located. */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TransactionCreateUnlinkedRefundParams.MerchantData#extraParams} for the field
       * documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link TransactionCreateUnlinkedRefundParams.MerchantData#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Name of the seller. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /**
       * Identifier assigned to the seller by the card network. Different card networks may assign
       * different network_id fields to the same merchant.
       */
      public Builder setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
      }

      /** Postal code where the seller is located. */
      public Builder setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
      }

      /** State where the seller is located. */
      public Builder setState(String state) {
        this.state = state;
        return this;
      }

      /** An ID assigned by the seller to the location of the sale. */
      public Builder setTerminalId(String terminalId) {
        this.terminalId = terminalId;
        return this;
      }

      /** URL provided by the merchant on a 3DS request. */
      public Builder setUrl(String url) {
        this.url = url;
        return this;
      }
    }

    public enum Category implements ApiRequestParams.EnumParam {
      @SerializedName("ac_refrigeration_repair")
      AC_REFRIGERATION_REPAIR("ac_refrigeration_repair"),

      @SerializedName("accounting_bookkeeping_services")
      ACCOUNTING_BOOKKEEPING_SERVICES("accounting_bookkeeping_services"),

      @SerializedName("advertising_services")
      ADVERTISING_SERVICES("advertising_services"),

      @SerializedName("agricultural_cooperative")
      AGRICULTURAL_COOPERATIVE("agricultural_cooperative"),

      @SerializedName("airlines_air_carriers")
      AIRLINES_AIR_CARRIERS("airlines_air_carriers"),

      @SerializedName("airports_flying_fields")
      AIRPORTS_FLYING_FIELDS("airports_flying_fields"),

      @SerializedName("ambulance_services")
      AMBULANCE_SERVICES("ambulance_services"),

      @SerializedName("amusement_parks_carnivals")
      AMUSEMENT_PARKS_CARNIVALS("amusement_parks_carnivals"),

      @SerializedName("antique_reproductions")
      ANTIQUE_REPRODUCTIONS("antique_reproductions"),

      @SerializedName("antique_shops")
      ANTIQUE_SHOPS("antique_shops"),

      @SerializedName("aquariums")
      AQUARIUMS("aquariums"),

      @SerializedName("architectural_surveying_services")
      ARCHITECTURAL_SURVEYING_SERVICES("architectural_surveying_services"),

      @SerializedName("art_dealers_and_galleries")
      ART_DEALERS_AND_GALLERIES("art_dealers_and_galleries"),

      @SerializedName("artists_supply_and_craft_shops")
      ARTISTS_SUPPLY_AND_CRAFT_SHOPS("artists_supply_and_craft_shops"),

      @SerializedName("auto_and_home_supply_stores")
      AUTO_AND_HOME_SUPPLY_STORES("auto_and_home_supply_stores"),

      @SerializedName("auto_body_repair_shops")
      AUTO_BODY_REPAIR_SHOPS("auto_body_repair_shops"),

      @SerializedName("auto_paint_shops")
      AUTO_PAINT_SHOPS("auto_paint_shops"),

      @SerializedName("auto_service_shops")
      AUTO_SERVICE_SHOPS("auto_service_shops"),

      @SerializedName("automated_cash_disburse")
      AUTOMATED_CASH_DISBURSE("automated_cash_disburse"),

      @SerializedName("automated_fuel_dispensers")
      AUTOMATED_FUEL_DISPENSERS("automated_fuel_dispensers"),

      @SerializedName("automobile_associations")
      AUTOMOBILE_ASSOCIATIONS("automobile_associations"),

      @SerializedName("automotive_parts_and_accessories_stores")
      AUTOMOTIVE_PARTS_AND_ACCESSORIES_STORES("automotive_parts_and_accessories_stores"),

      @SerializedName("automotive_tire_stores")
      AUTOMOTIVE_TIRE_STORES("automotive_tire_stores"),

      @SerializedName("bail_and_bond_payments")
      BAIL_AND_BOND_PAYMENTS("bail_and_bond_payments"),

      @SerializedName("bakeries")
      BAKERIES("bakeries"),

      @SerializedName("bands_orchestras")
      BANDS_ORCHESTRAS("bands_orchestras"),

      @SerializedName("barber_and_beauty_shops")
      BARBER_AND_BEAUTY_SHOPS("barber_and_beauty_shops"),

      @SerializedName("betting_casino_gambling")
      BETTING_CASINO_GAMBLING("betting_casino_gambling"),

      @SerializedName("bicycle_shops")
      BICYCLE_SHOPS("bicycle_shops"),

      @SerializedName("billiard_pool_establishments")
      BILLIARD_POOL_ESTABLISHMENTS("billiard_pool_establishments"),

      @SerializedName("boat_dealers")
      BOAT_DEALERS("boat_dealers"),

      @SerializedName("boat_rentals_and_leases")
      BOAT_RENTALS_AND_LEASES("boat_rentals_and_leases"),

      @SerializedName("book_stores")
      BOOK_STORES("book_stores"),

      @SerializedName("books_periodicals_and_newspapers")
      BOOKS_PERIODICALS_AND_NEWSPAPERS("books_periodicals_and_newspapers"),

      @SerializedName("bowling_alleys")
      BOWLING_ALLEYS("bowling_alleys"),

      @SerializedName("bus_lines")
      BUS_LINES("bus_lines"),

      @SerializedName("business_secretarial_schools")
      BUSINESS_SECRETARIAL_SCHOOLS("business_secretarial_schools"),

      @SerializedName("buying_shopping_services")
      BUYING_SHOPPING_SERVICES("buying_shopping_services"),

      @SerializedName("cable_satellite_and_other_pay_television_and_radio")
      CABLE_SATELLITE_AND_OTHER_PAY_TELEVISION_AND_RADIO(
          "cable_satellite_and_other_pay_television_and_radio"),

      @SerializedName("camera_and_photographic_supply_stores")
      CAMERA_AND_PHOTOGRAPHIC_SUPPLY_STORES("camera_and_photographic_supply_stores"),

      @SerializedName("candy_nut_and_confectionery_stores")
      CANDY_NUT_AND_CONFECTIONERY_STORES("candy_nut_and_confectionery_stores"),

      @SerializedName("car_and_truck_dealers_new_used")
      CAR_AND_TRUCK_DEALERS_NEW_USED("car_and_truck_dealers_new_used"),

      @SerializedName("car_and_truck_dealers_used_only")
      CAR_AND_TRUCK_DEALERS_USED_ONLY("car_and_truck_dealers_used_only"),

      @SerializedName("car_rental_agencies")
      CAR_RENTAL_AGENCIES("car_rental_agencies"),

      @SerializedName("car_washes")
      CAR_WASHES("car_washes"),

      @SerializedName("carpentry_services")
      CARPENTRY_SERVICES("carpentry_services"),

      @SerializedName("carpet_upholstery_cleaning")
      CARPET_UPHOLSTERY_CLEANING("carpet_upholstery_cleaning"),

      @SerializedName("caterers")
      CATERERS("caterers"),

      @SerializedName("charitable_and_social_service_organizations_fundraising")
      CHARITABLE_AND_SOCIAL_SERVICE_ORGANIZATIONS_FUNDRAISING(
          "charitable_and_social_service_organizations_fundraising"),

      @SerializedName("chemicals_and_allied_products")
      CHEMICALS_AND_ALLIED_PRODUCTS("chemicals_and_allied_products"),

      @SerializedName("child_care_services")
      CHILD_CARE_SERVICES("child_care_services"),

      @SerializedName("childrens_and_infants_wear_stores")
      CHILDRENS_AND_INFANTS_WEAR_STORES("childrens_and_infants_wear_stores"),

      @SerializedName("chiropodists_podiatrists")
      CHIROPODISTS_PODIATRISTS("chiropodists_podiatrists"),

      @SerializedName("chiropractors")
      CHIROPRACTORS("chiropractors"),

      @SerializedName("cigar_stores_and_stands")
      CIGAR_STORES_AND_STANDS("cigar_stores_and_stands"),

      @SerializedName("civic_social_fraternal_associations")
      CIVIC_SOCIAL_FRATERNAL_ASSOCIATIONS("civic_social_fraternal_associations"),

      @SerializedName("cleaning_and_maintenance")
      CLEANING_AND_MAINTENANCE("cleaning_and_maintenance"),

      @SerializedName("clothing_rental")
      CLOTHING_RENTAL("clothing_rental"),

      @SerializedName("colleges_universities")
      COLLEGES_UNIVERSITIES("colleges_universities"),

      @SerializedName("commercial_equipment")
      COMMERCIAL_EQUIPMENT("commercial_equipment"),

      @SerializedName("commercial_footwear")
      COMMERCIAL_FOOTWEAR("commercial_footwear"),

      @SerializedName("commercial_photography_art_and_graphics")
      COMMERCIAL_PHOTOGRAPHY_ART_AND_GRAPHICS("commercial_photography_art_and_graphics"),

      @SerializedName("commuter_transport_and_ferries")
      COMMUTER_TRANSPORT_AND_FERRIES("commuter_transport_and_ferries"),

      @SerializedName("computer_network_services")
      COMPUTER_NETWORK_SERVICES("computer_network_services"),

      @SerializedName("computer_programming")
      COMPUTER_PROGRAMMING("computer_programming"),

      @SerializedName("computer_repair")
      COMPUTER_REPAIR("computer_repair"),

      @SerializedName("computer_software_stores")
      COMPUTER_SOFTWARE_STORES("computer_software_stores"),

      @SerializedName("computers_peripherals_and_software")
      COMPUTERS_PERIPHERALS_AND_SOFTWARE("computers_peripherals_and_software"),

      @SerializedName("concrete_work_services")
      CONCRETE_WORK_SERVICES("concrete_work_services"),

      @SerializedName("construction_materials")
      CONSTRUCTION_MATERIALS("construction_materials"),

      @SerializedName("consulting_public_relations")
      CONSULTING_PUBLIC_RELATIONS("consulting_public_relations"),

      @SerializedName("correspondence_schools")
      CORRESPONDENCE_SCHOOLS("correspondence_schools"),

      @SerializedName("cosmetic_stores")
      COSMETIC_STORES("cosmetic_stores"),

      @SerializedName("counseling_services")
      COUNSELING_SERVICES("counseling_services"),

      @SerializedName("country_clubs")
      COUNTRY_CLUBS("country_clubs"),

      @SerializedName("courier_services")
      COURIER_SERVICES("courier_services"),

      @SerializedName("court_costs")
      COURT_COSTS("court_costs"),

      @SerializedName("credit_reporting_agencies")
      CREDIT_REPORTING_AGENCIES("credit_reporting_agencies"),

      @SerializedName("cruise_lines")
      CRUISE_LINES("cruise_lines"),

      @SerializedName("dairy_products_stores")
      DAIRY_PRODUCTS_STORES("dairy_products_stores"),

      @SerializedName("dance_hall_studios_schools")
      DANCE_HALL_STUDIOS_SCHOOLS("dance_hall_studios_schools"),

      @SerializedName("dating_escort_services")
      DATING_ESCORT_SERVICES("dating_escort_services"),

      @SerializedName("dentists_orthodontists")
      DENTISTS_ORTHODONTISTS("dentists_orthodontists"),

      @SerializedName("department_stores")
      DEPARTMENT_STORES("department_stores"),

      @SerializedName("detective_agencies")
      DETECTIVE_AGENCIES("detective_agencies"),

      @SerializedName("digital_goods_applications")
      DIGITAL_GOODS_APPLICATIONS("digital_goods_applications"),

      @SerializedName("digital_goods_games")
      DIGITAL_GOODS_GAMES("digital_goods_games"),

      @SerializedName("digital_goods_large_volume")
      DIGITAL_GOODS_LARGE_VOLUME("digital_goods_large_volume"),

      @SerializedName("digital_goods_media")
      DIGITAL_GOODS_MEDIA("digital_goods_media"),

      @SerializedName("direct_marketing_catalog_merchant")
      DIRECT_MARKETING_CATALOG_MERCHANT("direct_marketing_catalog_merchant"),

      @SerializedName("direct_marketing_combination_catalog_and_retail_merchant")
      DIRECT_MARKETING_COMBINATION_CATALOG_AND_RETAIL_MERCHANT(
          "direct_marketing_combination_catalog_and_retail_merchant"),

      @SerializedName("direct_marketing_inbound_telemarketing")
      DIRECT_MARKETING_INBOUND_TELEMARKETING("direct_marketing_inbound_telemarketing"),

      @SerializedName("direct_marketing_insurance_services")
      DIRECT_MARKETING_INSURANCE_SERVICES("direct_marketing_insurance_services"),

      @SerializedName("direct_marketing_other")
      DIRECT_MARKETING_OTHER("direct_marketing_other"),

      @SerializedName("direct_marketing_outbound_telemarketing")
      DIRECT_MARKETING_OUTBOUND_TELEMARKETING("direct_marketing_outbound_telemarketing"),

      @SerializedName("direct_marketing_subscription")
      DIRECT_MARKETING_SUBSCRIPTION("direct_marketing_subscription"),

      @SerializedName("direct_marketing_travel")
      DIRECT_MARKETING_TRAVEL("direct_marketing_travel"),

      @SerializedName("discount_stores")
      DISCOUNT_STORES("discount_stores"),

      @SerializedName("doctors")
      DOCTORS("doctors"),

      @SerializedName("door_to_door_sales")
      DOOR_TO_DOOR_SALES("door_to_door_sales"),

      @SerializedName("drapery_window_covering_and_upholstery_stores")
      DRAPERY_WINDOW_COVERING_AND_UPHOLSTERY_STORES(
          "drapery_window_covering_and_upholstery_stores"),

      @SerializedName("drinking_places")
      DRINKING_PLACES("drinking_places"),

      @SerializedName("drug_stores_and_pharmacies")
      DRUG_STORES_AND_PHARMACIES("drug_stores_and_pharmacies"),

      @SerializedName("drugs_drug_proprietaries_and_druggist_sundries")
      DRUGS_DRUG_PROPRIETARIES_AND_DRUGGIST_SUNDRIES(
          "drugs_drug_proprietaries_and_druggist_sundries"),

      @SerializedName("dry_cleaners")
      DRY_CLEANERS("dry_cleaners"),

      @SerializedName("durable_goods")
      DURABLE_GOODS("durable_goods"),

      @SerializedName("duty_free_stores")
      DUTY_FREE_STORES("duty_free_stores"),

      @SerializedName("eating_places_restaurants")
      EATING_PLACES_RESTAURANTS("eating_places_restaurants"),

      @SerializedName("educational_services")
      EDUCATIONAL_SERVICES("educational_services"),

      @SerializedName("electric_razor_stores")
      ELECTRIC_RAZOR_STORES("electric_razor_stores"),

      @SerializedName("electric_vehicle_charging")
      ELECTRIC_VEHICLE_CHARGING("electric_vehicle_charging"),

      @SerializedName("electrical_parts_and_equipment")
      ELECTRICAL_PARTS_AND_EQUIPMENT("electrical_parts_and_equipment"),

      @SerializedName("electrical_services")
      ELECTRICAL_SERVICES("electrical_services"),

      @SerializedName("electronics_repair_shops")
      ELECTRONICS_REPAIR_SHOPS("electronics_repair_shops"),

      @SerializedName("electronics_stores")
      ELECTRONICS_STORES("electronics_stores"),

      @SerializedName("elementary_secondary_schools")
      ELEMENTARY_SECONDARY_SCHOOLS("elementary_secondary_schools"),

      @SerializedName("emergency_services_gcas_visa_use_only")
      EMERGENCY_SERVICES_GCAS_VISA_USE_ONLY("emergency_services_gcas_visa_use_only"),

      @SerializedName("employment_temp_agencies")
      EMPLOYMENT_TEMP_AGENCIES("employment_temp_agencies"),

      @SerializedName("equipment_rental")
      EQUIPMENT_RENTAL("equipment_rental"),

      @SerializedName("exterminating_services")
      EXTERMINATING_SERVICES("exterminating_services"),

      @SerializedName("family_clothing_stores")
      FAMILY_CLOTHING_STORES("family_clothing_stores"),

      @SerializedName("fast_food_restaurants")
      FAST_FOOD_RESTAURANTS("fast_food_restaurants"),

      @SerializedName("financial_institutions")
      FINANCIAL_INSTITUTIONS("financial_institutions"),

      @SerializedName("fines_government_administrative_entities")
      FINES_GOVERNMENT_ADMINISTRATIVE_ENTITIES("fines_government_administrative_entities"),

      @SerializedName("fireplace_fireplace_screens_and_accessories_stores")
      FIREPLACE_FIREPLACE_SCREENS_AND_ACCESSORIES_STORES(
          "fireplace_fireplace_screens_and_accessories_stores"),

      @SerializedName("floor_covering_stores")
      FLOOR_COVERING_STORES("floor_covering_stores"),

      @SerializedName("florists")
      FLORISTS("florists"),

      @SerializedName("florists_supplies_nursery_stock_and_flowers")
      FLORISTS_SUPPLIES_NURSERY_STOCK_AND_FLOWERS("florists_supplies_nursery_stock_and_flowers"),

      @SerializedName("freezer_and_locker_meat_provisioners")
      FREEZER_AND_LOCKER_MEAT_PROVISIONERS("freezer_and_locker_meat_provisioners"),

      @SerializedName("fuel_dealers_non_automotive")
      FUEL_DEALERS_NON_AUTOMOTIVE("fuel_dealers_non_automotive"),

      @SerializedName("funeral_services_crematories")
      FUNERAL_SERVICES_CREMATORIES("funeral_services_crematories"),

      @SerializedName("furniture_home_furnishings_and_equipment_stores_except_appliances")
      FURNITURE_HOME_FURNISHINGS_AND_EQUIPMENT_STORES_EXCEPT_APPLIANCES(
          "furniture_home_furnishings_and_equipment_stores_except_appliances"),

      @SerializedName("furniture_repair_refinishing")
      FURNITURE_REPAIR_REFINISHING("furniture_repair_refinishing"),

      @SerializedName("furriers_and_fur_shops")
      FURRIERS_AND_FUR_SHOPS("furriers_and_fur_shops"),

      @SerializedName("general_services")
      GENERAL_SERVICES("general_services"),

      @SerializedName("gift_card_novelty_and_souvenir_shops")
      GIFT_CARD_NOVELTY_AND_SOUVENIR_SHOPS("gift_card_novelty_and_souvenir_shops"),

      @SerializedName("glass_paint_and_wallpaper_stores")
      GLASS_PAINT_AND_WALLPAPER_STORES("glass_paint_and_wallpaper_stores"),

      @SerializedName("glassware_crystal_stores")
      GLASSWARE_CRYSTAL_STORES("glassware_crystal_stores"),

      @SerializedName("golf_courses_public")
      GOLF_COURSES_PUBLIC("golf_courses_public"),

      @SerializedName("government_licensed_horse_dog_racing_us_region_only")
      GOVERNMENT_LICENSED_HORSE_DOG_RACING_US_REGION_ONLY(
          "government_licensed_horse_dog_racing_us_region_only"),

      @SerializedName("government_licensed_online_casions_online_gambling_us_region_only")
      GOVERNMENT_LICENSED_ONLINE_CASIONS_ONLINE_GAMBLING_US_REGION_ONLY(
          "government_licensed_online_casions_online_gambling_us_region_only"),

      @SerializedName("government_owned_lotteries_non_us_region")
      GOVERNMENT_OWNED_LOTTERIES_NON_US_REGION("government_owned_lotteries_non_us_region"),

      @SerializedName("government_owned_lotteries_us_region_only")
      GOVERNMENT_OWNED_LOTTERIES_US_REGION_ONLY("government_owned_lotteries_us_region_only"),

      @SerializedName("government_services")
      GOVERNMENT_SERVICES("government_services"),

      @SerializedName("grocery_stores_supermarkets")
      GROCERY_STORES_SUPERMARKETS("grocery_stores_supermarkets"),

      @SerializedName("hardware_equipment_and_supplies")
      HARDWARE_EQUIPMENT_AND_SUPPLIES("hardware_equipment_and_supplies"),

      @SerializedName("hardware_stores")
      HARDWARE_STORES("hardware_stores"),

      @SerializedName("health_and_beauty_spas")
      HEALTH_AND_BEAUTY_SPAS("health_and_beauty_spas"),

      @SerializedName("hearing_aids_sales_and_supplies")
      HEARING_AIDS_SALES_AND_SUPPLIES("hearing_aids_sales_and_supplies"),

      @SerializedName("heating_plumbing_a_c")
      HEATING_PLUMBING_A_C("heating_plumbing_a_c"),

      @SerializedName("hobby_toy_and_game_shops")
      HOBBY_TOY_AND_GAME_SHOPS("hobby_toy_and_game_shops"),

      @SerializedName("home_supply_warehouse_stores")
      HOME_SUPPLY_WAREHOUSE_STORES("home_supply_warehouse_stores"),

      @SerializedName("hospitals")
      HOSPITALS("hospitals"),

      @SerializedName("hotels_motels_and_resorts")
      HOTELS_MOTELS_AND_RESORTS("hotels_motels_and_resorts"),

      @SerializedName("household_appliance_stores")
      HOUSEHOLD_APPLIANCE_STORES("household_appliance_stores"),

      @SerializedName("industrial_supplies")
      INDUSTRIAL_SUPPLIES("industrial_supplies"),

      @SerializedName("information_retrieval_services")
      INFORMATION_RETRIEVAL_SERVICES("information_retrieval_services"),

      @SerializedName("insurance_default")
      INSURANCE_DEFAULT("insurance_default"),

      @SerializedName("insurance_underwriting_premiums")
      INSURANCE_UNDERWRITING_PREMIUMS("insurance_underwriting_premiums"),

      @SerializedName("intra_company_purchases")
      INTRA_COMPANY_PURCHASES("intra_company_purchases"),

      @SerializedName("jewelry_stores_watches_clocks_and_silverware_stores")
      JEWELRY_STORES_WATCHES_CLOCKS_AND_SILVERWARE_STORES(
          "jewelry_stores_watches_clocks_and_silverware_stores"),

      @SerializedName("landscaping_services")
      LANDSCAPING_SERVICES("landscaping_services"),

      @SerializedName("laundries")
      LAUNDRIES("laundries"),

      @SerializedName("laundry_cleaning_services")
      LAUNDRY_CLEANING_SERVICES("laundry_cleaning_services"),

      @SerializedName("legal_services_attorneys")
      LEGAL_SERVICES_ATTORNEYS("legal_services_attorneys"),

      @SerializedName("luggage_and_leather_goods_stores")
      LUGGAGE_AND_LEATHER_GOODS_STORES("luggage_and_leather_goods_stores"),

      @SerializedName("lumber_building_materials_stores")
      LUMBER_BUILDING_MATERIALS_STORES("lumber_building_materials_stores"),

      @SerializedName("manual_cash_disburse")
      MANUAL_CASH_DISBURSE("manual_cash_disburse"),

      @SerializedName("marinas_service_and_supplies")
      MARINAS_SERVICE_AND_SUPPLIES("marinas_service_and_supplies"),

      @SerializedName("marketplaces")
      MARKETPLACES("marketplaces"),

      @SerializedName("masonry_stonework_and_plaster")
      MASONRY_STONEWORK_AND_PLASTER("masonry_stonework_and_plaster"),

      @SerializedName("massage_parlors")
      MASSAGE_PARLORS("massage_parlors"),

      @SerializedName("medical_and_dental_labs")
      MEDICAL_AND_DENTAL_LABS("medical_and_dental_labs"),

      @SerializedName("medical_dental_ophthalmic_and_hospital_equipment_and_supplies")
      MEDICAL_DENTAL_OPHTHALMIC_AND_HOSPITAL_EQUIPMENT_AND_SUPPLIES(
          "medical_dental_ophthalmic_and_hospital_equipment_and_supplies"),

      @SerializedName("medical_services")
      MEDICAL_SERVICES("medical_services"),

      @SerializedName("membership_organizations")
      MEMBERSHIP_ORGANIZATIONS("membership_organizations"),

      @SerializedName("mens_and_boys_clothing_and_accessories_stores")
      MENS_AND_BOYS_CLOTHING_AND_ACCESSORIES_STORES(
          "mens_and_boys_clothing_and_accessories_stores"),

      @SerializedName("mens_womens_clothing_stores")
      MENS_WOMENS_CLOTHING_STORES("mens_womens_clothing_stores"),

      @SerializedName("metal_service_centers")
      METAL_SERVICE_CENTERS("metal_service_centers"),

      @SerializedName("miscellaneous_apparel_and_accessory_shops")
      MISCELLANEOUS_APPAREL_AND_ACCESSORY_SHOPS("miscellaneous_apparel_and_accessory_shops"),

      @SerializedName("miscellaneous_auto_dealers")
      MISCELLANEOUS_AUTO_DEALERS("miscellaneous_auto_dealers"),

      @SerializedName("miscellaneous_business_services")
      MISCELLANEOUS_BUSINESS_SERVICES("miscellaneous_business_services"),

      @SerializedName("miscellaneous_food_stores")
      MISCELLANEOUS_FOOD_STORES("miscellaneous_food_stores"),

      @SerializedName("miscellaneous_general_merchandise")
      MISCELLANEOUS_GENERAL_MERCHANDISE("miscellaneous_general_merchandise"),

      @SerializedName("miscellaneous_general_services")
      MISCELLANEOUS_GENERAL_SERVICES("miscellaneous_general_services"),

      @SerializedName("miscellaneous_home_furnishing_specialty_stores")
      MISCELLANEOUS_HOME_FURNISHING_SPECIALTY_STORES(
          "miscellaneous_home_furnishing_specialty_stores"),

      @SerializedName("miscellaneous_publishing_and_printing")
      MISCELLANEOUS_PUBLISHING_AND_PRINTING("miscellaneous_publishing_and_printing"),

      @SerializedName("miscellaneous_recreation_services")
      MISCELLANEOUS_RECREATION_SERVICES("miscellaneous_recreation_services"),

      @SerializedName("miscellaneous_repair_shops")
      MISCELLANEOUS_REPAIR_SHOPS("miscellaneous_repair_shops"),

      @SerializedName("miscellaneous_specialty_retail")
      MISCELLANEOUS_SPECIALTY_RETAIL("miscellaneous_specialty_retail"),

      @SerializedName("mobile_home_dealers")
      MOBILE_HOME_DEALERS("mobile_home_dealers"),

      @SerializedName("motion_picture_theaters")
      MOTION_PICTURE_THEATERS("motion_picture_theaters"),

      @SerializedName("motor_freight_carriers_and_trucking")
      MOTOR_FREIGHT_CARRIERS_AND_TRUCKING("motor_freight_carriers_and_trucking"),

      @SerializedName("motor_homes_dealers")
      MOTOR_HOMES_DEALERS("motor_homes_dealers"),

      @SerializedName("motor_vehicle_supplies_and_new_parts")
      MOTOR_VEHICLE_SUPPLIES_AND_NEW_PARTS("motor_vehicle_supplies_and_new_parts"),

      @SerializedName("motorcycle_shops_and_dealers")
      MOTORCYCLE_SHOPS_AND_DEALERS("motorcycle_shops_and_dealers"),

      @SerializedName("motorcycle_shops_dealers")
      MOTORCYCLE_SHOPS_DEALERS("motorcycle_shops_dealers"),

      @SerializedName("music_stores_musical_instruments_pianos_and_sheet_music")
      MUSIC_STORES_MUSICAL_INSTRUMENTS_PIANOS_AND_SHEET_MUSIC(
          "music_stores_musical_instruments_pianos_and_sheet_music"),

      @SerializedName("news_dealers_and_newsstands")
      NEWS_DEALERS_AND_NEWSSTANDS("news_dealers_and_newsstands"),

      @SerializedName("non_fi_money_orders")
      NON_FI_MONEY_ORDERS("non_fi_money_orders"),

      @SerializedName("non_fi_stored_value_card_purchase_load")
      NON_FI_STORED_VALUE_CARD_PURCHASE_LOAD("non_fi_stored_value_card_purchase_load"),

      @SerializedName("nondurable_goods")
      NONDURABLE_GOODS("nondurable_goods"),

      @SerializedName("nurseries_lawn_and_garden_supply_stores")
      NURSERIES_LAWN_AND_GARDEN_SUPPLY_STORES("nurseries_lawn_and_garden_supply_stores"),

      @SerializedName("nursing_personal_care")
      NURSING_PERSONAL_CARE("nursing_personal_care"),

      @SerializedName("office_and_commercial_furniture")
      OFFICE_AND_COMMERCIAL_FURNITURE("office_and_commercial_furniture"),

      @SerializedName("opticians_eyeglasses")
      OPTICIANS_EYEGLASSES("opticians_eyeglasses"),

      @SerializedName("optometrists_ophthalmologist")
      OPTOMETRISTS_OPHTHALMOLOGIST("optometrists_ophthalmologist"),

      @SerializedName("orthopedic_goods_prosthetic_devices")
      ORTHOPEDIC_GOODS_PROSTHETIC_DEVICES("orthopedic_goods_prosthetic_devices"),

      @SerializedName("osteopaths")
      OSTEOPATHS("osteopaths"),

      @SerializedName("package_stores_beer_wine_and_liquor")
      PACKAGE_STORES_BEER_WINE_AND_LIQUOR("package_stores_beer_wine_and_liquor"),

      @SerializedName("paints_varnishes_and_supplies")
      PAINTS_VARNISHES_AND_SUPPLIES("paints_varnishes_and_supplies"),

      @SerializedName("parking_lots_garages")
      PARKING_LOTS_GARAGES("parking_lots_garages"),

      @SerializedName("passenger_railways")
      PASSENGER_RAILWAYS("passenger_railways"),

      @SerializedName("pawn_shops")
      PAWN_SHOPS("pawn_shops"),

      @SerializedName("pet_shops_pet_food_and_supplies")
      PET_SHOPS_PET_FOOD_AND_SUPPLIES("pet_shops_pet_food_and_supplies"),

      @SerializedName("petroleum_and_petroleum_products")
      PETROLEUM_AND_PETROLEUM_PRODUCTS("petroleum_and_petroleum_products"),

      @SerializedName("photo_developing")
      PHOTO_DEVELOPING("photo_developing"),

      @SerializedName("photographic_photocopy_microfilm_equipment_and_supplies")
      PHOTOGRAPHIC_PHOTOCOPY_MICROFILM_EQUIPMENT_AND_SUPPLIES(
          "photographic_photocopy_microfilm_equipment_and_supplies"),

      @SerializedName("photographic_studios")
      PHOTOGRAPHIC_STUDIOS("photographic_studios"),

      @SerializedName("picture_video_production")
      PICTURE_VIDEO_PRODUCTION("picture_video_production"),

      @SerializedName("piece_goods_notions_and_other_dry_goods")
      PIECE_GOODS_NOTIONS_AND_OTHER_DRY_GOODS("piece_goods_notions_and_other_dry_goods"),

      @SerializedName("plumbing_heating_equipment_and_supplies")
      PLUMBING_HEATING_EQUIPMENT_AND_SUPPLIES("plumbing_heating_equipment_and_supplies"),

      @SerializedName("political_organizations")
      POLITICAL_ORGANIZATIONS("political_organizations"),

      @SerializedName("postal_services_government_only")
      POSTAL_SERVICES_GOVERNMENT_ONLY("postal_services_government_only"),

      @SerializedName("precious_stones_and_metals_watches_and_jewelry")
      PRECIOUS_STONES_AND_METALS_WATCHES_AND_JEWELRY(
          "precious_stones_and_metals_watches_and_jewelry"),

      @SerializedName("professional_services")
      PROFESSIONAL_SERVICES("professional_services"),

      @SerializedName("public_warehousing_and_storage")
      PUBLIC_WAREHOUSING_AND_STORAGE("public_warehousing_and_storage"),

      @SerializedName("quick_copy_repro_and_blueprint")
      QUICK_COPY_REPRO_AND_BLUEPRINT("quick_copy_repro_and_blueprint"),

      @SerializedName("railroads")
      RAILROADS("railroads"),

      @SerializedName("real_estate_agents_and_managers_rentals")
      REAL_ESTATE_AGENTS_AND_MANAGERS_RENTALS("real_estate_agents_and_managers_rentals"),

      @SerializedName("record_stores")
      RECORD_STORES("record_stores"),

      @SerializedName("recreational_vehicle_rentals")
      RECREATIONAL_VEHICLE_RENTALS("recreational_vehicle_rentals"),

      @SerializedName("religious_goods_stores")
      RELIGIOUS_GOODS_STORES("religious_goods_stores"),

      @SerializedName("religious_organizations")
      RELIGIOUS_ORGANIZATIONS("religious_organizations"),

      @SerializedName("roofing_siding_sheet_metal")
      ROOFING_SIDING_SHEET_METAL("roofing_siding_sheet_metal"),

      @SerializedName("secretarial_support_services")
      SECRETARIAL_SUPPORT_SERVICES("secretarial_support_services"),

      @SerializedName("security_brokers_dealers")
      SECURITY_BROKERS_DEALERS("security_brokers_dealers"),

      @SerializedName("service_stations")
      SERVICE_STATIONS("service_stations"),

      @SerializedName("sewing_needlework_fabric_and_piece_goods_stores")
      SEWING_NEEDLEWORK_FABRIC_AND_PIECE_GOODS_STORES(
          "sewing_needlework_fabric_and_piece_goods_stores"),

      @SerializedName("shoe_repair_hat_cleaning")
      SHOE_REPAIR_HAT_CLEANING("shoe_repair_hat_cleaning"),

      @SerializedName("shoe_stores")
      SHOE_STORES("shoe_stores"),

      @SerializedName("small_appliance_repair")
      SMALL_APPLIANCE_REPAIR("small_appliance_repair"),

      @SerializedName("snowmobile_dealers")
      SNOWMOBILE_DEALERS("snowmobile_dealers"),

      @SerializedName("special_trade_services")
      SPECIAL_TRADE_SERVICES("special_trade_services"),

      @SerializedName("specialty_cleaning")
      SPECIALTY_CLEANING("specialty_cleaning"),

      @SerializedName("sporting_goods_stores")
      SPORTING_GOODS_STORES("sporting_goods_stores"),

      @SerializedName("sporting_recreation_camps")
      SPORTING_RECREATION_CAMPS("sporting_recreation_camps"),

      @SerializedName("sports_and_riding_apparel_stores")
      SPORTS_AND_RIDING_APPAREL_STORES("sports_and_riding_apparel_stores"),

      @SerializedName("sports_clubs_fields")
      SPORTS_CLUBS_FIELDS("sports_clubs_fields"),

      @SerializedName("stamp_and_coin_stores")
      STAMP_AND_COIN_STORES("stamp_and_coin_stores"),

      @SerializedName("stationary_office_supplies_printing_and_writing_paper")
      STATIONARY_OFFICE_SUPPLIES_PRINTING_AND_WRITING_PAPER(
          "stationary_office_supplies_printing_and_writing_paper"),

      @SerializedName("stationery_stores_office_and_school_supply_stores")
      STATIONERY_STORES_OFFICE_AND_SCHOOL_SUPPLY_STORES(
          "stationery_stores_office_and_school_supply_stores"),

      @SerializedName("swimming_pools_sales")
      SWIMMING_POOLS_SALES("swimming_pools_sales"),

      @SerializedName("t_ui_travel_germany")
      T_UI_TRAVEL_GERMANY("t_ui_travel_germany"),

      @SerializedName("tailors_alterations")
      TAILORS_ALTERATIONS("tailors_alterations"),

      @SerializedName("tax_payments_government_agencies")
      TAX_PAYMENTS_GOVERNMENT_AGENCIES("tax_payments_government_agencies"),

      @SerializedName("tax_preparation_services")
      TAX_PREPARATION_SERVICES("tax_preparation_services"),

      @SerializedName("taxicabs_limousines")
      TAXICABS_LIMOUSINES("taxicabs_limousines"),

      @SerializedName("telecommunication_equipment_and_telephone_sales")
      TELECOMMUNICATION_EQUIPMENT_AND_TELEPHONE_SALES(
          "telecommunication_equipment_and_telephone_sales"),

      @SerializedName("telecommunication_services")
      TELECOMMUNICATION_SERVICES("telecommunication_services"),

      @SerializedName("telegraph_services")
      TELEGRAPH_SERVICES("telegraph_services"),

      @SerializedName("tent_and_awning_shops")
      TENT_AND_AWNING_SHOPS("tent_and_awning_shops"),

      @SerializedName("testing_laboratories")
      TESTING_LABORATORIES("testing_laboratories"),

      @SerializedName("theatrical_ticket_agencies")
      THEATRICAL_TICKET_AGENCIES("theatrical_ticket_agencies"),

      @SerializedName("timeshares")
      TIMESHARES("timeshares"),

      @SerializedName("tire_retreading_and_repair")
      TIRE_RETREADING_AND_REPAIR("tire_retreading_and_repair"),

      @SerializedName("tolls_bridge_fees")
      TOLLS_BRIDGE_FEES("tolls_bridge_fees"),

      @SerializedName("tourist_attractions_and_exhibits")
      TOURIST_ATTRACTIONS_AND_EXHIBITS("tourist_attractions_and_exhibits"),

      @SerializedName("towing_services")
      TOWING_SERVICES("towing_services"),

      @SerializedName("trailer_parks_campgrounds")
      TRAILER_PARKS_CAMPGROUNDS("trailer_parks_campgrounds"),

      @SerializedName("transportation_services")
      TRANSPORTATION_SERVICES("transportation_services"),

      @SerializedName("travel_agencies_tour_operators")
      TRAVEL_AGENCIES_TOUR_OPERATORS("travel_agencies_tour_operators"),

      @SerializedName("truck_stop_iteration")
      TRUCK_STOP_ITERATION("truck_stop_iteration"),

      @SerializedName("truck_utility_trailer_rentals")
      TRUCK_UTILITY_TRAILER_RENTALS("truck_utility_trailer_rentals"),

      @SerializedName("typesetting_plate_making_and_related_services")
      TYPESETTING_PLATE_MAKING_AND_RELATED_SERVICES(
          "typesetting_plate_making_and_related_services"),

      @SerializedName("typewriter_stores")
      TYPEWRITER_STORES("typewriter_stores"),

      @SerializedName("u_s_federal_government_agencies_or_departments")
      U_S_FEDERAL_GOVERNMENT_AGENCIES_OR_DEPARTMENTS(
          "u_s_federal_government_agencies_or_departments"),

      @SerializedName("uniforms_commercial_clothing")
      UNIFORMS_COMMERCIAL_CLOTHING("uniforms_commercial_clothing"),

      @SerializedName("used_merchandise_and_secondhand_stores")
      USED_MERCHANDISE_AND_SECONDHAND_STORES("used_merchandise_and_secondhand_stores"),

      @SerializedName("utilities")
      UTILITIES("utilities"),

      @SerializedName("variety_stores")
      VARIETY_STORES("variety_stores"),

      @SerializedName("veterinary_services")
      VETERINARY_SERVICES("veterinary_services"),

      @SerializedName("video_amusement_game_supplies")
      VIDEO_AMUSEMENT_GAME_SUPPLIES("video_amusement_game_supplies"),

      @SerializedName("video_game_arcades")
      VIDEO_GAME_ARCADES("video_game_arcades"),

      @SerializedName("video_tape_rental_stores")
      VIDEO_TAPE_RENTAL_STORES("video_tape_rental_stores"),

      @SerializedName("vocational_trade_schools")
      VOCATIONAL_TRADE_SCHOOLS("vocational_trade_schools"),

      @SerializedName("watch_jewelry_repair")
      WATCH_JEWELRY_REPAIR("watch_jewelry_repair"),

      @SerializedName("welding_repair")
      WELDING_REPAIR("welding_repair"),

      @SerializedName("wholesale_clubs")
      WHOLESALE_CLUBS("wholesale_clubs"),

      @SerializedName("wig_and_toupee_stores")
      WIG_AND_TOUPEE_STORES("wig_and_toupee_stores"),

      @SerializedName("wires_money_orders")
      WIRES_MONEY_ORDERS("wires_money_orders"),

      @SerializedName("womens_accessory_and_specialty_shops")
      WOMENS_ACCESSORY_AND_SPECIALTY_SHOPS("womens_accessory_and_specialty_shops"),

      @SerializedName("womens_ready_to_wear_stores")
      WOMENS_READY_TO_WEAR_STORES("womens_ready_to_wear_stores"),

      @SerializedName("wrecking_and_salvage_yards")
      WRECKING_AND_SALVAGE_YARDS("wrecking_and_salvage_yards");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Category(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PurchaseDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Fleet-specific information for transactions using Fleet cards. */
    @SerializedName("fleet")
    Fleet fleet;

    /** Information about the flight that was purchased with this transaction. */
    @SerializedName("flight")
    Flight flight;

    /** Information about fuel that was purchased with this transaction. */
    @SerializedName("fuel")
    Fuel fuel;

    /** Information about lodging that was purchased with this transaction. */
    @SerializedName("lodging")
    Lodging lodging;

    /** The line items in the purchase. */
    @SerializedName("receipt")
    List<TransactionCreateUnlinkedRefundParams.PurchaseDetails.Receipt> receipt;

    /** A merchant-specific order number. */
    @SerializedName("reference")
    String reference;

    private PurchaseDetails(
        Map<String, Object> extraParams,
        Fleet fleet,
        Flight flight,
        Fuel fuel,
        Lodging lodging,
        List<TransactionCreateUnlinkedRefundParams.PurchaseDetails.Receipt> receipt,
        String reference) {
      this.extraParams = extraParams;
      this.fleet = fleet;
      this.flight = flight;
      this.fuel = fuel;
      this.lodging = lodging;
      this.receipt = receipt;
      this.reference = reference;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Fleet fleet;

      private Flight flight;

      private Fuel fuel;

      private Lodging lodging;

      private List<TransactionCreateUnlinkedRefundParams.PurchaseDetails.Receipt> receipt;

      private String reference;

      /** Finalize and obtain parameter instance from this builder. */
      public TransactionCreateUnlinkedRefundParams.PurchaseDetails build() {
        return new TransactionCreateUnlinkedRefundParams.PurchaseDetails(
            this.extraParams,
            this.fleet,
            this.flight,
            this.fuel,
            this.lodging,
            this.receipt,
            this.reference);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TransactionCreateUnlinkedRefundParams.PurchaseDetails#extraParams} for the field
       * documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link TransactionCreateUnlinkedRefundParams.PurchaseDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Fleet-specific information for transactions using Fleet cards. */
      public Builder setFleet(TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet fleet) {
        this.fleet = fleet;
        return this;
      }

      /** Information about the flight that was purchased with this transaction. */
      public Builder setFlight(
          TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight flight) {
        this.flight = flight;
        return this;
      }

      /** Information about fuel that was purchased with this transaction. */
      public Builder setFuel(TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fuel fuel) {
        this.fuel = fuel;
        return this;
      }

      /** Information about lodging that was purchased with this transaction. */
      public Builder setLodging(
          TransactionCreateUnlinkedRefundParams.PurchaseDetails.Lodging lodging) {
        this.lodging = lodging;
        return this;
      }

      /**
       * Add an element to `receipt` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * TransactionCreateUnlinkedRefundParams.PurchaseDetails#receipt} for the field documentation.
       */
      public Builder addReceipt(
          TransactionCreateUnlinkedRefundParams.PurchaseDetails.Receipt element) {
        if (this.receipt == null) {
          this.receipt = new ArrayList<>();
        }
        this.receipt.add(element);
        return this;
      }

      /**
       * Add all elements to `receipt` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * TransactionCreateUnlinkedRefundParams.PurchaseDetails#receipt} for the field documentation.
       */
      public Builder addAllReceipt(
          List<TransactionCreateUnlinkedRefundParams.PurchaseDetails.Receipt> elements) {
        if (this.receipt == null) {
          this.receipt = new ArrayList<>();
        }
        this.receipt.addAll(elements);
        return this;
      }

      /** A merchant-specific order number. */
      public Builder setReference(String reference) {
        this.reference = reference;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Fleet {
      /**
       * Answers to prompts presented to the cardholder at the point of sale. Prompted fields vary
       * depending on the configuration of your physical fleet cards. Typical points of sale support
       * only numeric entry.
       */
      @SerializedName("cardholder_prompt_data")
      CardholderPromptData cardholderPromptData;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The type of purchase. One of {@code fuel_purchase}, {@code non_fuel_purchase}, or {@code
       * fuel_and_non_fuel_purchase}.
       */
      @SerializedName("purchase_type")
      PurchaseType purchaseType;

      /**
       * More information about the total amount. This information is not guaranteed to be accurate
       * as some merchants may provide unreliable data.
       */
      @SerializedName("reported_breakdown")
      ReportedBreakdown reportedBreakdown;

      /**
       * The type of fuel service. One of {@code non_fuel_transaction}, {@code full_service}, or
       * {@code self_service}.
       */
      @SerializedName("service_type")
      ServiceType serviceType;

      private Fleet(
          CardholderPromptData cardholderPromptData,
          Map<String, Object> extraParams,
          PurchaseType purchaseType,
          ReportedBreakdown reportedBreakdown,
          ServiceType serviceType) {
        this.cardholderPromptData = cardholderPromptData;
        this.extraParams = extraParams;
        this.purchaseType = purchaseType;
        this.reportedBreakdown = reportedBreakdown;
        this.serviceType = serviceType;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private CardholderPromptData cardholderPromptData;

        private Map<String, Object> extraParams;

        private PurchaseType purchaseType;

        private ReportedBreakdown reportedBreakdown;

        private ServiceType serviceType;

        /** Finalize and obtain parameter instance from this builder. */
        public TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet build() {
          return new TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet(
              this.cardholderPromptData,
              this.extraParams,
              this.purchaseType,
              this.reportedBreakdown,
              this.serviceType);
        }

        /**
         * Answers to prompts presented to the cardholder at the point of sale. Prompted fields vary
         * depending on the configuration of your physical fleet cards. Typical points of sale
         * support only numeric entry.
         */
        public Builder setCardholderPromptData(
            TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.CardholderPromptData
                cardholderPromptData) {
          this.cardholderPromptData = cardholderPromptData;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * The type of purchase. One of {@code fuel_purchase}, {@code non_fuel_purchase}, or {@code
         * fuel_and_non_fuel_purchase}.
         */
        public Builder setPurchaseType(
            TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.PurchaseType purchaseType) {
          this.purchaseType = purchaseType;
          return this;
        }

        /**
         * More information about the total amount. This information is not guaranteed to be
         * accurate as some merchants may provide unreliable data.
         */
        public Builder setReportedBreakdown(
            TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown
                reportedBreakdown) {
          this.reportedBreakdown = reportedBreakdown;
          return this;
        }

        /**
         * The type of fuel service. One of {@code non_fuel_transaction}, {@code full_service}, or
         * {@code self_service}.
         */
        public Builder setServiceType(
            TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ServiceType serviceType) {
          this.serviceType = serviceType;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class CardholderPromptData {
        /** Driver ID. */
        @SerializedName("driver_id")
        String driverId;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Odometer reading. */
        @SerializedName("odometer")
        Long odometer;

        /**
         * An alphanumeric ID. This field is used when a vehicle ID, driver ID, or generic ID is
         * entered by the cardholder, but the merchant or card network did not specify the prompt
         * type.
         */
        @SerializedName("unspecified_id")
        String unspecifiedId;

        /** User ID. */
        @SerializedName("user_id")
        String userId;

        /** Vehicle number. */
        @SerializedName("vehicle_number")
        String vehicleNumber;

        private CardholderPromptData(
            String driverId,
            Map<String, Object> extraParams,
            Long odometer,
            String unspecifiedId,
            String userId,
            String vehicleNumber) {
          this.driverId = driverId;
          this.extraParams = extraParams;
          this.odometer = odometer;
          this.unspecifiedId = unspecifiedId;
          this.userId = userId;
          this.vehicleNumber = vehicleNumber;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String driverId;

          private Map<String, Object> extraParams;

          private Long odometer;

          private String unspecifiedId;

          private String userId;

          private String vehicleNumber;

          /** Finalize and obtain parameter instance from this builder. */
          public TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.CardholderPromptData
              build() {
            return new TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet
                .CardholderPromptData(
                this.driverId,
                this.extraParams,
                this.odometer,
                this.unspecifiedId,
                this.userId,
                this.vehicleNumber);
          }

          /** Driver ID. */
          public Builder setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.CardholderPromptData#extraParams}
           * for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.CardholderPromptData#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Odometer reading. */
          public Builder setOdometer(Long odometer) {
            this.odometer = odometer;
            return this;
          }

          /**
           * An alphanumeric ID. This field is used when a vehicle ID, driver ID, or generic ID is
           * entered by the cardholder, but the merchant or card network did not specify the prompt
           * type.
           */
          public Builder setUnspecifiedId(String unspecifiedId) {
            this.unspecifiedId = unspecifiedId;
            return this;
          }

          /** User ID. */
          public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
          }

          /** Vehicle number. */
          public Builder setVehicleNumber(String vehicleNumber) {
            this.vehicleNumber = vehicleNumber;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class ReportedBreakdown {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Breakdown of fuel portion of the purchase. */
        @SerializedName("fuel")
        Fuel fuel;

        /** Breakdown of non-fuel portion of the purchase. */
        @SerializedName("non_fuel")
        NonFuel nonFuel;

        /** Information about tax included in this transaction. */
        @SerializedName("tax")
        Tax tax;

        private ReportedBreakdown(
            Map<String, Object> extraParams, Fuel fuel, NonFuel nonFuel, Tax tax) {
          this.extraParams = extraParams;
          this.fuel = fuel;
          this.nonFuel = nonFuel;
          this.tax = tax;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Fuel fuel;

          private NonFuel nonFuel;

          private Tax tax;

          /** Finalize and obtain parameter instance from this builder. */
          public TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown
              build() {
            return new TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet
                .ReportedBreakdown(this.extraParams, this.fuel, this.nonFuel, this.tax);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown#extraParams}
           * for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Breakdown of fuel portion of the purchase. */
          public Builder setFuel(
              TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown.Fuel
                  fuel) {
            this.fuel = fuel;
            return this;
          }

          /** Breakdown of non-fuel portion of the purchase. */
          public Builder setNonFuel(
              TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown.NonFuel
                  nonFuel) {
            this.nonFuel = nonFuel;
            return this;
          }

          /** Information about tax included in this transaction. */
          public Builder setTax(
              TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown.Tax
                  tax) {
            this.tax = tax;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Fuel {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Gross fuel amount that should equal Fuel Volume multipled by Fuel Unit Cost, inclusive
           * of taxes.
           */
          @SerializedName("gross_amount_decimal")
          BigDecimal grossAmountDecimal;

          private Fuel(Map<String, Object> extraParams, BigDecimal grossAmountDecimal) {
            this.extraParams = extraParams;
            this.grossAmountDecimal = grossAmountDecimal;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private BigDecimal grossAmountDecimal;

            /** Finalize and obtain parameter instance from this builder. */
            public TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown
                    .Fuel
                build() {
              return new TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet
                  .ReportedBreakdown.Fuel(this.extraParams, this.grossAmountDecimal);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown.Fuel#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown.Fuel#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * Gross fuel amount that should equal Fuel Volume multipled by Fuel Unit Cost,
             * inclusive of taxes.
             */
            public Builder setGrossAmountDecimal(BigDecimal grossAmountDecimal) {
              this.grossAmountDecimal = grossAmountDecimal;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class NonFuel {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Gross non-fuel amount that should equal the sum of the line items, inclusive of taxes.
           */
          @SerializedName("gross_amount_decimal")
          BigDecimal grossAmountDecimal;

          private NonFuel(Map<String, Object> extraParams, BigDecimal grossAmountDecimal) {
            this.extraParams = extraParams;
            this.grossAmountDecimal = grossAmountDecimal;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private BigDecimal grossAmountDecimal;

            /** Finalize and obtain parameter instance from this builder. */
            public TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown
                    .NonFuel
                build() {
              return new TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet
                  .ReportedBreakdown.NonFuel(this.extraParams, this.grossAmountDecimal);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown.NonFuel#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown.NonFuel#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * Gross non-fuel amount that should equal the sum of the line items, inclusive of
             * taxes.
             */
            public Builder setGrossAmountDecimal(BigDecimal grossAmountDecimal) {
              this.grossAmountDecimal = grossAmountDecimal;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Tax {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Amount of state or provincial Sales Tax included in the transaction amount. Null if not
           * reported by merchant or not subject to tax.
           */
          @SerializedName("local_amount_decimal")
          BigDecimal localAmountDecimal;

          /**
           * Amount of national Sales Tax or VAT included in the transaction amount. Null if not
           * reported by merchant or not subject to tax.
           */
          @SerializedName("national_amount_decimal")
          BigDecimal nationalAmountDecimal;

          private Tax(
              Map<String, Object> extraParams,
              BigDecimal localAmountDecimal,
              BigDecimal nationalAmountDecimal) {
            this.extraParams = extraParams;
            this.localAmountDecimal = localAmountDecimal;
            this.nationalAmountDecimal = nationalAmountDecimal;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private BigDecimal localAmountDecimal;

            private BigDecimal nationalAmountDecimal;

            /** Finalize and obtain parameter instance from this builder. */
            public TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown.Tax
                build() {
              return new TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet
                  .ReportedBreakdown.Tax(
                  this.extraParams, this.localAmountDecimal, this.nationalAmountDecimal);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown.Tax#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fleet.ReportedBreakdown.Tax#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * Amount of state or provincial Sales Tax included in the transaction amount. Null if
             * not reported by merchant or not subject to tax.
             */
            public Builder setLocalAmountDecimal(BigDecimal localAmountDecimal) {
              this.localAmountDecimal = localAmountDecimal;
              return this;
            }

            /**
             * Amount of national Sales Tax or VAT included in the transaction amount. Null if not
             * reported by merchant or not subject to tax.
             */
            public Builder setNationalAmountDecimal(BigDecimal nationalAmountDecimal) {
              this.nationalAmountDecimal = nationalAmountDecimal;
              return this;
            }
          }
        }
      }

      public enum PurchaseType implements ApiRequestParams.EnumParam {
        @SerializedName("fuel_and_non_fuel_purchase")
        FUEL_AND_NON_FUEL_PURCHASE("fuel_and_non_fuel_purchase"),

        @SerializedName("fuel_purchase")
        FUEL_PURCHASE("fuel_purchase"),

        @SerializedName("non_fuel_purchase")
        NON_FUEL_PURCHASE("non_fuel_purchase");

        @Getter(onMethod_ = {@Override})
        private final String value;

        PurchaseType(String value) {
          this.value = value;
        }
      }

      public enum ServiceType implements ApiRequestParams.EnumParam {
        @SerializedName("full_service")
        FULL_SERVICE("full_service"),

        @SerializedName("non_fuel_transaction")
        NON_FUEL_TRANSACTION("non_fuel_transaction"),

        @SerializedName("self_service")
        SELF_SERVICE("self_service");

        @Getter(onMethod_ = {@Override})
        private final String value;

        ServiceType(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Flight {
      /** The time that the flight departed. */
      @SerializedName("departure_at")
      Long departureAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The name of the passenger. */
      @SerializedName("passenger_name")
      String passengerName;

      /** Whether the ticket is refundable. */
      @SerializedName("refundable")
      Boolean refundable;

      /** The legs of the trip. */
      @SerializedName("segments")
      List<TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight.Segment> segments;

      /** The travel agency that issued the ticket. */
      @SerializedName("travel_agency")
      String travelAgency;

      private Flight(
          Long departureAt,
          Map<String, Object> extraParams,
          String passengerName,
          Boolean refundable,
          List<TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight.Segment> segments,
          String travelAgency) {
        this.departureAt = departureAt;
        this.extraParams = extraParams;
        this.passengerName = passengerName;
        this.refundable = refundable;
        this.segments = segments;
        this.travelAgency = travelAgency;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long departureAt;

        private Map<String, Object> extraParams;

        private String passengerName;

        private Boolean refundable;

        private List<TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight.Segment> segments;

        private String travelAgency;

        /** Finalize and obtain parameter instance from this builder. */
        public TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight build() {
          return new TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight(
              this.departureAt,
              this.extraParams,
              this.passengerName,
              this.refundable,
              this.segments,
              this.travelAgency);
        }

        /** The time that the flight departed. */
        public Builder setDepartureAt(Long departureAt) {
          this.departureAt = departureAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The name of the passenger. */
        public Builder setPassengerName(String passengerName) {
          this.passengerName = passengerName;
          return this;
        }

        /** Whether the ticket is refundable. */
        public Builder setRefundable(Boolean refundable) {
          this.refundable = refundable;
          return this;
        }

        /**
         * Add an element to `segments` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight#segments} for the field
         * documentation.
         */
        public Builder addSegment(
            TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight.Segment element) {
          if (this.segments == null) {
            this.segments = new ArrayList<>();
          }
          this.segments.add(element);
          return this;
        }

        /**
         * Add all elements to `segments` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight#segments} for the field
         * documentation.
         */
        public Builder addAllSegment(
            List<TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight.Segment> elements) {
          if (this.segments == null) {
            this.segments = new ArrayList<>();
          }
          this.segments.addAll(elements);
          return this;
        }

        /** The travel agency that issued the ticket. */
        public Builder setTravelAgency(String travelAgency) {
          this.travelAgency = travelAgency;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Segment {
        /** The three-letter IATA airport code of the flight's destination. */
        @SerializedName("arrival_airport_code")
        String arrivalAirportCode;

        /** The airline carrier code. */
        @SerializedName("carrier")
        String carrier;

        /** The three-letter IATA airport code that the flight departed from. */
        @SerializedName("departure_airport_code")
        String departureAirportCode;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The flight number. */
        @SerializedName("flight_number")
        String flightNumber;

        /** The flight's service class. */
        @SerializedName("service_class")
        String serviceClass;

        /** Whether a stopover is allowed on this flight. */
        @SerializedName("stopover_allowed")
        Boolean stopoverAllowed;

        private Segment(
            String arrivalAirportCode,
            String carrier,
            String departureAirportCode,
            Map<String, Object> extraParams,
            String flightNumber,
            String serviceClass,
            Boolean stopoverAllowed) {
          this.arrivalAirportCode = arrivalAirportCode;
          this.carrier = carrier;
          this.departureAirportCode = departureAirportCode;
          this.extraParams = extraParams;
          this.flightNumber = flightNumber;
          this.serviceClass = serviceClass;
          this.stopoverAllowed = stopoverAllowed;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String arrivalAirportCode;

          private String carrier;

          private String departureAirportCode;

          private Map<String, Object> extraParams;

          private String flightNumber;

          private String serviceClass;

          private Boolean stopoverAllowed;

          /** Finalize and obtain parameter instance from this builder. */
          public TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight.Segment build() {
            return new TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight.Segment(
                this.arrivalAirportCode,
                this.carrier,
                this.departureAirportCode,
                this.extraParams,
                this.flightNumber,
                this.serviceClass,
                this.stopoverAllowed);
          }

          /** The three-letter IATA airport code of the flight's destination. */
          public Builder setArrivalAirportCode(String arrivalAirportCode) {
            this.arrivalAirportCode = arrivalAirportCode;
            return this;
          }

          /** The airline carrier code. */
          public Builder setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
          }

          /** The three-letter IATA airport code that the flight departed from. */
          public Builder setDepartureAirportCode(String departureAirportCode) {
            this.departureAirportCode = departureAirportCode;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight.Segment#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Flight.Segment#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The flight number. */
          public Builder setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
          }

          /** The flight's service class. */
          public Builder setServiceClass(String serviceClass) {
            this.serviceClass = serviceClass;
            return this;
          }

          /** Whether a stopover is allowed on this flight. */
          public Builder setStopoverAllowed(Boolean stopoverAllowed) {
            this.stopoverAllowed = stopoverAllowed;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Fuel {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <a href="https://www.conexxus.org/conexxus-payment-system-product-codes">Conexxus Payment
       * System Product Code</a> identifying the primary fuel product purchased.
       */
      @SerializedName("industry_product_code")
      String industryProductCode;

      /**
       * The quantity of {@code unit}s of fuel that was dispensed, represented as a decimal string
       * with at most 12 decimal places.
       */
      @SerializedName("quantity_decimal")
      BigDecimal quantityDecimal;

      /**
       * The type of fuel that was purchased. One of {@code diesel}, {@code unleaded_plus}, {@code
       * unleaded_regular}, {@code unleaded_super}, or {@code other}.
       */
      @SerializedName("type")
      Type type;

      /**
       * The units for {@code quantity_decimal}. One of {@code charging_minute}, {@code
       * imperial_gallon}, {@code kilogram}, {@code kilowatt_hour}, {@code liter}, {@code pound},
       * {@code us_gallon}, or {@code other}.
       */
      @SerializedName("unit")
      Unit unit;

      /**
       * The cost in cents per each unit of fuel, represented as a decimal string with at most 12
       * decimal places.
       */
      @SerializedName("unit_cost_decimal")
      BigDecimal unitCostDecimal;

      private Fuel(
          Map<String, Object> extraParams,
          String industryProductCode,
          BigDecimal quantityDecimal,
          Type type,
          Unit unit,
          BigDecimal unitCostDecimal) {
        this.extraParams = extraParams;
        this.industryProductCode = industryProductCode;
        this.quantityDecimal = quantityDecimal;
        this.type = type;
        this.unit = unit;
        this.unitCostDecimal = unitCostDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String industryProductCode;

        private BigDecimal quantityDecimal;

        private Type type;

        private Unit unit;

        private BigDecimal unitCostDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fuel build() {
          return new TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fuel(
              this.extraParams,
              this.industryProductCode,
              this.quantityDecimal,
              this.type,
              this.unit,
              this.unitCostDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fuel#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fuel#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <a href="https://www.conexxus.org/conexxus-payment-system-product-codes">Conexxus Payment
         * System Product Code</a> identifying the primary fuel product purchased.
         */
        public Builder setIndustryProductCode(String industryProductCode) {
          this.industryProductCode = industryProductCode;
          return this;
        }

        /**
         * The quantity of {@code unit}s of fuel that was dispensed, represented as a decimal string
         * with at most 12 decimal places.
         */
        public Builder setQuantityDecimal(BigDecimal quantityDecimal) {
          this.quantityDecimal = quantityDecimal;
          return this;
        }

        /**
         * The type of fuel that was purchased. One of {@code diesel}, {@code unleaded_plus}, {@code
         * unleaded_regular}, {@code unleaded_super}, or {@code other}.
         */
        public Builder setType(
            TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fuel.Type type) {
          this.type = type;
          return this;
        }

        /**
         * The units for {@code quantity_decimal}. One of {@code charging_minute}, {@code
         * imperial_gallon}, {@code kilogram}, {@code kilowatt_hour}, {@code liter}, {@code pound},
         * {@code us_gallon}, or {@code other}.
         */
        public Builder setUnit(
            TransactionCreateUnlinkedRefundParams.PurchaseDetails.Fuel.Unit unit) {
          this.unit = unit;
          return this;
        }

        /**
         * The cost in cents per each unit of fuel, represented as a decimal string with at most 12
         * decimal places.
         */
        public Builder setUnitCostDecimal(BigDecimal unitCostDecimal) {
          this.unitCostDecimal = unitCostDecimal;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("diesel")
        DIESEL("diesel"),

        @SerializedName("other")
        OTHER("other"),

        @SerializedName("unleaded_plus")
        UNLEADED_PLUS("unleaded_plus"),

        @SerializedName("unleaded_regular")
        UNLEADED_REGULAR("unleaded_regular"),

        @SerializedName("unleaded_super")
        UNLEADED_SUPER("unleaded_super");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }

      public enum Unit implements ApiRequestParams.EnumParam {
        @SerializedName("charging_minute")
        CHARGING_MINUTE("charging_minute"),

        @SerializedName("imperial_gallon")
        IMPERIAL_GALLON("imperial_gallon"),

        @SerializedName("kilogram")
        KILOGRAM("kilogram"),

        @SerializedName("kilowatt_hour")
        KILOWATT_HOUR("kilowatt_hour"),

        @SerializedName("liter")
        LITER("liter"),

        @SerializedName("other")
        OTHER("other"),

        @SerializedName("pound")
        POUND("pound"),

        @SerializedName("us_gallon")
        US_GALLON("us_gallon");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Unit(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Lodging {
      /** The time of checking into the lodging. */
      @SerializedName("check_in_at")
      Long checkInAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The number of nights stayed at the lodging. */
      @SerializedName("nights")
      Long nights;

      private Lodging(Long checkInAt, Map<String, Object> extraParams, Long nights) {
        this.checkInAt = checkInAt;
        this.extraParams = extraParams;
        this.nights = nights;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long checkInAt;

        private Map<String, Object> extraParams;

        private Long nights;

        /** Finalize and obtain parameter instance from this builder. */
        public TransactionCreateUnlinkedRefundParams.PurchaseDetails.Lodging build() {
          return new TransactionCreateUnlinkedRefundParams.PurchaseDetails.Lodging(
              this.checkInAt, this.extraParams, this.nights);
        }

        /** The time of checking into the lodging. */
        public Builder setCheckInAt(Long checkInAt) {
          this.checkInAt = checkInAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Lodging#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Lodging#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The number of nights stayed at the lodging. */
        public Builder setNights(Long nights) {
          this.nights = nights;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Receipt {
      @SerializedName("description")
      String description;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      @SerializedName("quantity")
      BigDecimal quantity;

      @SerializedName("total")
      Long total;

      @SerializedName("unit_cost")
      Long unitCost;

      private Receipt(
          String description,
          Map<String, Object> extraParams,
          BigDecimal quantity,
          Long total,
          Long unitCost) {
        this.description = description;
        this.extraParams = extraParams;
        this.quantity = quantity;
        this.total = total;
        this.unitCost = unitCost;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String description;

        private Map<String, Object> extraParams;

        private BigDecimal quantity;

        private Long total;

        private Long unitCost;

        /** Finalize and obtain parameter instance from this builder. */
        public TransactionCreateUnlinkedRefundParams.PurchaseDetails.Receipt build() {
          return new TransactionCreateUnlinkedRefundParams.PurchaseDetails.Receipt(
              this.description, this.extraParams, this.quantity, this.total, this.unitCost);
        }

        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Receipt#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * TransactionCreateUnlinkedRefundParams.PurchaseDetails.Receipt#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public Builder setQuantity(BigDecimal quantity) {
          this.quantity = quantity;
          return this;
        }

        public Builder setTotal(Long total) {
          this.total = total;
          return this;
        }

        public Builder setUnitCost(Long unitCost) {
          this.unitCost = unitCost;
          return this;
        }
      }
    }
  }
}
