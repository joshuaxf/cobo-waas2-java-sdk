/*
 * Cobo Wallet as a Service 2.0
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The event status. Possible values include: - &#x60;Success&#x60;: The event has been delivered, and the webhook endpoint has responded to the event. - &#x60;Retrying&#x60;: The event has been delivered, but the webhook endpoint has not responded. In this case, Cobo will retry delivering the event. - &#x60;Failed&#x60;: The event cannot be delivered and Cobo will stop retrying. This may occur if the number of retries reaches 10, or if the event has been delivered but the webhook endpoint responded with an error.
 */
@JsonAdapter(WebhookEventStatus.Adapter.class)
public enum WebhookEventStatus {
  UNKNOWN(null),
  
  SUCCESS("Success"),
  
  RETRYING("Retrying"),
  
  FAILED("Failed");

  private String value;

  WebhookEventStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WebhookEventStatus fromValue(String value) {
    for (WebhookEventStatus b : WebhookEventStatus.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WebhookEventStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final WebhookEventStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WebhookEventStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WebhookEventStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    WebhookEventStatus.fromValue(value);
  }
}
