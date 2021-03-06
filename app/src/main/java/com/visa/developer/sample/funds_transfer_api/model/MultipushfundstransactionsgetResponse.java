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


package com.visa.developer.sample.funds_transfer_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Multi Push Funds Transfer Response
 */
@ApiModel(description = "Multi Push Funds Transfer Response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2019-03-27T10:55:08.119+05:30[Asia/Kolkata]")
public class MultipushfundstransactionsgetResponse {


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("approvalCode")
    private String approvalCode = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("feeProgramIndicator")
    private String feeProgramIndicator = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("prepaidBalance")
    private String prepaidBalance = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("prepaidBalanceCurrency")
    private String prepaidBalanceCurrency = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("statusIdentifier")
    private String statusIdentifier = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("transactionIdentifier")
    private Integer transactionIdentifier = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("last4ofPAN")
    private Integer last4ofPAN = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("responseCode")
    private String responseCode = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("actionCode")
    private String actionCode = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("transmissionDateTime")
    private String transmissionDateTime = null;

    public MultipushfundstransactionsgetResponse approvalCode(String approvalCode) {
        this.approvalCode = approvalCode;
        return this;
    }


    /**
     * The authorization code from the issuer.
     *
     * @return approvalCode
     **/
    @ApiModelProperty(value = "The authorization code from the issuer.")
    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public MultipushfundstransactionsgetResponse feeProgramIndicator(String feeProgramIndicator) {
        this.feeProgramIndicator = feeProgramIndicator;
        return this;
    }


    /**
     * Get feeProgramIndicator
     *
     * @return feeProgramIndicator
     **/
    @ApiModelProperty(value = "")
    public String getFeeProgramIndicator() {
        return feeProgramIndicator;
    }

    public void setFeeProgramIndicator(String feeProgramIndicator) {
        this.feeProgramIndicator = feeProgramIndicator;
    }

    public MultipushfundstransactionsgetResponse prepaidBalance(String prepaidBalance) {
        this.prepaidBalance = prepaidBalance;
        return this;
    }


    /**
     * Min Inclusive: -999999999.999&lt;br&gt;&lt;br&gt;Max Inclusive: 999999999.999&lt;br&gt;&lt;br&gt;Applicable only for Top Up Transactions
     *
     * @return prepaidBalance
     **/
    @ApiModelProperty(value = "Min Inclusive: -999999999.999<br><br>Max Inclusive: 999999999.999<br><br>Applicable only for Top Up Transactions")
    public String getPrepaidBalance() {
        return prepaidBalance;
    }

    public void setPrepaidBalance(String prepaidBalance) {
        this.prepaidBalance = prepaidBalance;
    }

    public MultipushfundstransactionsgetResponse prepaidBalanceCurrency(String prepaidBalanceCurrency) {
        this.prepaidBalanceCurrency = prepaidBalanceCurrency;
        return this;
    }


    /**
     * Get prepaidBalanceCurrency
     *
     * @return prepaidBalanceCurrency
     **/
    @ApiModelProperty(value = "")
    public String getPrepaidBalanceCurrency() {
        return prepaidBalanceCurrency;
    }

    public void setPrepaidBalanceCurrency(String prepaidBalanceCurrency) {
        this.prepaidBalanceCurrency = prepaidBalanceCurrency;
    }

    public MultipushfundstransactionsgetResponse statusIdentifier(String statusIdentifier) {
        this.statusIdentifier = statusIdentifier;
        return this;
    }


    /**
     * required when call times out
     *
     * @return statusIdentifier
     **/
    @ApiModelProperty(required = true, value = "required when call times out")
    public String getStatusIdentifier() {
        return statusIdentifier;
    }

    public void setStatusIdentifier(String statusIdentifier) {
        this.statusIdentifier = statusIdentifier;
    }

    public MultipushfundstransactionsgetResponse transactionIdentifier(Integer transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
        return this;
    }


    /**
     * The VisaNet reference number for the transaction&lt;br&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;&lt;br&gt;transactionIdentifier is a Visa generated field that client recieves in the response message.&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;As an exception Visa allows clients to use the transactionIdentifier received in the AFT response into the subsequent OCT message - this is to simplify matching the pull and push transaction pair and reconciliation.
     *
     * @return transactionIdentifier
     **/
    @ApiModelProperty(required = true, value = "The VisaNet reference number for the transaction<br><br><b>Note: </b><br>transactionIdentifier is a Visa generated field that client recieves in the response message.<br><b>Note: </b>As an exception Visa allows clients to use the transactionIdentifier received in the AFT response into the subsequent OCT message - this is to simplify matching the pull and push transaction pair and reconciliation.")
    public Integer getTransactionIdentifier() {
        return transactionIdentifier;
    }

