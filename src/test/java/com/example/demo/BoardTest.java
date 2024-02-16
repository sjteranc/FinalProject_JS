package com.example.demo;

import com.example.demo.elements.Board;

public class BoardTest {
  public static void main(String[] args) {
    // Test the creation of a new board
    Board board = new Board();
    System.out.println("Board created successfully.");

    // Test adding lists to the board
    board.addList("To Do");
    board.addList("Doing");
    board.addList("Done");

    // Test displaying lists
    System.out.println("Lists on the board:");
    board.displayLists();

    // Test finding a list by name
    String listNameToFind = "Doing";
    System.out.println("Finding list by name: " + listNameToFind);
    if (board.findList(listNameToFind) != null) {
      System.out.println("List found.");
    } else {
      System.out.println("List not found.");
    }

    // Test updating a list name
    String oldListName = "Doing";
    String newListName = "In Progress";
    System.out.println("Updating list name from \"" + oldListName + "\" to \"" + newListName + "\"");
    board.updateListByName(oldListName, newListName);
    System.out.println("Lists after updating:");
    board.displayLists();

    // Test deleting a list
    String listToDelete = "In Progress";
    System.out.println("Deleting list: " + listToDelete);
    board.deleteListByName(listToDelete);
    System.out.println("Lists after deletion:");
    board.displayLists();
  }
}
