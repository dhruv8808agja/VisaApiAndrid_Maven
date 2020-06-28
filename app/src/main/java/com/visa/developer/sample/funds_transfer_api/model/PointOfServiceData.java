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
 * &lt;b&gt;Note:&lt;/b&gt; For a CardPresent Transactions, this field is required.
 */
@ApiModel(description = "<b>Note:</b> For a CardPresent Transactions, this field is required.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2019-03-27T10:55:08.119+05:30[Asia/Kolkata]")
public class PointOfServiceData {


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("posConditionCode")
    private Integer posConditionCode = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("panEntryMode")
    private Integer panEntryMode = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("motoECIIndicator")
    private String motoECIIndicator = null;

    public PointOfServiceData posConditionCode(Integer posConditionCode) {
        this.posConditionCode = posConditionCode;
        return this;
    }


    /**
     * &lt;b&gt;Note:&lt;/b&gt; For a CardPresent scenario, this field is required.
     *
     * @return posConditionCode
     **/
    @ApiModelProperty(value = "<b>Note:</b> For a CardPresent scenario, this field is required.")
    public Integer getPosConditionCode() {
        return posConditionCode;
    }

    public void setPosConditionCode(Integer posConditionCode) {
        this.posConditionCode = posConditionCode;
    }

    public PointOfServiceData panEntryMode(Integer panEntryMode) {
        this.panEntryMode = panEntryMode;
        return this;
    }


    /**
     * &lt;b&gt;Note:&lt;/b&gt; For a CardPresent scenario, this field is required.
     *
     * @return panEntryMode
     **/
    @ApiModelProperty(value = "<b>Note:</b> For a CardPresent scenario, this field is required.")
    public Integer getPanEntryMode() {
        return panEntryMode;
    }

    public void setPanEntryMode(Integer panEntryMode) {
        this.panEntryMode = panEntryMode;
    }

    public PointOfServiceData motoECIIndicator(String motoECIIndicator) {
        this.motoECIIndicator = motoECIIndicator;
        return this;
    }


    /**
     * &lt;b&gt;Note:&lt;/b&gt; If posConditionCode is 59, motoECIIndicator must be between 5-8. Default is set to 5 if not provided. If posConditionCode is 0, motoECIIndicator will not be sent. If cavv is not provided, then motoECIIndicator should be set as 7.
     *
     * @return motoECIIndicator
     **/
    @ApiModelProperty(value = "<b>Note:</b> If posConditionCode is 59, motoECIIndicator must be between 5-8. Default is set to 5 if not provided. If posConditionCode is 0, motoECIIndicator will not be sent. If cavv is not provided, then motoECIIndicator should be set as 7.")
    public String getMotoECIIndicator() {
        return motoECIIndicator;
    }

    public void setMotoECIIndicator(String motoECIIndicator) {
        this.motoECIIndicator = motoECIIndicator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PointOfServiceData pointOfServiceData = (PointOfServiceData) o;
        return Objects.equals(this.posConditionCode, pointOfServiceData.posConditionCode) &&
                Objects.equals(this.panEntryMode, pointOfServiceData.panEntryMode) &&
                Objects.equals(this.motoECIIndicator, pointOfServiceData.motoECIIndicator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posConditionCode, panEntryMode, motoECIIndicator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PointOfServiceData {\n");

        sb.append("    posConditionCode: ").append(toIndentedString(posConditionCode)).append("\n");
        sb.append("    panEntryMode: ").append(toIndentedString(panEntryMode)).append("\n");
        sb.append("    motoECIIndicator: ").append(toIndentedString(motoECIIndicator)).append("\n");
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



