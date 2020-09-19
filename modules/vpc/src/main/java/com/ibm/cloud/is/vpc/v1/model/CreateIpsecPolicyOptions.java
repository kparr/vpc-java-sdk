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
 * The createIpsecPolicy options.
 */
public class CreateIpsecPolicyOptions extends GenericModel {

  /**
   * The authentication algorithm.
   */
  public interface AuthenticationAlgorithm {
    /** md5. */
    String MD5 = "md5";
    /** sha1. */
    String SHA1 = "sha1";
    /** sha256. */
    String SHA256 = "sha256";
  }

  /**
   * The encryption algorithm.
   */
  public interface EncryptionAlgorithm {
    /** triple_des. */
    String TRIPLE_DES = "triple_des";
    /** aes128. */
    String AES128 = "aes128";
    /** aes256. */
    String AES256 = "aes256";
  }

  /**
   * Perfect Forward Secrecy.
   */
  public interface Pfs {
    /** disabled. */
    String DISABLED = "disabled";
    /** group_14. */
    String GROUP_14 = "group_14";
    /** group_2. */
    String GROUP_2 = "group_2";
    /** group_5. */
    String GROUP_5 = "group_5";
  }

  protected String authenticationAlgorithm;
  protected String encryptionAlgorithm;
  protected String pfs;
  protected String name;
  protected Long keyLifetime;
  protected ResourceGroupIdentity resourceGroup;

  /**
   * Builder.
   */
  public static class Builder {
    private String authenticationAlgorithm;
    private String encryptionAlgorithm;
    private String pfs;
    private String name;
    private Long keyLifetime;
    private ResourceGroupIdentity resourceGroup;

    private Builder(CreateIpsecPolicyOptions createIpsecPolicyOptions) {
      this.authenticationAlgorithm = createIpsecPolicyOptions.authenticationAlgorithm;
      this.encryptionAlgorithm = createIpsecPolicyOptions.encryptionAlgorithm;
      this.pfs = createIpsecPolicyOptions.pfs;
      this.name = createIpsecPolicyOptions.name;
      this.keyLifetime = createIpsecPolicyOptions.keyLifetime;
      this.resourceGroup = createIpsecPolicyOptions.resourceGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param authenticationAlgorithm the authenticationAlgorithm
     * @param encryptionAlgorithm the encryptionAlgorithm
     * @param pfs the pfs
     */
    public Builder(String authenticationAlgorithm, String encryptionAlgorithm, String pfs) {
      this.authenticationAlgorithm = authenticationAlgorithm;
      this.encryptionAlgorithm = encryptionAlgorithm;
      this.pfs = pfs;
    }

    /**
     * Builds a CreateIpsecPolicyOptions.
     *
     * @return the new CreateIpsecPolicyOptions instance
     */
    public CreateIpsecPolicyOptions build() {
      return new CreateIpsecPolicyOptions(this);
    }

    /**
     * Set the authenticationAlgorithm.
     *
     * @param authenticationAlgorithm the authenticationAlgorithm
     * @return the CreateIpsecPolicyOptions builder
     */
    public Builder authenticationAlgorithm(String authenticationAlgorithm) {
      this.authenticationAlgorithm = authenticationAlgorithm;
      return this;
    }

    /**
     * Set the encryptionAlgorithm.
     *
     * @param encryptionAlgorithm the encryptionAlgorithm
     * @return the CreateIpsecPolicyOptions builder
     */
    public Builder encryptionAlgorithm(String encryptionAlgorithm) {
      this.encryptionAlgorithm = encryptionAlgorithm;
      return this;
    }

    /**
     * Set the pfs.
     *
     * @param pfs the pfs
     * @return the CreateIpsecPolicyOptions builder
     */
    public Builder pfs(String pfs) {
      this.pfs = pfs;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateIpsecPolicyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the keyLifetime.
     *
     * @param keyLifetime the keyLifetime
     * @return the CreateIpsecPolicyOptions builder
     */
    public Builder keyLifetime(long keyLifetime) {
      this.keyLifetime = keyLifetime;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateIpsecPolicyOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected CreateIpsecPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.authenticationAlgorithm,
      "authenticationAlgorithm cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.encryptionAlgorithm,
      "encryptionAlgorithm cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.pfs,
      "pfs cannot be null");
    authenticationAlgorithm = builder.authenticationAlgorithm;
    encryptionAlgorithm = builder.encryptionAlgorithm;
    pfs = builder.pfs;
    name = builder.name;
    keyLifetime = builder.keyLifetime;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a CreateIpsecPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the authenticationAlgorithm.
   *
   * The authentication algorithm.
   *
   * @return the authenticationAlgorithm
   */
  public String authenticationAlgorithm() {
    return authenticationAlgorithm;
  }

  /**
   * Gets the encryptionAlgorithm.
   *
   * The encryption algorithm.
   *
   * @return the encryptionAlgorithm
   */
  public String encryptionAlgorithm() {
    return encryptionAlgorithm;
  }

  /**
   * Gets the pfs.
   *
   * Perfect Forward Secrecy.
   *
   * @return the pfs
   */
  public String pfs() {
    return pfs;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this IPsec policy.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the keyLifetime.
   *
   * The key lifetime in seconds.
   *
   * @return the keyLifetime
   */
  public Long keyLifetime() {
    return keyLifetime;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) is used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }
}

