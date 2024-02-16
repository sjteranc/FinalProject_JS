package com.example.demo.elements;

import java.text.SimpleDateFormat;
import java.util.Date;

public class List {
  public String name;
  public Card head;
  public Card tail;
  public List next;

  public List(String name) {
    this.name = name;
    this.head = null;
    this.tail = null;
    this.next = null;
  }


  public void addCard(String title, String description, Date dueDate, String assignees, Status status, Board board) {
    Card newCard = new Card(title, description, dueDate, assignees, status);
    // Set unique ID for the card
    newCard.setId(board.getCardIdCounter());
    // Increment the cardIdCounter for the next card
    board.incrementCardIdCounter();
    if (head == null) {
      head = newCard;
      tail = newCard;
    } else {
      tail.next = newCard;
      newCard.prev = tail;
      tail = newCard;
    }
  }

  // Display all the cards in the list
  public void displayCards() {
    Card current = head;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    while (current != null) {
      String formattedDate = dateFormat.format(current.getDueDate());
      System.out.println("ID: " + current.getId() + "\n Title: " + current.getTitle() + "\n Description: " + current.getDescription() +
          "\n Due Date: " + formattedDate + "\n Assignees: " + current.getAssignees() + "\n Status: " + current.getStatus());
      current = current.next;
    }
  }



  public Card findCard(int cardId) {
    Card current = head;
    while (current != null) {
      if (current.getId() == cardId) {
        return current;
      }
      current = current.next;
    }
    // Card not found
    return null;
  }

  // Delete a card from the list
  // The card is identified by its unique ID
  public void deleteCard(int cardId) {
    Card cardToDelete = findCard(cardId);
    if (cardToDelete != null) {
      if (cardToDelete.prev != null) {
        cardToDelete.prev.next = cardToDelete.next;
      } else {
        head = cardToDelete.next;
      }
      if (cardToDelete.next != null) {
        cardToDelete.next.prev = cardToDelete.prev;
      } else {
        tail = cardToDelete.prev;
      }
      System.out.println("Card with ID " + cardId + " deleted successfully.");
    } else {
      System.out.println("Card with ID " + cardId + " not found.");
    }
  }

  // Update a card in the list
  public void updateCard(int cardId, String title, String description, Date dueDate, String assignees, Status status) {
    Card cardToUpdate = findCard(cardId);
    if (cardToUpdate != null) {
      cardToUpdate.setTitle(title);
      cardToUpdate.setDescription(description);
      cardToUpdate.setDueDate(dueDate);
      cardToUpdate.setAssignees(assignees);
      cardToUpdate.setStatus(status);
      System.out.println("Card with ID " + cardId + " updated successfully.");
    } else {
      System.out.println("Card with ID " + cardId + " not found.");
    }
  }


}