    public void setTransactionIdentifier(Integer transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }

    public MultipushfundstransactionsgetResponse last4ofPAN(Integer last4ofPAN) {
        this.last4ofPAN = last4ofPAN;
        return this;
    }


    /**
     * This field contains the last four digits of the cardholder primary account number (PAN)
     *
     * @return last4ofPAN
     **/
    @ApiModelProperty(value = "This field contains the last four digits of the cardholder primary account number (PAN)")
    public Integer getLast4ofPAN() {
        return last4ofPAN;
    }

    public void setLast4ofPAN(Integer last4ofPAN) {
        this.last4ofPAN = last4ofPAN;
    }

    public MultipushfundstransactionsgetResponse responseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }


    /**
     * The source for the response; typically, either the recipient issuer or a Visa system.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#response_code\&quot;&gt;responseCode&lt;/a&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;: The VisaNet Response Source for the transaction
     *
     * @return responseCode
     **/
    @ApiModelProperty(required = true, value = "The source for the response; typically, either the recipient issuer or a Visa system.<br><br>Refer to <a href=\"/request_response_codes#response_code\">responseCode</a><br><b>Note: </b>: The VisaNet Response Source for the transaction")
    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public MultipushfundstransactionsgetResponse actionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }


    /**
     * The results of the transaction request &lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#action_code\&quot;&gt;Action Code&lt;/a&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;: The VisaNet Response Code for the transaction
     *
     * @return actionCode
     **/
    @ApiModelProperty(required = true, value = "The results of the transaction request <br><br>Refer to <a href=\"/request_response_codes#action_code\">Action Code</a><br><b>Note: </b>: The VisaNet Response Code for the transaction")
    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public MultipushfundstransactionsgetResponse transmissionDateTime(String transmissionDateTime) {
        this.transmissionDateTime = transmissionDateTime;
        return this;
    }


    /**
     * Example: 2016-01-15T07:03:52.000Z
     *
     * @return transmissionDateTime
     **/
    @ApiModelProperty(required = true, value = "Example: 2016-01-15T07:03:52.000Z")
    public String getTransmissionDateTime() {
        return transmissionDateTime;
    }

    public void setTransmissionDateTime(String transmissionDateTime) {
        this.transmissionDateTime = transmissionDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultipushfundstransactionsgetResponse multipushfundstransactionsgetResponse = (MultipushfundstransactionsgetResponse) o;
        return Objects.equals(this.approvalCode, multipushfundstransactionsgetResponse.approvalCode) &&
                Objects.equals(this.feeProgramIndicator, multipushfundstransactionsgetResponse.feeProgramIndicator) &&
                Objects.equals(this.prepaidBalance, multipushfundstransactionsgetResponse.prepaidBalance) &&
                Objects.equals(this.prepaidBalanceCurrency, multipushfundstransactionsgetResponse.prepaidBalanceCurrency) &&
                Objects.equals(this.statusIdentifier, multipushfundstransactionsgetResponse.statusIdentifier) &&
                Objects.equals(this.transactionIdentifier, multipushfundstransactionsgetResponse.transactionIdentifier) &&
                Objects.equals(this.last4ofPAN, multipushfundstransactionsgetResponse.last4ofPAN) &&
                Objects.equals(this.responseCode, multipushfundstransactionsgetResponse.responseCode) &&
                Objects.equals(this.actionCode, multipushfundstransactionsgetResponse.actionCode) &&
                Objects.equals(this.transmissionDateTime, multipushfundstransactionsgetResponse.transmissionDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvalCode, feeProgramIndicator, prepaidBalance, prepaidBalanceCurrency, statusIdentifier, transactionIdentifier, last4ofPAN, responseCode, actionCode, transmissionDateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultipushfundstransactionsgetResponse {\n");

        sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
        sb.append("    feeProgramIndicator: ").append(toIndentedString(feeProgramIndicator)).append("\n");
        sb.append("    prepaidBalance: ").append(toIndentedString(prepaidBalance)).append("\n");
        sb.append("    prepaidBalanceCurrency: ").append(toIndentedString(prepaidBalanceCurrency)).append("\n");
        sb.append("    statusIdentifier: ").append(toIndentedString(statusIdentifier)).append("\n");
        sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
        sb.append("    last4ofPAN: ").append(toIndentedString(last4ofPAN)).append("\n");
        sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
        sb.append("    actionCode: ").append(toIndentedString(actionCode)).append("\n");
        sb.append("    transmissionDateTime: ").append(toIndentedString(transmissionDateTime)).append("\n");
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



