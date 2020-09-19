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
 * The updateNetworkAclRule options.
 */
public class UpdateNetworkAclRuleOptions extends GenericModel {

  /**
   * Whether to allow or deny matching traffic.
   */
  public interface Action {
    /** allow. */
    String ALLOW = "allow";
    /** deny. */
    String DENY = "deny";
  }

  /**
   * Whether the traffic to be matched is `inbound` or `outbound`.
   */
  public interface Direction {
    /** inbound. */
    String INBOUND = "inbound";
    /** outbound. */
    String OUTBOUND = "outbound";
  }

  protected String networkAclId;
  protected String id;
  protected String name;
  protected String action;
  protected String destination;
  protected String direction;
  protected String source;
  protected Long destinationPortMax;
  protected Long destinationPortMin;
  protected Long sourcePortMax;
  protected Long sourcePortMin;
  protected Long code;
  protected Long type;
  protected NetworkACLRuleIdentity before;

  /**
   * Builder.
   */
  public static class Builder {
    private String networkAclId;
    private String id;
    private String name;
    private String action;
    private String destination;
    private String direction;
    private String source;
    private Long destinationPortMax;
    private Long destinationPortMin;
    private Long sourcePortMax;
    private Long sourcePortMin;
    private Long code;
    private Long type;
    private NetworkACLRuleIdentity before;

    private Builder(UpdateNetworkAclRuleOptions updateNetworkAclRuleOptions) {
      this.networkAclId = updateNetworkAclRuleOptions.networkAclId;
      this.id = updateNetworkAclRuleOptions.id;
      this.name = updateNetworkAclRuleOptions.name;
      this.action = updateNetworkAclRuleOptions.action;
      this.destination = updateNetworkAclRuleOptions.destination;
      this.direction = updateNetworkAclRuleOptions.direction;
      this.source = updateNetworkAclRuleOptions.source;
      this.destinationPortMax = updateNetworkAclRuleOptions.destinationPortMax;
      this.destinationPortMin = updateNetworkAclRuleOptions.destinationPortMin;
      this.sourcePortMax = updateNetworkAclRuleOptions.sourcePortMax;
      this.sourcePortMin = updateNetworkAclRuleOptions.sourcePortMin;
      this.code = updateNetworkAclRuleOptions.code;
      this.type = updateNetworkAclRuleOptions.type;
      this.before = updateNetworkAclRuleOptions.before;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param networkAclId the networkAclId
     * @param id the id
     */
    public Builder(String networkAclId, String id) {
      this.networkAclId = networkAclId;
      this.id = id;
    }

    /**
     * Builds a UpdateNetworkAclRuleOptions.
     *
     * @return the new UpdateNetworkAclRuleOptions instance
     */
    public UpdateNetworkAclRuleOptions build() {
      return new UpdateNetworkAclRuleOptions(this);
    }

    /**
     * Set the networkAclId.
     *
     * @param networkAclId the networkAclId
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder networkAclId(String networkAclId) {
      this.networkAclId = networkAclId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the destination.
     *
     * @param destination the destination
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder destination(String destination) {
      this.destination = destination;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Set the destinationPortMax.
     *
     * @param destinationPortMax the destinationPortMax
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder destinationPortMax(long destinationPortMax) {
      this.destinationPortMax = destinationPortMax;
      return this;
    }

    /**
     * Set the destinationPortMin.
     *
     * @param destinationPortMin the destinationPortMin
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder destinationPortMin(long destinationPortMin) {
      this.destinationPortMin = destinationPortMin;
      return this;
    }

    /**
     * Set the sourcePortMax.
     *
     * @param sourcePortMax the sourcePortMax
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder sourcePortMax(long sourcePortMax) {
      this.sourcePortMax = sourcePortMax;
      return this;
    }

    /**
     * Set the sourcePortMin.
     *
     * @param sourcePortMin the sourcePortMin
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder sourcePortMin(long sourcePortMin) {
      this.sourcePortMin = sourcePortMin;
      return this;
    }

    /**
     * Set the code.
     *
     * @param code the code
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder code(long code) {
      this.code = code;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder type(long type) {
      this.type = type;
      return this;
    }

    /**
     * Set the before.
     *
     * @param before the before
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder before(NetworkACLRuleIdentity before) {
      this.before = before;
      return this;
    }
  }

  protected UpdateNetworkAclRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.networkAclId,
      "networkAclId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    networkAclId = builder.networkAclId;
    id = builder.id;
    name = builder.name;
    action = builder.action;
    destination = builder.destination;
    direction = builder.direction;
    source = builder.source;
    destinationPortMax = builder.destinationPortMax;
    destinationPortMin = builder.destinationPortMin;
    sourcePortMax = builder.sourcePortMax;
    sourcePortMin = builder.sourcePortMin;
    code = builder.code;
    type = builder.type;
    before = builder.before;
  }

  /**
   * New builder.
   *
   * @return a UpdateNetworkAclRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the networkAclId.
   *
   * The network ACL identifier.
   *
   * @return the networkAclId
   */
  public String networkAclId() {
    return networkAclId;
  }

  /**
   * Gets the id.
   *
   * The rule identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this rule. Names must be unique within the network ACL the rule resides in.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the action.
   *
   * Whether to allow or deny matching traffic.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the destination.
   *
   * The destination IP address or CIDR block. The CIDR block `0.0.0.0/0` applies to all addresses.
   *
   * @return the destination
   */
  public String destination() {
    return destination;
  }

  /**
   * Gets the direction.
   *
   * Whether the traffic to be matched is `inbound` or `outbound`.
   *
   * @return the direction
   */
  public String direction() {
    return direction;
  }

  /**
   * Gets the source.
   *
   * The source IP address or CIDR block.  The CIDR block `0.0.0.0/0` applies to all addresses.
   *
   * @return the source
   */
  public String source() {
    return source;
  }

  /**
   * Gets the destinationPortMax.
   *
   * The inclusive upper bound of TCP/UDP destination port range.
   *
   * @return the destinationPortMax
   */
  public Long destinationPortMax() {
    return destinationPortMax;
  }

  /**
   * Gets the destinationPortMin.
   *
   * The inclusive lower bound of TCP/UDP destination port range.
   *
   * @return the destinationPortMin
   */
  public Long destinationPortMin() {
    return destinationPortMin;
  }

  /**
   * Gets the sourcePortMax.
   *
   * The inclusive upper bound of TCP/UDP source port range.
   *
   * @return the sourcePortMax
   */
  public Long sourcePortMax() {
    return sourcePortMax;
  }

  /**
   * Gets the sourcePortMin.
   *
   * The inclusive lower bound of TCP/UDP source port range.
   *
   * @return the sourcePortMin
   */
  public Long sourcePortMin() {
    return sourcePortMin;
  }

  /**
   * Gets the code.
   *
   * The ICMP traffic code to allow.
   *
   * @return the code
   */
  public Long code() {
    return code;
  }

  /**
   * Gets the type.
   *
   * The ICMP traffic type to allow.
   *
   * @return the type
   */
  public Long type() {
    return type;
  }

  /**
   * Gets the before.
   *
   * The rule to move this rule immediately before. Specify `null` to move this rule after
   * all existing rules.
   *
   * @return the before
   */
  public NetworkACLRuleIdentity before() {
    return before;
  }
}

