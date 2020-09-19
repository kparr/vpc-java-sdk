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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerListenerPolicyPrototype.
 */
public class LoadBalancerListenerPolicyPrototype extends GenericModel {

  /**
   * The policy action.
   */
  public interface Action {
    /** forward. */
    String FORWARD = "forward";
    /** redirect. */
    String REDIRECT = "redirect";
    /** reject. */
    String REJECT = "reject";
  }

  protected String name;
  protected Long priority;
  protected String action;
  protected List<LoadBalancerListenerPolicyRulePrototype> rules;
  protected LoadBalancerListenerPolicyPrototypeTarget target;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private Long priority;
    private String action;
    private List<LoadBalancerListenerPolicyRulePrototype> rules;
    private LoadBalancerListenerPolicyPrototypeTarget target;

    private Builder(LoadBalancerListenerPolicyPrototype loadBalancerListenerPolicyPrototype) {
      this.name = loadBalancerListenerPolicyPrototype.name;
      this.priority = loadBalancerListenerPolicyPrototype.priority;
      this.action = loadBalancerListenerPolicyPrototype.action;
      this.rules = loadBalancerListenerPolicyPrototype.rules;
      this.target = loadBalancerListenerPolicyPrototype.target;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param priority the priority
     * @param action the action
     */
    public Builder(Long priority, String action) {
      this.priority = priority;
      this.action = action;
    }

    /**
     * Builds a LoadBalancerListenerPolicyPrototype.
     *
     * @return the new LoadBalancerListenerPolicyPrototype instance
     */
    public LoadBalancerListenerPolicyPrototype build() {
      return new LoadBalancerListenerPolicyPrototype(this);
    }

    /**
     * Adds an rules to rules.
     *
     * @param rules the new rules
     * @return the LoadBalancerListenerPolicyPrototype builder
     */
    public Builder addRules(LoadBalancerListenerPolicyRulePrototype rules) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rules,
        "rules cannot be null");
      if (this.rules == null) {
        this.rules = new ArrayList<LoadBalancerListenerPolicyRulePrototype>();
      }
      this.rules.add(rules);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the LoadBalancerListenerPolicyPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the LoadBalancerListenerPolicyPrototype builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the LoadBalancerListenerPolicyPrototype builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the rules.
     * Existing rules will be replaced.
     *
     * @param rules the rules
     * @return the LoadBalancerListenerPolicyPrototype builder
     */
    public Builder rules(List<LoadBalancerListenerPolicyRulePrototype> rules) {
      this.rules = rules;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the LoadBalancerListenerPolicyPrototype builder
     */
    public Builder target(LoadBalancerListenerPolicyPrototypeTarget target) {
      this.target = target;
      return this;
    }
  }

  protected LoadBalancerListenerPolicyPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.priority,
      "priority cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    name = builder.name;
    priority = builder.priority;
    action = builder.action;
    rules = builder.rules;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerPolicyPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this policy. Names must be unique within the load balancer listener the policy resides
   * in.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the priority.
   *
   * Priority of the policy. Lower value indicates higher priority.
   *
   * @return the priority
   */
  public Long priority() {
    return priority;
  }

  /**
   * Gets the action.
   *
   * The policy action.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the rules.
   *
   * The list of rules of this policy.
   *
   * @return the rules
   */
  public List<LoadBalancerListenerPolicyRulePrototype> rules() {
    return rules;
  }

  /**
   * Gets the target.
   *
   * When `action` is `forward`, `LoadBalancerPoolIdentity` is required to specify which
   * pool the load balancer forwards the traffic to. When `action` is `redirect`,
   * `LoadBalancerListenerPolicyRedirectURLPrototype` is required to specify the url and
   * http status code used in the redirect response.
   *
   * @return the target
   */
  public LoadBalancerListenerPolicyPrototypeTarget target() {
    return target;
  }
}

