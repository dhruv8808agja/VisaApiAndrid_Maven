/*
 * *© Copyright 2018 - 2020 Visa. All Rights Reserved.**
 *
 * NOTICE: The software and accompanying information and documentation (together, the “Software”) remain the property of and are proprietary to Visa and its suppliers and affiliates. The Software remains protected by intellectual property rights and may be covered by U.S. and foreign patents or patent applications. The Software is licensed and not sold.*
 *
 *  By accessing the Software you are agreeing to Visa's terms of use (developer.visa.com/terms) and privacy policy (developer.visa.com/privacy).In addition, all permissible uses of the Software must be in support of Visa products, programs and services provided through the Visa Developer Program (VDP) platform only (developer.visa.com). **THE SOFTWARE AND ANY ASSOCIATED INFORMATION OR DOCUMENTATION IS PROVIDED ON AN “AS IS,” “AS AVAILABLE,” “WITH ALL FAULTS” BASIS WITHOUT WARRANTY OR  CONDITION OF ANY KIND. YOUR USE IS AT YOUR OWN RISK.** All brand names are the property of their respective owners, used for identification purposes only, and do not imply product endorsement or affiliation with Visa. Any links to third party sites are for your information only and equally  do not constitute a Visa endorsement. Visa has no insight into and control over third party content and code and disclaims all liability for any such components, including continued availability and functionality. Benefits depend on implementation details and business factors and coding steps shown are exemplary only and do not reflect all necessary elements for the described capabilities. Capabilities and features are subject to Visa’s terms and conditions and may require development,implementation and resources by you based on your business and operational details. Please refer to the specific API documentation for details on the requirements, eligibility and geographic availability.*
 *
 * This Software includes programs, concepts and details under continuing development by Visa. Any Visa features,functionality, implementation, branding, and schedules may be amended, updated or canceled at Visa’s discretion.The timing of widespread availability of programs and functionality is also subject to a number of factors outside Visa’s control,including but not limited to deployment of necessary infrastructure by issuers, acquirers, merchants and mobile device manufacturers.*
 *
 */
/*
 * Funds Transfer API
 * The Funds Transfer API can pull funds from the sender&apos;s Visa account (in preparation for pushing funds to a recipient&apos;s account) in an Account Funding Transaction (AFT).  Additionally, the Funds Transfer API also provides functionality to push funds to the recipient&apos;s Visa account in an Original Credit Transaction (OCT).  If a transaction is declined, the Funds Transfer API can also return the funds to the sender&apos;s funding source in an Account Funding Transaction Reversal (AFTR). The API has been enhanced to allow originators to send their PushFundsTransactions(OCTs) and PullFundsTransactions(AFTs) to Visa for routing to multiple U.S. debit networks.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.visa.developer.sample.funds_transfer_api.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.visa.developer.sample.funds_transfer_api.ApiClient;
import com.visa.developer.sample.funds_transfer_api.Config;
import com.visa.developer.sample.funds_transfer_api.model.*;
import org.awaitility.Durations;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.util.StringUtils;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.temporal.ChronoUnit;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.UUID;

import static org.awaitility.Awaitility.await;


/**
 * API tests for FundsTransferApi
 */
public class FundsTransferApiTest {

    public static final String X_CLIENT_TRANSACTION_ID = "xClientTransactionId_example";
    private final FundsTransferApi api;

