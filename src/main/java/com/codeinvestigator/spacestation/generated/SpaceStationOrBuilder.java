// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spacestation.proto

package com.codeinvestigator.spacestation.generated;

public interface SpaceStationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mike.SpaceStation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required .mike.Captain captain = 1;</code>
   * @return Whether the captain field is set.
   */
  boolean hasCaptain();
  /**
   * <code>required .mike.Captain captain = 1;</code>
   * @return The captain.
   */
  com.codeinvestigator.spacestation.generated.Captain getCaptain();
  /**
   * <code>required .mike.Captain captain = 1;</code>
   */
  com.codeinvestigator.spacestation.generated.CaptainOrBuilder getCaptainOrBuilder();

  /**
   * <code>repeated .mike.SpaceShip spaceships = 2;</code>
   */
  java.util.List<com.codeinvestigator.spacestation.generated.SpaceShip> 
      getSpaceshipsList();
  /**
   * <code>repeated .mike.SpaceShip spaceships = 2;</code>
   */
  com.codeinvestigator.spacestation.generated.SpaceShip getSpaceships(int index);
  /**
   * <code>repeated .mike.SpaceShip spaceships = 2;</code>
   */
  int getSpaceshipsCount();
  /**
   * <code>repeated .mike.SpaceShip spaceships = 2;</code>
   */
  java.util.List<? extends com.codeinvestigator.spacestation.generated.SpaceShipOrBuilder> 
      getSpaceshipsOrBuilderList();
  /**
   * <code>repeated .mike.SpaceShip spaceships = 2;</code>
   */
  com.codeinvestigator.spacestation.generated.SpaceShipOrBuilder getSpaceshipsOrBuilder(
      int index);
}
