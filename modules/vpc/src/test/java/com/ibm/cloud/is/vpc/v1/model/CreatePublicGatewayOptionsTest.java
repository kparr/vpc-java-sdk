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

import com.ibm.cloud.is.vpc.v1.model.CreatePublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreatePublicGatewayOptions model.
 */
public class CreatePublicGatewayOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreatePublicGatewayOptions() throws Throwable {
    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "4727d842-f94f-4a2d-824a-9bc9b02c523b");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById publicGatewayPrototypeFloatingIpModel = new PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById.Builder()
      .id("39300233-9995-4806-89a5-3c1b6eb88689")
      .build();
    assertEquals(publicGatewayPrototypeFloatingIpModel.id(), "39300233-9995-4806-89a5-3c1b6eb88689");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    CreatePublicGatewayOptions createPublicGatewayOptionsModel = new CreatePublicGatewayOptions.Builder()
      .vpc(vpcIdentityModel)
      .zone(zoneIdentityModel)
      .name("my-public-gateway")
      .floatingIp(publicGatewayPrototypeFloatingIpModel)
      .resourceGroup(resourceGroupIdentityModel)
      .build();
    assertEquals(createPublicGatewayOptionsModel.vpc(), vpcIdentityModel);
    assertEquals(createPublicGatewayOptionsModel.zone(), zoneIdentityModel);
    assertEquals(createPublicGatewayOptionsModel.name(), "my-public-gateway");
    assertEquals(createPublicGatewayOptionsModel.floatingIp(), publicGatewayPrototypeFloatingIpModel);
    assertEquals(createPublicGatewayOptionsModel.resourceGroup(), resourceGroupIdentityModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePublicGatewayOptionsError() throws Throwable {
    new CreatePublicGatewayOptions.Builder().build();
  }

}