# Agile Grid Application

## What is this project?

This project is a simple implementation of an Agile Board, similar to tools like Trello or Jira. It's a console-based Java application that allows users to create lists, add cards to these lists, and manage them. Each card can have a title, description, due date, assignees, and status.

## What is it for?

The Agile Grid Application is designed to help teams manage their work in a flexible and efficient way. It provides a visual overview of the current work items, their status, and who's working on them.

## What data structures does it use?

The application uses Linked Lists as its primary data structure. 

## Where does it use them?

Linked Lists are used in two main places:

1. In the `Board` class, a Linked List of `List` objects is maintained. Each `List` represents a list on the board.
2. In the `List` class, a Linked List of `Card` objects is maintained. Each `Card` represents a card in the list.

## Why do we use these data structures?

Linked Lists are used because they provide efficient operations for the use case of this application. Adding a new card or list, deleting a card or list, and updating a card or list can all be done in constant time, assuming we have a reference to the node we're operating on.

## What is their application?

In the context of this application, Linked Lists are used to represent the lists on the board and the cards within those lists. This allows for efficient manipulation of these entities, which is crucial for the functionality of the application.

## Why did we decide to use them?

We decided to use Linked Lists because they provide the necessary functionality for this application with good performance characteristics. The nature of the operations performed on the lists and cards (addition, deletion, update) are well-suited to a Linked List data structure.

## Advantages and Disadvantages

Advantages of using Linked Lists:

1. Dynamic size: Linked Lists can easily grow and shrink at runtime.
2. Efficient insertions/deletions: Inserting or deleting a node in a Linked List is a fast operation.

Disadvantages of using Linked Lists:

1. Random access is not efficient: Unlike arrays, we cannot access elements of a Linked List in constant time.
2. Extra memory overhead: Each node in a Linked List requires extra storage for pointers to the next (and previous, in case of doubly linked list) elements.
