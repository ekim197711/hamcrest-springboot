// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbook.proto

package com.example.tutorial;

public interface AddressBookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tutorial.AddressBook)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tutorial.Person people = 1;</code>
   */
  java.util.List<com.example.tutorial.Person> 
      getPeopleList();
  /**
   * <code>repeated .tutorial.Person people = 1;</code>
   */
  com.example.tutorial.Person getPeople(int index);
  /**
   * <code>repeated .tutorial.Person people = 1;</code>
   */
  int getPeopleCount();
  /**
   * <code>repeated .tutorial.Person people = 1;</code>
   */
  java.util.List<? extends com.example.tutorial.PersonOrBuilder> 
      getPeopleOrBuilderList();
  /**
   * <code>repeated .tutorial.Person people = 1;</code>
   */
  com.example.tutorial.PersonOrBuilder getPeopleOrBuilder(
      int index);
}