    public FundsTransferApiTest() {
        ApiClient apiClient = new ApiClient();
        Config config = new Config();
        apiClient.setUsername(config.getProperty("userName"));
        apiClient.setPassword(config.getProperty("password"));
        apiClient.setKeystorePath(config.getResourceFilePath(config.getProperty("keyStorePath")));
        apiClient.setKeystorePassword(config.getProperty("keyStorePassword"));
        apiClient.setPrivateKeyPassword(config.getProperty("keyStorePassword"));
        // If behind a proxy set proxy host and port numbers here
        String proxyHostName = config.getProperty("proxyHostName");
        if(!proxyHostName.isEmpty()){
            apiClient.setProxyHostName(proxyHostName);
            apiClient.setProxyPortNumber(Integer.parseInt(config.getProperty("proxyPortNumber")));
        }

        // Configure HTTP basic authorization: basicAuth

        // To set proxy uncomment the below lines
        // apiClient.setProxyHostName("proxy.address@example.com");
        // apiClient.setProxyPortNumber(0000);

        // To log requests and response set Debug to true

        apiClient.setDebugging(true);
        apiClient.buildRestTemplate();


        api = new FundsTransferApi(apiClient);
    }


    /**
     * Read Multi Pull Funds Transaction
     *
     * @throwsApiException if the Api call fails
     */
    @Test
    @Ignore
    public void getmultipullfundstransactionsTest() throws IOException {

        String statusIdentifier = executeMultiPullFundsTransfer(true);
        await().pollDelay(Durations.ONE_SECOND).atMost(Durations.TWO_MINUTES).until(() -> {
            MultipullfundstransactionsgetResponse response = api.getmultipullfundstransactions(statusIdentifier);
            return response != null;
        });
    }

    /**
     * Read Multi Push Funds Transaction
     *
     * @throwsApiException if the Api call fails
     */
    @Test
    @Ignore
    public void getmultipushfundstransactionsTest() throws IOException {
        String statusIdentifier = executeMultiPushFundsTransaction();
        await().pollDelay(Durations.TEN_SECONDS).atMost(Durations.FIVE_MINUTES).until(() -> {
            MultipushfundstransactionsgetResponse response = api.getmultipushfundstransactions(statusIdentifier);
            return response != null;
        });

    }

    /**
     * Read Multi Reverse Funds Transaction
     *
     * @throwsApiException if the Api call fails
     */
    @Test
    @Ignore
    public void getmultireversefundstransactionsTest() throws IOException {


        String statusIdentifier = executeMultiReverseTransaction();
        await().pollDelay(Durations.TEN_SECONDS).atMost(Durations.FIVE_MINUTES).until(() -> {
            MultireversefundstransactionsgetResponse response = api.getmultireversefundstransactions(statusIdentifier);
            return response != null;
        });


    }

    /**
     * Read Pull Funds Transaction
     *
     * @throwsApiException if the Api call fails
     */
    @Test
    @Ignore
    public void getpullfundstransactionsTest() throws IOException {
        String jsonPayload = transformPayload("{\"localTransactionDateTime\": \"2016-11-16T23:33:06\", \"businessApplicationId\": \"AA\", \"cpsAuthorizationCharacteristicsIndicator\": \"Y\", \"senderCardExpiryDate\": \"2015-10\", \"amount\": \"124.02\", \"acquirerCountryCode\": \"840\", \"retrievalReferenceNumber\": \"330000550000\", \"cardAcceptor\": {\"idCode\": \"ABCD1234ABCD123\", \"address\": {\"county\": \"081\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94404\"}, \"terminalId\": \"ABCD1234\", \"name\": \"Visa Inc. USA-Foster City\"}, \"acquiringBin\": \"408999\", \"systemsTraceAuditNumber\": \"451001\", \"nationalReimbursementFee\": \"11.22\", \"senderCurrencyCode\": \"USD\", \"cavv\": \"0700100038238906000013405823891061668252\", \"foreignExchangeFeeTransaction\": \"11.99\", \"addressVerificationData\": {\"postalCode\": \"12345\", \"street\": \"XYZ St\"}, \"senderPrimaryAccountNumber\": \"4895142232120006\", \"surcharge\": \"11.99\"}");
        ObjectMapper mapper = new ObjectMapper();
        PullfundspostPayload body = mapper.readValue(jsonPayload, PullfundspostPayload.class);

        String statusIdentifier = api.postpullfunds(body, new ParameterizedTypeReference<String>() {
        }, String.class, true);

        PullfundstransactionsgetResponse response = api.getpullfundstransactions(statusIdentifier);
    }

