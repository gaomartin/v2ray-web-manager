// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/proxyman/config.proto

package com.v2ray.core.app.proxyman;

public interface AllocationStrategyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.app.proxyman.AllocationStrategy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.v2ray.core.app.proxyman.AllocationStrategy.Type type = 1;</code>
   */
  int getTypeValue();
  /**
   * <code>.v2ray.core.app.proxyman.AllocationStrategy.Type type = 1;</code>
   */
  AllocationStrategy.Type getType();

  /**
   * <pre>
   * Number of handlers (ports) running in parallel.
   * Default value is 3 if unset.
   * </pre>
   *
   * <code>.v2ray.core.app.proxyman.AllocationStrategy.AllocationStrategyConcurrency concurrency = 2;</code>
   */
  boolean hasConcurrency();
  /**
   * <pre>
   * Number of handlers (ports) running in parallel.
   * Default value is 3 if unset.
   * </pre>
   *
   * <code>.v2ray.core.app.proxyman.AllocationStrategy.AllocationStrategyConcurrency concurrency = 2;</code>
   */
  AllocationStrategy.AllocationStrategyConcurrency getConcurrency();
  /**
   * <pre>
   * Number of handlers (ports) running in parallel.
   * Default value is 3 if unset.
   * </pre>
   *
   * <code>.v2ray.core.app.proxyman.AllocationStrategy.AllocationStrategyConcurrency concurrency = 2;</code>
   */
  AllocationStrategy.AllocationStrategyConcurrencyOrBuilder getConcurrencyOrBuilder();

  /**
   * <pre>
   * Number of minutes before a handler is regenerated.
   * Default value is 5 if unset.
   * </pre>
   *
   * <code>.v2ray.core.app.proxyman.AllocationStrategy.AllocationStrategyRefresh refresh = 3;</code>
   */
  boolean hasRefresh();
  /**
   * <pre>
   * Number of minutes before a handler is regenerated.
   * Default value is 5 if unset.
   * </pre>
   *
   * <code>.v2ray.core.app.proxyman.AllocationStrategy.AllocationStrategyRefresh refresh = 3;</code>
   */
  AllocationStrategy.AllocationStrategyRefresh getRefresh();
  /**
   * <pre>
   * Number of minutes before a handler is regenerated.
   * Default value is 5 if unset.
   * </pre>
   *
   * <code>.v2ray.core.app.proxyman.AllocationStrategy.AllocationStrategyRefresh refresh = 3;</code>
   */
  AllocationStrategy.AllocationStrategyRefreshOrBuilder getRefreshOrBuilder();
}
