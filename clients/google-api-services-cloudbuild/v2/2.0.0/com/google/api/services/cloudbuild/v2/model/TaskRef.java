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

package com.google.api.services.cloudbuild.v2.model;

/**
 * TaskRef can be used to refer to a specific instance of a task. PipelineRef can be used to refer
 * to a specific instance of a Pipeline.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TaskRef extends com.google.api.client.json.GenericJson {

  /**
   * Name of the task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Params contains the parameters used to identify the referenced Tekton resource. Example entries
   * might include "repo" or "path" but the set of params ultimately depends on the chosen resolver.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Param> params;

  static {
    // hack to force ProGuard to consider Param used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Param.class);
  }

  /**
   * Resolver is the name of the resolver that should perform resolution of the referenced Tekton
   * resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resolver;

  /**
   * Name of the task.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the task.
   * @param name name or {@code null} for none
   */
  public TaskRef setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Params contains the parameters used to identify the referenced Tekton resource. Example entries
   * might include "repo" or "path" but the set of params ultimately depends on the chosen resolver.
   * @return value or {@code null} for none
   */
  public java.util.List<Param> getParams() {
    return params;
  }

  /**
   * Params contains the parameters used to identify the referenced Tekton resource. Example entries
   * might include "repo" or "path" but the set of params ultimately depends on the chosen resolver.
   * @param params params or {@code null} for none
   */
  public TaskRef setParams(java.util.List<Param> params) {
    this.params = params;
    return this;
  }

  /**
   * Resolver is the name of the resolver that should perform resolution of the referenced Tekton
   * resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getResolver() {
    return resolver;
  }

  /**
   * Resolver is the name of the resolver that should perform resolution of the referenced Tekton
   * resource.
   * @param resolver resolver or {@code null} for none
   */
  public TaskRef setResolver(java.lang.String resolver) {
    this.resolver = resolver;
    return this;
  }

  @Override
  public TaskRef set(String fieldName, Object value) {
    return (TaskRef) super.set(fieldName, value);
  }

  @Override
  public TaskRef clone() {
    return (TaskRef) super.clone();
  }

}
