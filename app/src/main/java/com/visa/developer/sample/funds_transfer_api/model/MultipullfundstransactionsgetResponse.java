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
 * Pull Multi Funds Transfer Response
 */
@ApiModel(description = "Pull Multi Funds Transfer Response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2019-03-27T10:55:08.119+05:30[Asia/Kolkata]")
public class MultipullfundstransactionsgetResponse {


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("approvalCode")
    private String approvalCode = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("feeProgramIndicator")
    private String feeProgramIndicator = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("last4ofPAN")
    private Integer last4ofPAN = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("cavvResultCode")
    private String cavvResultCode = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("statusIdentifier")
    private String statusIdentifier = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("transactionIdentifier")
    private Integer transactionIdentifier = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("memberComments")
    private String memberComments = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("responseCode")
    private String responseCode = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("actionCode")
    private String actionCode = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("cpsAuthorizationCharacteristicsIndicator")
    private String cpsAuthorizationCharacteristicsIndicator = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("reimbursementAttribute")
    private String reimbursementAttribute = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("transmissionDateTime")
    private String transmissionDateTime = null;

    public MultipullfundstransactionsgetResponse approvalCode(String approvalCode) {
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

    public MultipullfundstransactionsgetResponse feeProgramIndicator(String feeProgramIndicator) {
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

    public MultipullfundstransactionsgetResponse last4ofPAN(Integer last4ofPAN) {
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

    public MultipullfundstransactionsgetResponse cavvResultCode(String cavvResultCode) {
        this.cavvResultCode = cavvResultCode;
        return this;
    }


    /**
     * The cavvResultCode identifies the outcome of the CAVV validation. &lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#cardholder_authentication_verification_value\&quot;&gt;cavvResultCode&lt;/a&gt;
     *
     * @return cavvResultCode
     **/
    @ApiModelProperty(value = "The cavvResultCode identifies the outcome of the CAVV validation. <br><br>Refer to <a href=\"/request_response_codes#cardholder_authentication_verification_value\">cavvResultCode</a>")
    public String getCavvResultCode() {
        return cavvResultCode;
    }

    public void setCavvResultCode(String cavvResultCode) {
        this.cavvResultCode = cavvResultCode;
    }

    public MultipullfundstransactionsgetResponse statusIdentifier(String statusIdentifier) {
        this.statusIdentifier = statusIdentifier;
        return this;
    }


    /**
     * Get statusIdentifier
     *
     * @return statusIdentifier
     **/
    @ApiModelProperty(required = true, value = "")
    public String getStatusIdentifier() {
        return statusIdentifier;
    }

    public void setStatusIdentifier(String statusIdentifier) {
        this.statusIdentifier = statusIdentifier;
    }

    public MultipullfundstransactionsgetResponse transactionIdentifier(Integer transactionIdentifier) {
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

    public MultipullfundstransactionsgetResponse memberComments(String memberComments) {
        this.memberComments = memberComments;
        return this;
    }


    /**
     * This field can be optionally used to send and receive comments by service providers. Issuers can optionally include new text in this field in the response. If the issuer does not include this field, Visa will inject the value from the request in the response and send it back to the service provider.
     *
     * @return memberComments
     **/
    @ApiModelProperty(value = "This field can be optionally used to send and receive comments by service providers. Issuers can optionally include new text in this field in the response. If the issuer does not include this field, Visa will inject the value from the request in the response and send it back to the service provider.")
    public String getMemberComments() {
        return memberComments;
    }

    public void setMemberComments(String memberComments) {
        this.memberComments = memberComments;
    }

    public MultipullfundstransactionsgetResponse responseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }


    /**
     * The source for the response; typically, either the recipient issuer or a Visa system.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#response_code\&quot;&gt;response_code&lt;/a&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;: The VisaNet Response Source for the transaction
     *
     * @return responseCode
     **/
    @ApiModelProperty(required = true, value = "The source for the response; typically, either the recipient issuer or a Visa system.<br><br>Refer to <a href=\"/request_response_codes#response_code\">response_code</a><br><b>Note: </b>: The VisaNet Response Source for the transaction")
    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public MultipullfundstransactionsgetResponse actionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }


    /**
     * The results of the transaction request &lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#action_code\&quot;&gt;actionCode&lt;/a&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;: The VisaNet Response Code for the transaction
     *
     * @return actionCode
     **/
    @ApiModelProperty(required = true, value = "The results of the transaction request <br><br>Refer to <a href=\"/request_response_codes#action_code\">actionCode</a><br><b>Note: </b>: The VisaNet Response Code for the transaction")
    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public MultipullfundstransactionsgetResponse cpsAuthorizationCharacteristicsIndicator(String cpsAuthorizationCharacteristicsIndicator) {
        this.cpsAuthorizationCharacteristicsIndicator = cpsAuthorizationCharacteristicsIndicator;
        return this;
    }


    /**
     * Indicates whether AFT transaction has qualified for CPS. Possible values are : F (Meets CPS/Account Funding requirements) , N (Not Qualified), T (Not Qualified)
     *
     * @return cpsAuthorizationCharacteristicsIndicator
     **/
    @ApiModelProperty(value = "Indicates whether AFT transaction has qualified for CPS. Possible values are : F (Meets CPS/Account Funding requirements) , N (Not Qualified), T (Not Qualified)")
    public String getCpsAuthorizationCharacteristicsIndicator() {
        return cpsAuthorizationCharacteristicsIndicator;
    }

    public void setCpsAuthorizationCharacteristicsIndicator(String cpsAuthorizationCharacteristicsIndicator) {
        this.cpsAuthorizationCharacteristicsIndicator = cpsAuthorizationCharacteristicsIndicator;
    }

    public MultipullfundstransactionsgetResponse reimbursementAttribute(String reimbursementAttribute) {
        this.reimbursementAttribute = reimbursementAttribute;
        return this;
    }


    /**
     * If AFT transaction has qualified for CPS then this field contains a code that identifies the applicable interchange reimbursement fee. Possible values are : A (Payment Service Interchange Reimbursement Fee (PSIRF)�U.S.)
     *
     * @return reimbursementAttribute
     **/
    @ApiModelProperty(value = "If AFT transaction has qualified for CPS then this field contains a code that identifies the applicable interchange reimbursement fee. Possible values are : A (Payment Service Interchange Reimbursement Fee (PSIRF)�U.S.)")
    public String getReimbursementAttribute() {
        return reimbursementAttribute;
    }

    public void setReimbursementAttribute(String reimbursementAttribute) {
        this.reimbursementAttribute = reimbursementAttribute;
    }

    public MultipullfundstransactionsgetResponse transmissionDateTime(String transmissionDateTime) {
        this.transmissionDateTime = transmissionDateTime;
        return this;
    }


    /**
     * Example: 2016-01-15T07:03:52.000Z&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt; Remove �.000Z� if this field value is used for ReverseFundsTransactions POST request or MultiReverseFundsTransactions POST request.
     *
     * @return transmissionDateTime
     **/
    @ApiModelProperty(required = true, value = "Example: 2016-01-15T07:03:52.000Z<br><b>Note: </b> Remove �.000Z� if this field value is used for ReverseFundsTransactions POST request or MultiReverseFundsTransactions POST request.")
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
        MultipullfundstransactionsgetResponse multipullfundstransactionsgetResponse = (MultipullfundstransactionsgetResponse) o;
        return Objects.equals(this.approvalCode, multipullfundstransactionsgetResponse.approvalCode) &&
                Objects.equals(this.feeProgramIndicator, multipullfundstransactionsgetResponse.feeProgramIndicator) &&
                Objects.equals(this.last4ofPAN, multipullfundstransactionsgetResponse.last4ofPAN) &&
                Objects.equals(this.cavvResultCode, multipullfundstransactionsgetResponse.cavvResultCode) &&
                Objects.equals(this.statusIdentifier, multipullfundstransactionsgetResponse.statusIdentifier) &&
                Objects.equals(this.transactionIdentifier, multipullfundstransactionsgetResponse.transactionIdentifier) &&
                Objects.equals(this.memberComments, multipullfundstransactionsgetResponse.memberComments) &&
                Objects.equals(this.responseCode, multipullfundstransactionsgetResponse.responseCode) &&
                Objects.equals(this.actionCode, multipullfundstransactionsgetResponse.actionCode) &&
                Objects.equals(this.cpsAuthorizationCharacteristicsIndicator, multipullfundstransactionsgetResponse.cpsAuthorizationCharacteristicsIndicator) &&
                Objects.equals(this.reimbursementAttribute, multipullfundstransactionsgetResponse.reimbursementAttribute) &&
                Objects.equals(this.transmissionDateTime, multipullfundstransactionsgetResponse.transmissionDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvalCode, feeProgramIndicator, last4ofPAN, cavvResultCode, statusIdentifier, transactionIdentifier, memberComments, responseCode, actionCode, cpsAuthorizationCharacteristicsIndicator, reimbursementAttribute, transmissionDateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultipullfundstransactionsgetResponse {\n");

        sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
        sb.append("    feeProgramIndicator: ").append(toIndentedString(feeProgramIndicator)).append("\n");
        sb.append("    last4ofPAN: ").append(toIndentedString(last4ofPAN)).append("\n");
        sb.append("    cavvResultCode: ").append(toIndentedString(cavvResultCode)).append("\n");
        sb.append("    statusIdentifier: ").append(toIndentedString(statusIdentifier)).append("\n");
        sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
        sb.append("    memberComments: ").append(toIndentedString(memberComments)).append("\n");
        sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
        sb.append("    actionCode: ").append(toIndentedString(actionCode)).append("\n");
        sb.append("    cpsAuthorizationCharacteristicsIndicator: ").append(toIndentedString(cpsAuthorizationCharacteristicsIndicator)).append("\n");
        sb.append("    reimbursementAttribute: ").append(toIndentedString(reimbursementAttribute)).append("\n");
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