    /**
     * Read Push Funds Transaction
     *
     * @throwsApiException if the Api call fails
     */
    @Test
    @Ignore
    public void getpushfundstransactionsTest() throws IOException {
        String jsonPayload = transformPayload("{\"businessApplicationId\": \"AA\", \"transactionIdentifier\": \"381228649430015\", \"cardAcceptor\": {\"idCode\": \"CA-IDCode-77765\", \"address\": {\"county\": \"San Mateo\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94404\"}, \"terminalId\": \"TID-9999\", \"name\": \"Visa Inc. USA-Foster City\"}, \"senderAddress\": \"901 Metro Center Blvd\", \"sourceOfFundsCode\": \"05\", \"recipientName\": \"rohan\", \"senderName\": \"Mohammed Qasim\", \"senderStateCode\": \"CA\", \"merchantCategoryCode\": \"6012\", \"acquirerCountryCode\": \"840\", \"senderReference\": \"\", \"recipientPrimaryAccountNumber\": \"4957030420210496\", \"retrievalReferenceNumber\": \"412770451018\", \"senderAccountNumber\": \"4653459515756154\", \"transactionCurrencyCode\": \"USD\", \"acquiringBin\": \"408999\", \"pointOfServiceData\": {\"posConditionCode\": \"00\", \"panEntryMode\": \"90\", \"motoECIIndicator\": \"0\"}, \"senderCity\": \"Foster City\", \"localTransactionDateTime\": \"2016-11-17T00:39:13\", \"amount\": \"124.05\", \"systemsTraceAuditNumber\": \"451018\", \"senderCountryCode\": \"124\"}");
        ObjectMapper mapper = new ObjectMapper();
        PushfundspostPayload body = mapper.readValue(jsonPayload, PushfundspostPayload.class);

        String statusIdentifier = api.postpushfunds(body, new ParameterizedTypeReference<String>() {
        }, String.class, true);

        PushfundstransactionsgetResponse response = api.getpushfundstransactions(statusIdentifier);
    }

    /**
     * Read Reverse Funds Transaction
     *
     * @throwsApiException if the Api call fails
     */
    @Test
    @Ignore
    public void getreversefundstransactionsTest() throws IOException {
        String jsonPayload = transformPayload("{\"localTransactionDateTime\": \"2016-11-17T19:04:06\", \"businessApplicationId\": \"AA\", \"senderCardExpiryDate\": \"2015-10\", \"transactionIdentifier\": \"381228649430011\", \"acquirerCountryCode\": \"608\", \"retrievalReferenceNumber\": \"330000550000\", \"cardAcceptor\": {\"idCode\": \"VMT200911026070\", \"address\": {\"county\": \"San Mateo\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94404\"}, \"terminalId\": \"365539\", \"name\": \"Visa Inc. USA-Foster City\"}, \"originalDataElements\": {\"acquiringBin\": \"408999\", \"systemsTraceAuditNumber\": \"897825\", \"approvalCode\": \"20304B\", \"transmissionDateTime\": \"2016-11-17T19:04:06\"}, \"acquiringBin\": \"408999\", \"systemsTraceAuditNumber\": \"451050\", \"senderCurrencyCode\": \"USD\", \"pointOfServiceCapability\": {\"posTerminalType\": \"4\", \"posTerminalEntryCapability\": \"2\"}, \"amount\": \"24.01\", \"pointOfServiceData\": {\"posConditionCode\": \"00\", \"panEntryMode\": \"90\", \"motoECIIndicator\": \"0\"}, \"senderPrimaryAccountNumber\": \"4895100000055127\"}");
        ObjectMapper mapper = new ObjectMapper();
        ReversefundspostPayload body = mapper.readValue(jsonPayload, ReversefundspostPayload.class);

        String statusIdentifier = api.postreversefunds(body, new ParameterizedTypeReference<String>() {
        }, String.class, true);


        ReversefundstransactionsgetResponse response = api.getreversefundstransactions(statusIdentifier);
    }

