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
import com.cobo.waas2.model.CoboSafeDelegate;
import com.cobo.waas2.model.ExchangeId;
import com.cobo.waas2.model.TransactionCustodialAssetWalletSource;
import com.cobo.waas2.model.TransactionDepositFromAddressSource;
import com.cobo.waas2.model.TransactionDepositFromLoopSource;
import com.cobo.waas2.model.TransactionDepositFromWalletSource;
import com.cobo.waas2.model.TransactionExchangeWalletSource;
import com.cobo.waas2.model.TransactionMPCWalletSource;
import com.cobo.waas2.model.TransactionSmartContractSafeWalletSource;
import com.cobo.waas2.model.TransactionSourceType;
import com.cobo.waas2.model.TransactionUtxo;
import com.cobo.waas2.model.WalletSubtype;
import com.cobo.waas2.model.WalletType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.cobo.waas2.JSON;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TransactionSource extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TransactionSource.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TransactionSource.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TransactionSource' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TransactionCustodialAssetWalletSource> adapterTransactionCustodialAssetWalletSource = gson.getDelegateAdapter(this, TypeToken.get(TransactionCustodialAssetWalletSource.class));
            final TypeAdapter<TransactionMPCWalletSource> adapterTransactionMPCWalletSource = gson.getDelegateAdapter(this, TypeToken.get(TransactionMPCWalletSource.class));
            final TypeAdapter<TransactionSmartContractSafeWalletSource> adapterTransactionSmartContractSafeWalletSource = gson.getDelegateAdapter(this, TypeToken.get(TransactionSmartContractSafeWalletSource.class));
            final TypeAdapter<TransactionExchangeWalletSource> adapterTransactionExchangeWalletSource = gson.getDelegateAdapter(this, TypeToken.get(TransactionExchangeWalletSource.class));
            final TypeAdapter<TransactionDepositFromAddressSource> adapterTransactionDepositFromAddressSource = gson.getDelegateAdapter(this, TypeToken.get(TransactionDepositFromAddressSource.class));
            final TypeAdapter<TransactionDepositFromWalletSource> adapterTransactionDepositFromWalletSource = gson.getDelegateAdapter(this, TypeToken.get(TransactionDepositFromWalletSource.class));
            final TypeAdapter<TransactionDepositFromLoopSource> adapterTransactionDepositFromLoopSource = gson.getDelegateAdapter(this, TypeToken.get(TransactionDepositFromLoopSource.class));

            return (TypeAdapter<T>) new TypeAdapter<TransactionSource>() {
                @Override
                public void write(JsonWriter out, TransactionSource value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `TransactionCustodialAssetWalletSource`
                    if (value.getActualInstance() instanceof TransactionCustodialAssetWalletSource) {
                        JsonElement element = adapterTransactionCustodialAssetWalletSource.toJsonTree((TransactionCustodialAssetWalletSource)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TransactionMPCWalletSource`
                    if (value.getActualInstance() instanceof TransactionMPCWalletSource) {
                        JsonElement element = adapterTransactionMPCWalletSource.toJsonTree((TransactionMPCWalletSource)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TransactionSmartContractSafeWalletSource`
                    if (value.getActualInstance() instanceof TransactionSmartContractSafeWalletSource) {
                        JsonElement element = adapterTransactionSmartContractSafeWalletSource.toJsonTree((TransactionSmartContractSafeWalletSource)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TransactionExchangeWalletSource`
                    if (value.getActualInstance() instanceof TransactionExchangeWalletSource) {
                        JsonElement element = adapterTransactionExchangeWalletSource.toJsonTree((TransactionExchangeWalletSource)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TransactionDepositFromAddressSource`
                    if (value.getActualInstance() instanceof TransactionDepositFromAddressSource) {
                        JsonElement element = adapterTransactionDepositFromAddressSource.toJsonTree((TransactionDepositFromAddressSource)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TransactionDepositFromWalletSource`
                    if (value.getActualInstance() instanceof TransactionDepositFromWalletSource) {
                        JsonElement element = adapterTransactionDepositFromWalletSource.toJsonTree((TransactionDepositFromWalletSource)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TransactionDepositFromLoopSource`
                    if (value.getActualInstance() instanceof TransactionDepositFromLoopSource) {
                        JsonElement element = adapterTransactionDepositFromLoopSource.toJsonTree((TransactionDepositFromLoopSource)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: TransactionCustodialAssetWalletSource, TransactionDepositFromAddressSource, TransactionDepositFromLoopSource, TransactionDepositFromWalletSource, TransactionExchangeWalletSource, TransactionMPCWalletSource, TransactionSmartContractSafeWalletSource");
                }

                @Override
                public TransactionSource read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    TransactionSource newTransactionSource = new TransactionSource();
                    if (jsonObject.get("source_type") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for TransactionSource as `source_type` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `source_type`
                        switch (jsonObject.get("source_type").getAsString()) {
                            case "Asset":
                                deserialized = adapterTransactionCustodialAssetWalletSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            case "DepositFromAddress":
                                deserialized = adapterTransactionDepositFromAddressSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            case "DepositFromLoop":
                                deserialized = adapterTransactionDepositFromLoopSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            case "DepositFromWallet":
                                deserialized = adapterTransactionDepositFromWalletSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            case "Main":
                                deserialized = adapterTransactionExchangeWalletSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            case "Org-Controlled":
                                deserialized = adapterTransactionMPCWalletSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            case "SafeWallet":
                                deserialized = adapterTransactionSmartContractSafeWalletSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            case "Sub":
                                deserialized = adapterTransactionExchangeWalletSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            case "User-Controlled":
                                deserialized = adapterTransactionMPCWalletSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            case "TransactionCustodialAssetWalletSource":
                                deserialized = adapterTransactionCustodialAssetWalletSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            case "TransactionDepositFromAddressSource":
                                deserialized = adapterTransactionDepositFromAddressSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            case "TransactionDepositFromLoopSource":
                                deserialized = adapterTransactionDepositFromLoopSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            case "TransactionDepositFromWalletSource":
                                deserialized = adapterTransactionDepositFromWalletSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            case "TransactionExchangeWalletSource":
                                deserialized = adapterTransactionExchangeWalletSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            case "TransactionMPCWalletSource":
                                deserialized = adapterTransactionMPCWalletSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            case "TransactionSmartContractSafeWalletSource":
                                deserialized = adapterTransactionSmartContractSafeWalletSource.fromJsonTree(jsonObject);
                                newTransactionSource.setActualInstance(deserialized);
                                return newTransactionSource;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for TransactionSource. Possible values: Asset DepositFromAddress DepositFromLoop DepositFromWallet Main Org-Controlled SafeWallet Sub User-Controlled TransactionCustodialAssetWalletSource TransactionDepositFromAddressSource TransactionDepositFromLoopSource TransactionDepositFromWalletSource TransactionExchangeWalletSource TransactionMPCWalletSource TransactionSmartContractSafeWalletSource", jsonObject.get("source_type").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize TransactionCustodialAssetWalletSource
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TransactionCustodialAssetWalletSource.validateJsonElement(jsonElement);
                        actualAdapter = adapterTransactionCustodialAssetWalletSource;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TransactionCustodialAssetWalletSource'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TransactionCustodialAssetWalletSource failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TransactionCustodialAssetWalletSource'", e);
                    }
                    // deserialize TransactionMPCWalletSource
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TransactionMPCWalletSource.validateJsonElement(jsonElement);
                        actualAdapter = adapterTransactionMPCWalletSource;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TransactionMPCWalletSource'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TransactionMPCWalletSource failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TransactionMPCWalletSource'", e);
                    }
                    // deserialize TransactionSmartContractSafeWalletSource
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TransactionSmartContractSafeWalletSource.validateJsonElement(jsonElement);
                        actualAdapter = adapterTransactionSmartContractSafeWalletSource;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TransactionSmartContractSafeWalletSource'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TransactionSmartContractSafeWalletSource failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TransactionSmartContractSafeWalletSource'", e);
                    }
                    // deserialize TransactionExchangeWalletSource
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TransactionExchangeWalletSource.validateJsonElement(jsonElement);
                        actualAdapter = adapterTransactionExchangeWalletSource;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TransactionExchangeWalletSource'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TransactionExchangeWalletSource failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TransactionExchangeWalletSource'", e);
                    }
                    // deserialize TransactionDepositFromAddressSource
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TransactionDepositFromAddressSource.validateJsonElement(jsonElement);
                        actualAdapter = adapterTransactionDepositFromAddressSource;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TransactionDepositFromAddressSource'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TransactionDepositFromAddressSource failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TransactionDepositFromAddressSource'", e);
                    }
                    // deserialize TransactionDepositFromWalletSource
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TransactionDepositFromWalletSource.validateJsonElement(jsonElement);
                        actualAdapter = adapterTransactionDepositFromWalletSource;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TransactionDepositFromWalletSource'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TransactionDepositFromWalletSource failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TransactionDepositFromWalletSource'", e);
                    }
                    // deserialize TransactionDepositFromLoopSource
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TransactionDepositFromLoopSource.validateJsonElement(jsonElement);
                        actualAdapter = adapterTransactionDepositFromLoopSource;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TransactionDepositFromLoopSource'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TransactionDepositFromLoopSource failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TransactionDepositFromLoopSource'", e);
                    }

                    if (match == 1) {
                        TransactionSource ret = new TransactionSource();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for TransactionSource: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public TransactionSource() {
        super("oneOf", Boolean.FALSE);
    }

    public TransactionSource(TransactionCustodialAssetWalletSource o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TransactionSource(TransactionDepositFromAddressSource o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TransactionSource(TransactionDepositFromLoopSource o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TransactionSource(TransactionDepositFromWalletSource o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TransactionSource(TransactionExchangeWalletSource o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TransactionSource(TransactionMPCWalletSource o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TransactionSource(TransactionSmartContractSafeWalletSource o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TransactionCustodialAssetWalletSource", TransactionCustodialAssetWalletSource.class);
        schemas.put("TransactionMPCWalletSource", TransactionMPCWalletSource.class);
        schemas.put("TransactionSmartContractSafeWalletSource", TransactionSmartContractSafeWalletSource.class);
        schemas.put("TransactionExchangeWalletSource", TransactionExchangeWalletSource.class);
        schemas.put("TransactionDepositFromAddressSource", TransactionDepositFromAddressSource.class);
        schemas.put("TransactionDepositFromWalletSource", TransactionDepositFromWalletSource.class);
        schemas.put("TransactionDepositFromLoopSource", TransactionDepositFromLoopSource.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return TransactionSource.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TransactionCustodialAssetWalletSource, TransactionDepositFromAddressSource, TransactionDepositFromLoopSource, TransactionDepositFromWalletSource, TransactionExchangeWalletSource, TransactionMPCWalletSource, TransactionSmartContractSafeWalletSource
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof TransactionCustodialAssetWalletSource) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TransactionMPCWalletSource) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TransactionSmartContractSafeWalletSource) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TransactionExchangeWalletSource) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TransactionDepositFromAddressSource) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TransactionDepositFromWalletSource) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TransactionDepositFromLoopSource) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TransactionCustodialAssetWalletSource, TransactionDepositFromAddressSource, TransactionDepositFromLoopSource, TransactionDepositFromWalletSource, TransactionExchangeWalletSource, TransactionMPCWalletSource, TransactionSmartContractSafeWalletSource");
    }

    /**
     * Get the actual instance, which can be the following:
     * TransactionCustodialAssetWalletSource, TransactionDepositFromAddressSource, TransactionDepositFromLoopSource, TransactionDepositFromWalletSource, TransactionExchangeWalletSource, TransactionMPCWalletSource, TransactionSmartContractSafeWalletSource
     *
     * @return The actual instance (TransactionCustodialAssetWalletSource, TransactionDepositFromAddressSource, TransactionDepositFromLoopSource, TransactionDepositFromWalletSource, TransactionExchangeWalletSource, TransactionMPCWalletSource, TransactionSmartContractSafeWalletSource)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TransactionCustodialAssetWalletSource`. If the actual instance is not `TransactionCustodialAssetWalletSource`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TransactionCustodialAssetWalletSource`
     * @throws ClassCastException if the instance is not `TransactionCustodialAssetWalletSource`
     */
    public TransactionCustodialAssetWalletSource getTransactionCustodialAssetWalletSource() throws ClassCastException {
        return (TransactionCustodialAssetWalletSource)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TransactionMPCWalletSource`. If the actual instance is not `TransactionMPCWalletSource`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TransactionMPCWalletSource`
     * @throws ClassCastException if the instance is not `TransactionMPCWalletSource`
     */
    public TransactionMPCWalletSource getTransactionMPCWalletSource() throws ClassCastException {
        return (TransactionMPCWalletSource)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TransactionSmartContractSafeWalletSource`. If the actual instance is not `TransactionSmartContractSafeWalletSource`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TransactionSmartContractSafeWalletSource`
     * @throws ClassCastException if the instance is not `TransactionSmartContractSafeWalletSource`
     */
    public TransactionSmartContractSafeWalletSource getTransactionSmartContractSafeWalletSource() throws ClassCastException {
        return (TransactionSmartContractSafeWalletSource)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TransactionExchangeWalletSource`. If the actual instance is not `TransactionExchangeWalletSource`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TransactionExchangeWalletSource`
     * @throws ClassCastException if the instance is not `TransactionExchangeWalletSource`
     */
    public TransactionExchangeWalletSource getTransactionExchangeWalletSource() throws ClassCastException {
        return (TransactionExchangeWalletSource)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TransactionDepositFromAddressSource`. If the actual instance is not `TransactionDepositFromAddressSource`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TransactionDepositFromAddressSource`
     * @throws ClassCastException if the instance is not `TransactionDepositFromAddressSource`
     */
    public TransactionDepositFromAddressSource getTransactionDepositFromAddressSource() throws ClassCastException {
        return (TransactionDepositFromAddressSource)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TransactionDepositFromWalletSource`. If the actual instance is not `TransactionDepositFromWalletSource`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TransactionDepositFromWalletSource`
     * @throws ClassCastException if the instance is not `TransactionDepositFromWalletSource`
     */
    public TransactionDepositFromWalletSource getTransactionDepositFromWalletSource() throws ClassCastException {
        return (TransactionDepositFromWalletSource)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TransactionDepositFromLoopSource`. If the actual instance is not `TransactionDepositFromLoopSource`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TransactionDepositFromLoopSource`
     * @throws ClassCastException if the instance is not `TransactionDepositFromLoopSource`
     */
    public TransactionDepositFromLoopSource getTransactionDepositFromLoopSource() throws ClassCastException {
        return (TransactionDepositFromLoopSource)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to TransactionSource
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with TransactionCustodialAssetWalletSource
        try {
            TransactionCustodialAssetWalletSource.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TransactionCustodialAssetWalletSource failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TransactionMPCWalletSource
        try {
            TransactionMPCWalletSource.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TransactionMPCWalletSource failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TransactionSmartContractSafeWalletSource
        try {
            TransactionSmartContractSafeWalletSource.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TransactionSmartContractSafeWalletSource failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TransactionExchangeWalletSource
        try {
            TransactionExchangeWalletSource.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TransactionExchangeWalletSource failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TransactionDepositFromAddressSource
        try {
            TransactionDepositFromAddressSource.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TransactionDepositFromAddressSource failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TransactionDepositFromWalletSource
        try {
            TransactionDepositFromWalletSource.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TransactionDepositFromWalletSource failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TransactionDepositFromLoopSource
        try {
            TransactionDepositFromLoopSource.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TransactionDepositFromLoopSource failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for TransactionSource with oneOf schemas: TransactionCustodialAssetWalletSource, TransactionDepositFromAddressSource, TransactionDepositFromLoopSource, TransactionDepositFromWalletSource, TransactionExchangeWalletSource, TransactionMPCWalletSource, TransactionSmartContractSafeWalletSource. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of TransactionSource given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of TransactionSource
     * @throws IOException if the JSON string is invalid with respect to TransactionSource
     */
    public static TransactionSource fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, TransactionSource.class);
    }

    /**
     * Convert an instance of TransactionSource to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
