package com.example.demo;

import com.example.demo.elements.Board;
import com.example.demo.elements.List;
import com.example.demo.elements.Status;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ListTest {
  public static void main(String[] args) throws ParseException {
    // Test the creation of a new list
    List list = new List("To Do");
    System.out.println("List created successfully.");

    // Test adding cards to the list
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date dueDate = dateFormat.parse("2024-02-20");
    list.addCard("Task 1", "Description for Task 1", dueDate, "User1, User2", Status.PENDING, new Board());
    list.addCard("Task 2", "Description for Task 2", dueDate, "User3", Status.IN_PROGRESS, new Board());

    // Test displaying cards in the list
    System.out.println("Cards in the list:");
    list.displayCards();

    // Test finding a card by ID
    int cardIdToFind = 2;
    System.out.println("Finding card by ID: " + cardIdToFind);
    if (list.findCard(cardIdToFind) != null) {
      System.out.println("Card found.");
    } else {
      System.out.println("Card not found.");
    }

    // Test updating a card
    int cardIdToUpdate = 1;
    String newTitle = "Updated Task";
    String newDescription = "Updated description for Task 1";
    Date newDueDate = dateFormat.parse("2024-02-25");
    String newAssignees = "User1, User2, User4";
    Status newStatus = Status.PENDING;
    System.out.println("Updating card with ID " + cardIdToUpdate);
    list.updateCard(cardIdToUpdate, newTitle, newDescription, newDueDate, newAssignees, newStatus);
    System.out.println("Cards after updating:");
    list.displayCards();

    // Test deleting a card
    int cardIdToDelete = 2;
    System.out.println("Deleting card with ID " + cardIdToDelete);
    list.deleteCard(cardIdToDelete);
    System.out.println("Cards after deletion:");
    list.displayCards();
  }
}