    /**
     * Create Multi Pull Funds Transaction
     *
     * @throwsApiException if the Api call fails
     */
    @Test
    public void postmultipullfundsTest() throws IOException {
        executeMultiPullFundsTransfer(false);
    }

    private String executeMultiPullFundsTransfer(boolean simulateTimeout) throws IOException {
        String jsonPayload = transformPayload("{\"localTransactionDateTime\": \"2016-11-17T00:24:00\", \"businessApplicationId\": \"AA\", \"merchantCategoryCode\": \"6012\", \"acquirerCountryCode\": \"608\", \"request\": [{\"localTransactionDateTime\": \"2016-11-17T00:24:00\", \"senderCardExpiryDate\": \"2020-12\", \"amount\": \"100.00\", \"retrievalReferenceNumber\": \"401010101011\", \"cardAcceptor\": {\"idCode\": \"5678\", \"address\": {\"county\": \"00\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94454\"}, \"terminalId\": \"1234\", \"name\": \"Mr Smith\"}, \"systemsTraceAuditNumber\": \"101011\", \"senderCurrencyCode\": \"USD\", \"cavv\": \"0700020718799100000002980179911000000000\", \"senderPrimaryAccountNumber\": \"4895140000066666\"}, {\"localTransactionDateTime\": \"2016-11-17T00:24:00\", \"senderCardExpiryDate\": \"2020-12\", \"amount\": \"100.00\", \"retrievalReferenceNumber\": \"401010101011\", \"cardAcceptor\": {\"idCode\": \"5678\", \"address\": {\"county\": \"00\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94454\"}, \"terminalId\": \"1234\", \"name\": \"Mr Smith\"}, \"systemsTraceAuditNumber\": \"101011\", \"senderCurrencyCode\": \"USD\", \"cavv\": \"0700020718799100000002980179911000000000\", \"senderPrimaryAccountNumber\": \"4895140000066666\"}], \"acquiringBin\": \"408999\"}");
        ObjectMapper mapper = new ObjectMapper();
        MultipullfundspostPayload body = mapper.readValue(jsonPayload, MultipullfundspostPayload.class);


        String xClientTransactionId = Arrays.asList(X_CLIENT_TRANSACTION_ID).get(0);


        return api.postmultipullfunds(body, xClientTransactionId, simulateTimeout);
    }

    /**
     * Create Multi Push Funds Transaction
     *
     * @throwsApiException if the Api call fails
     */
    @Test
    public void postmultipushfundsTest() throws IOException {
        executeMultiPushFundsTransaction();
    }

