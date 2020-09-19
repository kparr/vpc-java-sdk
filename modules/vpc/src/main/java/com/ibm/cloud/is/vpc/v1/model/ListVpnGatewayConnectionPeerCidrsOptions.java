/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.is.vpc.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listVpnGatewayConnectionPeerCidrs options.
 */
public class ListVpnGatewayConnectionPeerCidrsOptions extends GenericModel {

  protected String vpnGatewayId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpnGatewayId;
    private String id;

    private Builder(ListVpnGatewayConnectionPeerCidrsOptions listVpnGatewayConnectionPeerCidrsOptions) {
      this.vpnGatewayId = listVpnGatewayConnectionPeerCidrsOptions.vpnGatewayId;
      this.id = listVpnGatewayConnectionPeerCidrsOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpnGatewayId the vpnGatewayId
     * @param id the id
     */
    public Builder(String vpnGatewayId, String id) {
      this.vpnGatewayId = vpnGatewayId;
      this.id = id;
    }

    /**
     * Builds a ListVpnGatewayConnectionPeerCidrsOptions.
     *
     * @return the new ListVpnGatewayConnectionPeerCidrsOptions instance
     */
    public ListVpnGatewayConnectionPeerCidrsOptions build() {
      return new ListVpnGatewayConnectionPeerCidrsOptions(this);
    }

    /**
     * Set the vpnGatewayId.
     *
     * @param vpnGatewayId the vpnGatewayId
     * @return the ListVpnGatewayConnectionPeerCidrsOptions builder
     */
    public Builder vpnGatewayId(String vpnGatewayId) {
      this.vpnGatewayId = vpnGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ListVpnGatewayConnectionPeerCidrsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected ListVpnGatewayConnectionPeerCidrsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpnGatewayId,
      "vpnGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    vpnGatewayId = builder.vpnGatewayId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a ListVpnGatewayConnectionPeerCidrsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpnGatewayId.
   *
   * The VPN gateway identifier.
   *
   * @return the vpnGatewayId
   */
  public String vpnGatewayId() {
    return vpnGatewayId;
  }

  /**
   * Gets the id.
   *
   * The VPN gateway connection identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

