package com.mavixk.maventest;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

public class MavenTest{
  private static Maventest maventest;

  @BeforeAll
  public static void setup(){
    maventest = new Maventest();
  }

  @Test
  public void testMaven(){
    assertTrue(maventest.printStats());
  }

}
