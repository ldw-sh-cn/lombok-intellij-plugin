package de.plushnikov.superbuilder;

import lombok.experimental.SuperBuilder;
import java.util.List;

public class SuperBuilderSimple {

  @SuperBuilder
  public static class Parent {
    int field1;
    List<String> items;
  }

  @SuperBuilder
  public static class Child extends Parent {
    double field3;
  }

  public static void test() {
    Child x = Child.builder().field3(0.0).field1(5).item("").build();
  }
}
