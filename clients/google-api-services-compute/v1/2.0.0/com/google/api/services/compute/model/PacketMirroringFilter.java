/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.compute.model;

/**
 * Model definition for PacketMirroringFilter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PacketMirroringFilter extends com.google.api.client.json.GenericJson {

  /**
   * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic
   * that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor IPProtocols is
   * specified, all IPv4 traffic is mirrored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("IPProtocols")
  private java.util.List<java.lang.String> iPProtocols;

  /**
   * One or more IPv4 or IPv6 CIDR ranges that apply as filter on the source (ingress) or
   * destination (egress) IP in the IP header. If no ranges are specified, all IPv4 traffic that
   * matches the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is
   * specified, all IPv4 traffic is mirrored. To mirror all IPv4 and IPv6 traffic, use
   * "0.0.0.0/0,::/0". Note: Support for IPv6 traffic is in preview.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> cidrRanges;

  /**
   * Direction of traffic to mirror, either INGRESS, EGRESS, or BOTH. The default is BOTH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String direction;

  /**
   * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic
   * that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor IPProtocols is
   * specified, all IPv4 traffic is mirrored.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIPProtocols() {
    return iPProtocols;
  }

  /**
   * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic
   * that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor IPProtocols is
   * specified, all IPv4 traffic is mirrored.
   * @param iPProtocols iPProtocols or {@code null} for none
   */
  public PacketMirroringFilter setIPProtocols(java.util.List<java.lang.String> iPProtocols) {
    this.iPProtocols = iPProtocols;
    return this;
  }

  /**
   * One or more IPv4 or IPv6 CIDR ranges that apply as filter on the source (ingress) or
   * destination (egress) IP in the IP header. If no ranges are specified, all IPv4 traffic that
   * matches the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is
   * specified, all IPv4 traffic is mirrored. To mirror all IPv4 and IPv6 traffic, use
   * "0.0.0.0/0,::/0". Note: Support for IPv6 traffic is in preview.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCidrRanges() {
    return cidrRanges;
  }

  /**
   * One or more IPv4 or IPv6 CIDR ranges that apply as filter on the source (ingress) or
   * destination (egress) IP in the IP header. If no ranges are specified, all IPv4 traffic that
   * matches the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is
   * specified, all IPv4 traffic is mirrored. To mirror all IPv4 and IPv6 traffic, use
   * "0.0.0.0/0,::/0". Note: Support for IPv6 traffic is in preview.
   * @param cidrRanges cidrRanges or {@code null} for none
   */
  public PacketMirroringFilter setCidrRanges(java.util.List<java.lang.String> cidrRanges) {
    this.cidrRanges = cidrRanges;
    return this;
  }

  /**
   * Direction of traffic to mirror, either INGRESS, EGRESS, or BOTH. The default is BOTH.
   * @return value or {@code null} for none
   */
  public java.lang.String getDirection() {
    return direction;
  }

  /**
   * Direction of traffic to mirror, either INGRESS, EGRESS, or BOTH. The default is BOTH.
   * @param direction direction or {@code null} for none
   */
  public PacketMirroringFilter setDirection(java.lang.String direction) {
    this.direction = direction;
    return this;
  }

  @Override
  public PacketMirroringFilter set(String fieldName, Object value) {
    return (PacketMirroringFilter) super.set(fieldName, value);
  }

  @Override
  public PacketMirroringFilter clone() {
    return (PacketMirroringFilter) super.clone();
  }

}
