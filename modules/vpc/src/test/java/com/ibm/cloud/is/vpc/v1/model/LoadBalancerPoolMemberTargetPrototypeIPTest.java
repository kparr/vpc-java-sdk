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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeIP;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolMemberTargetPrototypeIP model.
 */
public class LoadBalancerPoolMemberTargetPrototypeIPTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolMemberTargetPrototypeIP() throws Throwable {
    LoadBalancerPoolMemberTargetPrototypeIP loadBalancerPoolMemberTargetPrototypeIpModel = new LoadBalancerPoolMemberTargetPrototypeIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(loadBalancerPoolMemberTargetPrototypeIpModel.address(), "192.168.3.4");

    String json = TestUtilities.serialize(loadBalancerPoolMemberTargetPrototypeIpModel);

    LoadBalancerPoolMemberTargetPrototypeIP loadBalancerPoolMemberTargetPrototypeIpModelNew = TestUtilities.deserialize(json, LoadBalancerPoolMemberTargetPrototypeIP.class);
    assertTrue(loadBalancerPoolMemberTargetPrototypeIpModelNew instanceof LoadBalancerPoolMemberTargetPrototypeIP);
    assertEquals(loadBalancerPoolMemberTargetPrototypeIpModelNew.address(), "192.168.3.4");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerPoolMemberTargetPrototypeIPError() throws Throwable {
    new LoadBalancerPoolMemberTargetPrototypeIP.Builder().build();
  }

}