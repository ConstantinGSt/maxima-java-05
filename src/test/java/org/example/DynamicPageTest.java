package org.example;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DynamicPageTest {
    Cat cat = new Cat("Васька", 12);
    Cat cat1 = new Cat("Мурка", 5);

  public DynamicPageTest() throws IncorrectCatWeightException {
  }

  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }
}
