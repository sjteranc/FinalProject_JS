package com.example.demo.elements;

public class Board {
  public List head;
  private int cardIdCounter; // Counter for generating unique card IDs

  public Board() {
    // Reference to the head of the list of lists
    head = null;
    cardIdCounter = 1;
  }

  public void addList(String name) {
    // Add a new list to the board
    List newList = new List(name);
    if (head == null) {
      head = newList;
    } else {
      List current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newList;
    }
  }

  // Display all the lists in the board
  public void displayLists() {
    List current = head;
    while (current != null) {
      System.out.println("================================================");
      System.out.println(current.name + ":");
      current.displayCards();
      System.out.println("================================================");
      current = current.next;
    }
  }

  // Getter for cardIdCounter
  public int getCardIdCounter() {
    return cardIdCounter;
  }

  // Increment the cardIdCounter
  public void incrementCardIdCounter() {
    cardIdCounter++;
  }

  // En la clase Board

  public List findList(String listName) {
    List current = head;
    while (current != null) {
      if (current.name.equals(listName)) {
        return current;
      }
      current = current.next;
    }
    // List not found
    return null;
  }

  public void deleteListByName(String listName) {
    List current = head;
    List prev = null;

    while (current != null) {
      if (current.name.equals(listName)) {
        if (prev == null) {
          head = current.next;
        } else {
          prev.next = current.next;
        }
        // List deleted
        return;
      }
      // Move to the next list
      prev = current;
      current = current.next;
    }
  }

  // Update the name of the list
  public void updateListByName(String oldListName, String newListName) {
    List listToUpdate = findList(oldListName);
    if (listToUpdate != null) {
      listToUpdate.name = newListName;
    } else {
      System.out.println("List not found.");
    }
  }

}
