/*
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 3 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ChronoSheetsClientLibModel;

import java.util.Objects;
import java.util.Arrays;
import ChronoSheetsClientLibModel.OrganisationPricingPlan;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * An organisation in ChronoSheets
 */
@ApiModel(description = "An organisation in ChronoSheets")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-25T22:43:31.260+11:00[Australia/Sydney]")
public class Organisation {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS_LINE01 = "AddressLine01";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE01)
  private String addressLine01;

  public static final String SERIALIZED_NAME_ADDRESS_LINE02 = "AddressLine02";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE02)
  private String addressLine02;

  public static final String SERIALIZED_NAME_SUBURB = "Suburb";
  @SerializedName(SERIALIZED_NAME_SUBURB)
  private String suburb;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_POSTCODE = "Postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_PHONE = "Phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "EmailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_TIMEZONE = "Timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_CUSTOMER_ID = "SubscriptionCustomerId";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_CUSTOMER_ID)
  private String subscriptionCustomerId;

  public static final String SERIALIZED_NAME_SIGNUP_TOKEN = "SignupToken";
  @SerializedName(SERIALIZED_NAME_SIGNUP_TOKEN)
  private String signupToken;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "IsActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_STRIPE_COUPON_CODE = "StripeCouponCode";
  @SerializedName(SERIALIZED_NAME_STRIPE_COUPON_CODE)
  private String stripeCouponCode;

  /**
   * The source of the subscription
   */
  @JsonAdapter(SubscriptionSourceEnum.Adapter.class)
  public enum SubscriptionSourceEnum {
    NONE("None"),
    
    STRIPE("Stripe"),
    
    APPLEINAPP("AppleInApp"),
    
    GOOGLEINAPP("GoogleInApp");

    private String value;

    SubscriptionSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubscriptionSourceEnum fromValue(String value) {
      for (SubscriptionSourceEnum b : SubscriptionSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubscriptionSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubscriptionSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubscriptionSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubscriptionSourceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBSCRIPTION_SOURCE = "SubscriptionSource";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_SOURCE)
  private SubscriptionSourceEnum subscriptionSource;

  /**
   * The source where the organisation signed up
   */
  @JsonAdapter(SignUpSourceEnum.Adapter.class)
  public enum SignUpSourceEnum {
    DESKTOP("Desktop"),
    
    MOBILEIOS("MobileiOS"),
    
    MOBILEANDROID("MobileAndroid");

    private String value;

    SignUpSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignUpSourceEnum fromValue(String value) {
      for (SignUpSourceEnum b : SignUpSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SignUpSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SignUpSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SignUpSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SignUpSourceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SIGN_UP_SOURCE = "SignUpSource";
  @SerializedName(SERIALIZED_NAME_SIGN_UP_SOURCE)
  private SignUpSourceEnum signUpSource;

  public static final String SERIALIZED_NAME_MOBILE_SIGN_UP_CODE = "MobileSignUpCode";
  @SerializedName(SERIALIZED_NAME_MOBILE_SIGN_UP_CODE)
  private String mobileSignUpCode;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_CYCLE_START = "SubscriptionCycleStart";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_CYCLE_START)
  private OffsetDateTime subscriptionCycleStart;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_CYCLE_END = "SubscriptionCycleEnd";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_CYCLE_END)
  private OffsetDateTime subscriptionCycleEnd;

  public static final String SERIALIZED_NAME_PRICING_PLANS = "PricingPlans";
  @SerializedName(SERIALIZED_NAME_PRICING_PLANS)
  private List<OrganisationPricingPlan> pricingPlans = null;


  public Organisation id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the organisation
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the organisation")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Organisation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the organisation
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the organisation")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Organisation addressLine01(String addressLine01) {
    
    this.addressLine01 = addressLine01;
    return this;
  }

   /**
   * Address line 1 of the organisation
   * @return addressLine01
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address line 1 of the organisation")

  public String getAddressLine01() {
    return addressLine01;
  }


  public void setAddressLine01(String addressLine01) {
    this.addressLine01 = addressLine01;
  }


  public Organisation addressLine02(String addressLine02) {
    
    this.addressLine02 = addressLine02;
    return this;
  }

   /**
   * Address line 2 of the organisation
   * @return addressLine02
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address line 2 of the organisation")

  public String getAddressLine02() {
    return addressLine02;
  }


  public void setAddressLine02(String addressLine02) {
    this.addressLine02 = addressLine02;
  }


  public Organisation suburb(String suburb) {
    
    this.suburb = suburb;
    return this;
  }

   /**
   * The suburb where the organisation is located
   * @return suburb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The suburb where the organisation is located")

  public String getSuburb() {
    return suburb;
  }


  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }


  public Organisation state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state where the organisation is located
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state where the organisation is located")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Organisation postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * The postcode of the organisation
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postcode of the organisation")

  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public Organisation country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country of the organisation
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country of the organisation")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public Organisation phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * The primary phone contact number of the organisation
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The primary phone contact number of the organisation")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public Organisation emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The primary email address of the organisation
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The primary email address of the organisation")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public Organisation timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * The timezone of the organisation
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timezone of the organisation")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public Organisation subscriptionCustomerId(String subscriptionCustomerId) {
    
    this.subscriptionCustomerId = subscriptionCustomerId;
    return this;
  }

   /**
   * The customer ID of the payments subscription
   * @return subscriptionCustomerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer ID of the payments subscription")

  public String getSubscriptionCustomerId() {
    return subscriptionCustomerId;
  }


  public void setSubscriptionCustomerId(String subscriptionCustomerId) {
    this.subscriptionCustomerId = subscriptionCustomerId;
  }


  public Organisation signupToken(String signupToken) {
    
    this.signupToken = signupToken;
    return this;
  }

   /**
   * The sign up token
   * @return signupToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sign up token")

  public String getSignupToken() {
    return signupToken;
  }


  public void setSignupToken(String signupToken) {
    this.signupToken = signupToken;
  }


  public Organisation isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Whether or not the organisation is active
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the organisation is active")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public Organisation stripeCouponCode(String stripeCouponCode) {
    
    this.stripeCouponCode = stripeCouponCode;
    return this;
  }

   /**
   * The payments coupon code
   * @return stripeCouponCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payments coupon code")

  public String getStripeCouponCode() {
    return stripeCouponCode;
  }


  public void setStripeCouponCode(String stripeCouponCode) {
    this.stripeCouponCode = stripeCouponCode;
  }


  public Organisation subscriptionSource(SubscriptionSourceEnum subscriptionSource) {
    
    this.subscriptionSource = subscriptionSource;
    return this;
  }

   /**
   * The source of the subscription
   * @return subscriptionSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source of the subscription")

  public SubscriptionSourceEnum getSubscriptionSource() {
    return subscriptionSource;
  }


  public void setSubscriptionSource(SubscriptionSourceEnum subscriptionSource) {
    this.subscriptionSource = subscriptionSource;
  }


  public Organisation signUpSource(SignUpSourceEnum signUpSource) {
    
    this.signUpSource = signUpSource;
    return this;
  }

   /**
   * The source where the organisation signed up
   * @return signUpSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source where the organisation signed up")

  public SignUpSourceEnum getSignUpSource() {
    return signUpSource;
  }


  public void setSignUpSource(SignUpSourceEnum signUpSource) {
    this.signUpSource = signUpSource;
  }


  public Organisation mobileSignUpCode(String mobileSignUpCode) {
    
    this.mobileSignUpCode = mobileSignUpCode;
    return this;
  }

   /**
   * A temporary mobile sign up code
   * @return mobileSignUpCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A temporary mobile sign up code")

  public String getMobileSignUpCode() {
    return mobileSignUpCode;
  }


  public void setMobileSignUpCode(String mobileSignUpCode) {
    this.mobileSignUpCode = mobileSignUpCode;
  }


  public Organisation subscriptionCycleStart(OffsetDateTime subscriptionCycleStart) {
    
    this.subscriptionCycleStart = subscriptionCycleStart;
    return this;
  }

   /**
   * The start date and time of the organisations subscription
   * @return subscriptionCycleStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start date and time of the organisations subscription")

  public OffsetDateTime getSubscriptionCycleStart() {
    return subscriptionCycleStart;
  }


  public void setSubscriptionCycleStart(OffsetDateTime subscriptionCycleStart) {
    this.subscriptionCycleStart = subscriptionCycleStart;
  }


  public Organisation subscriptionCycleEnd(OffsetDateTime subscriptionCycleEnd) {
    
    this.subscriptionCycleEnd = subscriptionCycleEnd;
    return this;
  }

   /**
   * The end date and time of the organisations subscription
   * @return subscriptionCycleEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date and time of the organisations subscription")

  public OffsetDateTime getSubscriptionCycleEnd() {
    return subscriptionCycleEnd;
  }


  public void setSubscriptionCycleEnd(OffsetDateTime subscriptionCycleEnd) {
    this.subscriptionCycleEnd = subscriptionCycleEnd;
  }


  public Organisation pricingPlans(List<OrganisationPricingPlan> pricingPlans) {
    
    this.pricingPlans = pricingPlans;
    return this;
  }

  public Organisation addPricingPlansItem(OrganisationPricingPlan pricingPlansItem) {
    if (this.pricingPlans == null) {
      this.pricingPlans = new ArrayList<OrganisationPricingPlan>();
    }
    this.pricingPlans.add(pricingPlansItem);
    return this;
  }

   /**
   * The organisation&#39;s pricing plans
   * @return pricingPlans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organisation's pricing plans")

  public List<OrganisationPricingPlan> getPricingPlans() {
    return pricingPlans;
  }


  public void setPricingPlans(List<OrganisationPricingPlan> pricingPlans) {
    this.pricingPlans = pricingPlans;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organisation organisation = (Organisation) o;
    return Objects.equals(this.id, organisation.id) &&
        Objects.equals(this.name, organisation.name) &&
        Objects.equals(this.addressLine01, organisation.addressLine01) &&
        Objects.equals(this.addressLine02, organisation.addressLine02) &&
        Objects.equals(this.suburb, organisation.suburb) &&
        Objects.equals(this.state, organisation.state) &&
        Objects.equals(this.postcode, organisation.postcode) &&
        Objects.equals(this.country, organisation.country) &&
        Objects.equals(this.phone, organisation.phone) &&
        Objects.equals(this.emailAddress, organisation.emailAddress) &&
        Objects.equals(this.timezone, organisation.timezone) &&
        Objects.equals(this.subscriptionCustomerId, organisation.subscriptionCustomerId) &&
        Objects.equals(this.signupToken, organisation.signupToken) &&
        Objects.equals(this.isActive, organisation.isActive) &&
        Objects.equals(this.stripeCouponCode, organisation.stripeCouponCode) &&
        Objects.equals(this.subscriptionSource, organisation.subscriptionSource) &&
        Objects.equals(this.signUpSource, organisation.signUpSource) &&
        Objects.equals(this.mobileSignUpCode, organisation.mobileSignUpCode) &&
        Objects.equals(this.subscriptionCycleStart, organisation.subscriptionCycleStart) &&
        Objects.equals(this.subscriptionCycleEnd, organisation.subscriptionCycleEnd) &&
        Objects.equals(this.pricingPlans, organisation.pricingPlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, addressLine01, addressLine02, suburb, state, postcode, country, phone, emailAddress, timezone, subscriptionCustomerId, signupToken, isActive, stripeCouponCode, subscriptionSource, signUpSource, mobileSignUpCode, subscriptionCycleStart, subscriptionCycleEnd, pricingPlans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organisation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addressLine01: ").append(toIndentedString(addressLine01)).append("\n");
    sb.append("    addressLine02: ").append(toIndentedString(addressLine02)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    subscriptionCustomerId: ").append(toIndentedString(subscriptionCustomerId)).append("\n");
    sb.append("    signupToken: ").append(toIndentedString(signupToken)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    stripeCouponCode: ").append(toIndentedString(stripeCouponCode)).append("\n");
    sb.append("    subscriptionSource: ").append(toIndentedString(subscriptionSource)).append("\n");
    sb.append("    signUpSource: ").append(toIndentedString(signUpSource)).append("\n");
    sb.append("    mobileSignUpCode: ").append(toIndentedString(mobileSignUpCode)).append("\n");
    sb.append("    subscriptionCycleStart: ").append(toIndentedString(subscriptionCycleStart)).append("\n");
    sb.append("    subscriptionCycleEnd: ").append(toIndentedString(subscriptionCycleEnd)).append("\n");
    sb.append("    pricingPlans: ").append(toIndentedString(pricingPlans)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