    private String executeMultiPushFundsTransaction() throws IOException {
        String jsonPayload = transformPayload("{\"localTransactionDateTime\": \"2016-11-17T18:24:24\", \"businessApplicationId\": \"AA\", \"merchantCategoryCode\": \"6012\", \"acquirerCountryCode\": \"840\", \"request\": [{\"senderCity\": \"My City\", \"senderAccountNumber\": \"4005520000011126\", \"senderStateCode\": \"CA\", \"feeProgramIndicator\": \"123\", \"localTransactionDateTime\": \"2016-11-17T18:24:24\", \"recipientPrimaryAccountNumber\": \"4957030420210454\", \"transactionCurrencyCode\": \"USD\", \"transactionIdentifier\": \"234234234234234\", \"sourceOfFundsCode\": \"01\", \"senderReference\": \"\", \"senderAddress\": \"My Address\", \"retrievalReferenceNumber\": \"401010101011\", \"systemsTraceAuditNumber\": \"101011\", \"senderCountryCode\": \"USA\", \"cardAcceptor\": {\"idCode\": \"5678\", \"address\": {\"county\": \"00\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94454\"}, \"terminalId\": \"1234\", \"name\": \"Mr Smith\"}, \"recipientName\": \"Akhila\", \"amount\": \"100.00\", \"senderName\": \"Mr Name\"}, {\"senderCity\": \"My City\", \"senderAccountNumber\": \"4840920103511221\", \"senderStateCode\": \"CA\", \"feeProgramIndicator\": \"123\", \"localTransactionDateTime\": \"2016-11-17T18:24:24\", \"recipientPrimaryAccountNumber\": \"4957030420210454\", \"transactionCurrencyCode\": \"USD\", \"transactionIdentifier\": \"234234234234234\", \"sourceOfFundsCode\": \"01\", \"senderReference\": \"\", \"senderAddress\": \"My Address\", \"retrievalReferenceNumber\": \"401010101012\", \"systemsTraceAuditNumber\": \"101012\", \"senderCountryCode\": \"USA\", \"cardAcceptor\": {\"idCode\": \"5678\", \"address\": {\"county\": \"00\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94454\"}, \"terminalId\": \"1234\", \"name\": \"Mr Smith\"}, \"recipientName\": \"Akhila\", \"amount\": \"100.00\", \"senderName\": \"Mr Name\"}], \"acquiringBin\": \"408999\"}");
        ObjectMapper mapper = new ObjectMapper();
        MultipushfundspostPayload body = mapper.readValue(jsonPayload, MultipushfundspostPayload.class);


        String xClientTransactionId = Arrays.asList("xClientTransactionId_example").get(0);


        return api.postmultipushfunds(body, xClientTransactionId);
    }

    /**
     * Create Multi Reverse Funds Transaction
     *
     * @throwsApiException if the Api call fails
     */
    @Test
    public void postmultireversefundsTest() throws IOException {

        executeMultiReverseTransaction();
    }

    private String executeMultiReverseTransaction() throws IOException {
        String multiAftrV2V2RequestPayload = "{\"acquirerCountryCode\": \"840\",   \"acquiringBin\": \"830\",   \"localTransactionDateTime\": \"2017-09-11T05:15:35\",   \"request\": [     { \"amount\": \"199.99\", \"cardAcceptor\": {   \"address\": {     \"country\": \"USA\",     \"county\": \"San Mateo\",     \"state\": \"CA\",     \"zipCode\": \"94404\"   },   \"idCode\": \"1014\",   \"name\": \"Acceptor 1\",   \"terminalId\": \"12332\" }, \"localTransactionDateTime\": \"2017-09-11T05:15:35\", \"originalDataElements\": {   \"acquiringBin\": \"408999\",   \"approvalCode\": \"1ABCDE\",   \"systemsTraceAuditNumber\": \"228113\",   \"transmissionDateTime\": \"2017-09-11T05:15:35\" }, \"retrievalReferenceNumber\": \"201010335725\", \"senderCardExpiryDate\": \"2020-12\", \"senderCurrencyCode\": \"USD\", \"senderPrimaryAccountNumber\": \"4898100000000245\", \"systemsTraceAuditNumber\": \"335724\", \"transactionIdentifier\": \"101010101010\", \"pointOfServiceData\": {   \"panEntryMode\": \"01\",   \"posConditionCode\": \"59\",   \"motoECIIndicator\": \"5\" }     },     { \"amount\": \"199.99\", \"cardAcceptor\": {   \"address\": {     \"country\": \"USA\",     \"county\": \"San Mateo\",     \"state\": \"CA\",     \"zipCode\": \"94404\"   },   \"idCode\": \"1014\",   \"name\": \"Acceptor 1\",   \"terminalId\": \"12332\" }, \"localTransactionDateTime\": \"2017-09-11T05:15:35\", \"originalDataElements\": {   \"acquiringBin\": \"408999\",   \"approvalCode\": \"1ABCDE\",   \"systemsTraceAuditNumber\": \"228122\",   \"transmissionDateTime\": \"2017-09-11T05:15:35\" }, \"retrievalReferenceNumber\": \"401010335723\", \"senderCardExpiryDate\": \"2020-12\", \"senderCurrencyCode\": \"USD\", \"senderPrimaryAccountNumber\": \"4898100000000245\", \"systemsTraceAuditNumber\": \"335823\", \"transactionIdentifier\": \"101010101210\", \"pointOfServiceData\": {   \"panEntryMode\": \"01\",   \"posConditionCode\": \"59\",   \"motoECIIndicator\": \"5\" }     }   ] }";

        String jsonPayload = transformPayload(multiAftrV2V2RequestPayload);

        MultireversefundspostPayload bodyForReverseFunds = new ObjectMapper().readValue(jsonPayload, MultireversefundspostPayload.class);
        return api.postmultireversefunds(bodyForReverseFunds, X_CLIENT_TRANSACTION_ID);
    }

