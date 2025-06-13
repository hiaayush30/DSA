// Doubly Linked List
#include <stdio.h>
#include <stdlib.h> // For malloc and free

// Define the structure for a Doubly Linked List Node
struct Node {
    int data;
    struct Node* next; // Pointer to the next node
    struct Node* prev; // Pointer to the previous node
};

// Global pointers for the head and tail of the list
struct Node* head = NULL;
struct Node* tail = NULL;

// Function to create a new node
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Memory allocation failed!\n");
        exit(1); // Exit if memory allocation fails
    }
    newNode->data = data;
    newNode->next = NULL;
    newNode->prev = NULL;
    return newNode;
}

// Function to insert a node at the beginning of the list
void insertAtBeginning(int data) {
    struct Node* newNode = createNode(data);
    if (head == NULL) { // If list is empty
        head = newNode;
        tail = newNode;
    } else {
        newNode->next = head;
        head->prev = newNode;
        head = newNode;
    }
    printf("Inserted %d at the beginning.\n", data);
}

// Function to insert a node at the end of the list
void insertAtEnd(int data) {
    struct Node* newNode = createNode(data);
    if (tail == NULL) { // If list is empty
        head = newNode;
        tail = newNode;
    } else {
        newNode->prev = tail;
        tail->next = newNode;
        tail = newNode;
    }
    printf("Inserted %d at the end.\n", data);
}

// Function to delete a node from the beginning of the list
void deleteFromBeginning() {
    if (head == NULL) {
        printf("List is empty. Cannot delete from beginning.\n");
        return;
    }
    struct Node* temp = head;
    printf("Deleting %d from the beginning.\n", temp->data);
    if (head == tail) { // If there's only one node
        head = NULL;
        tail = NULL;
    } else {
        head = head->next;
        head->prev = NULL;
    }
    free(temp); // Free the memory of the deleted node
}

// Function to delete a node from the end of the list
void deleteFromEnd() {
    if (tail == NULL) {
        printf("List is empty. Cannot delete from end.\n");
        return;
    }
    struct Node* temp = tail;
    printf("Deleting %d from the end.\n", temp->data);
    if (head == tail) { // If there's only one node
        head = NULL;
        tail = NULL;
    } else {
        tail = tail->prev;
        tail->next = NULL;
    }
    free(temp); // Free the memory of the deleted node
}

// Function to print the list from head to tail (forward)
void printForward() {
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }
    struct Node* current = head;
    printf("List (forward): ");
    while (current != NULL) {
        printf("%d <-> ", current->data);
        current = current->next;
    }
    printf("NULL\n");
}

// Function to print the list from tail to head (backward)
void printBackward() {
    if (tail == NULL) {
        printf("List is empty.\n");
        return;
    }
    struct Node* current = tail;
    printf("List (backward): ");
    while (current != NULL) {
        printf("%d <-> ", current->data);
        current = current->prev;
    }
    printf("NULL\n");
}

// Main function to demonstrate the doubly linked list operations
int main() {
    printForward(); // List is empty initially

    insertAtBeginning(10);
    insertAtEnd(20);
    insertAtBeginning(5);
    insertAtEnd(25);
    printForward();
    printBackward();

    deleteFromBeginning();
    printForward();

    deleteFromEnd();
    printForward();
    printBackward();

    insertAtBeginning(1);
    insertAtEnd(100);
    printForward();

    deleteFromBeginning();
    deleteFromEnd();
    printForward(); // Should be empty again

    deleteFromBeginning(); // Try to delete from empty list

    return 0;
}