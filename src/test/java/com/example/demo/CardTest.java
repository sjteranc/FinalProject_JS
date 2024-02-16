package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.elements.Card;
import com.example.demo.elements.Status;

public class CardTest {

  private Card card;

  @BeforeEach
  public void setUp() {
    // Creating a new Card instance with test data for each test
    card = new Card("Test Title", "Test Description", new Date(), "Assignee1, Assignee2", Status.PENDING);
  }

  // Test to verify setting and getting the ID of the card
  @Test
  public void testId() {
    card.setId(10);
    assertEquals(10, card.getId());
  }

  // Test to verify setting and getting the title of the card
  @Test
  public void testTitle() {
    assertEquals("Test Title", card.getTitle());
    card.setTitle("New Title");
    assertEquals("New Title", card.getTitle());
  }

  // Test to verify setting and getting the description of the card
  @Test
  public void testDescription() {
    assertEquals("Test Description", card.getDescription());
    card.setDescription("New Description");
    assertEquals("New Description", card.getDescription());
  }

  // Test to verify setting and getting the due date of the card
  @Test
  public void testDueDate() {
    Date newDate = new Date();
    card.setDueDate(newDate);
    assertEquals(newDate, card.getDueDate());
  }

  // Test to verify setting and getting the assignees of the card
  @Test
  public void testAssignees() {
    assertEquals("Assignee1, Assignee2", card.getAssignees());
    card.setAssignees("New Assignee");
    assertEquals("New Assignee", card.getAssignees());
  }

  // Test to verify default values are set properly when creating a new card instance
  @Test
  public void testDefaultValues() {
    Card newCard = new Card("", "", null, "", null);
    assertEquals(-1, newCard.getId());
    assertEquals("", newCard.getTitle());
    assertEquals("", newCard.getDescription());
    assertNull(newCard.getDueDate());
    assertEquals("", newCard.getAssignees());
    assertNull(newCard.getStatus());
  }
}