    /**
     * Create Pull Funds Transaction
     *
     * @throwsApiException if the Api call fails
     */
    @Test
    public void postpullfundsTest() throws IOException {

        String jsonPayload = transformPayload("{\"localTransactionDateTime\": \"2016-11-16T23:33:06\", \"businessApplicationId\": \"AA\", \"cpsAuthorizationCharacteristicsIndicator\": \"Y\", \"senderCardExpiryDate\": \"2015-10\", \"amount\": \"124.02\", \"acquirerCountryCode\": \"840\", \"retrievalReferenceNumber\": \"330000550000\", \"cardAcceptor\": {\"idCode\": \"ABCD1234ABCD123\", \"address\": {\"county\": \"081\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94404\"}, \"terminalId\": \"ABCD1234\", \"name\": \"Visa Inc. USA-Foster City\"}, \"acquiringBin\": \"408999\", \"systemsTraceAuditNumber\": \"451001\", \"nationalReimbursementFee\": \"11.22\", \"senderCurrencyCode\": \"USD\", \"cavv\": \"0700100038238906000013405823891061668252\", \"foreignExchangeFeeTransaction\": \"11.99\", \"addressVerificationData\": {\"postalCode\": \"12345\", \"street\": \"XYZ St\"}, \"senderPrimaryAccountNumber\": \"4895142232120006\", \"surcharge\": \"11.99\"}");
        ObjectMapper mapper = new ObjectMapper();
        PullfundspostPayload body = mapper.readValue(jsonPayload, PullfundspostPayload.class);

        PullfundspostResponse response = api.postpullfunds(body, new ParameterizedTypeReference<PullfundspostResponse>() {
        }, PullfundspostResponse.class, false);
    }

    /**
     * Create Push Funds Transaction
     *
     * @throwsApiException if the Api call fails
     */
    @Test
    public void postpushfundsTest() throws IOException {
        String jsonPayload = transformPayload("{\"businessApplicationId\": \"AA\", \"transactionIdentifier\": \"381228649430015\", \"cardAcceptor\": {\"idCode\": \"CA-IDCode-77765\", \"address\": {\"county\": \"San Mateo\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94404\"}, \"terminalId\": \"TID-9999\", \"name\": \"Visa Inc. USA-Foster City\"}, \"senderAddress\": \"901 Metro Center Blvd\", \"sourceOfFundsCode\": \"05\", \"recipientName\": \"rohan\", \"senderName\": \"Mohammed Qasim\", \"senderStateCode\": \"CA\", \"merchantCategoryCode\": \"6012\", \"acquirerCountryCode\": \"840\", \"senderReference\": \"\", \"recipientPrimaryAccountNumber\": \"4957030420210496\", \"retrievalReferenceNumber\": \"412770451018\", \"senderAccountNumber\": \"4653459515756154\", \"transactionCurrencyCode\": \"USD\", \"acquiringBin\": \"408999\", \"pointOfServiceData\": {\"posConditionCode\": \"00\", \"panEntryMode\": \"90\", \"motoECIIndicator\": \"0\"}, \"senderCity\": \"Foster City\", \"localTransactionDateTime\": \"2016-11-17T00:39:13\", \"amount\": \"124.05\", \"systemsTraceAuditNumber\": \"451018\", \"senderCountryCode\": \"124\"}");
        ObjectMapper mapper = new ObjectMapper();
        PushfundspostPayload body = mapper.readValue(jsonPayload, PushfundspostPayload.class);

        PushfundspostResponse response = api.postpushfunds(body, new ParameterizedTypeReference<PushfundspostResponse>() {
        }, PushfundspostResponse.class, false);

    }

    /**
     * Create Reverse Funds Transaction
     *
     * @throwsApiException if the Api call fails
     */
    @Test
    public void postreversefundsTest() throws IOException {

        String jsonPayload = transformPayload("{\"localTransactionDateTime\": \"2016-11-17T19:04:06\", \"businessApplicationId\": \"AA\", \"senderCardExpiryDate\": \"2015-10\", \"transactionIdentifier\": \"381228649430011\", \"acquirerCountryCode\": \"608\", \"retrievalReferenceNumber\": \"330000550000\", \"cardAcceptor\": {\"idCode\": \"VMT200911026070\", \"address\": {\"county\": \"San Mateo\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94404\"}, \"terminalId\": \"365539\", \"name\": \"Visa Inc. USA-Foster City\"}, \"originalDataElements\": {\"acquiringBin\": \"408999\", \"systemsTraceAuditNumber\": \"897825\", \"approvalCode\": \"20304B\", \"transmissionDateTime\": \"2016-11-17T19:04:06\"}, \"acquiringBin\": \"408999\", \"systemsTraceAuditNumber\": \"451050\", \"senderCurrencyCode\": \"USD\", \"pointOfServiceCapability\": {\"posTerminalType\": \"4\", \"posTerminalEntryCapability\": \"2\"}, \"amount\": \"24.01\", \"pointOfServiceData\": {\"posConditionCode\": \"00\", \"panEntryMode\": \"90\", \"motoECIIndicator\": \"0\"}, \"senderPrimaryAccountNumber\": \"4895100000055127\"}");
        ObjectMapper mapper = new ObjectMapper();
        ReversefundspostPayload body = mapper.readValue(jsonPayload, ReversefundspostPayload.class);

        ReversefundspostResponse response = api.postreversefunds(body, new ParameterizedTypeReference<ReversefundspostResponse>() {
        }, ReversefundspostResponse.class, false);
    }


    public String transformPayload(String payload) {
        payload = editLocalTime(payload);
        payload = addRandomValue(payload);
        return payload;
    }

    public String editLocalTime(String payload) {
        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        LocalDateTime localDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
        ZonedDateTime laDateTime = ZonedDateTime.of(localDateTime, zoneId);
        payload = payload.replaceAll("\"localTransactionDateTime\":\\s+\".{19}\"",
                "\"localTransactionDateTime\": \"" + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(laDateTime) + "\"");
        payload = payload.replaceAll("\"dateTimeLocal\":\\s+\".{10}\"",
                "\"dateTimeLocal\": \"" + DateTimeFormatter.ofPattern("MMddHHmmss").format(laDateTime) + "\"");
        return payload;
    }

    public String addRandomValue(String payload) {
        String randomAlphaNumericValue = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8);
        SecureRandom rand = new SecureRandom();
        Integer randomNumber = rand.nextInt(90000) + 10000;
        payload = payload.replaceAll("random_string", randomAlphaNumericValue);
        payload = payload.replaceAll("random_integer", randomNumber.toString());
        payload = payload.replaceAll("random", randomAlphaNumericValue);
        return payload;
    }
}
