#include <stdio.h>
#include <stdbool.h> // For true/false

#define MAX_QUEUE_SIZE 5 // Small size for easy demonstration

int queue[MAX_QUEUE_SIZE];
int front = -1; // Index of the front element
int rear = -1;  // Index of the rear element
int current_size = 0; // Number of elements currently in the queue

// Function to check if the queue is empty
bool isQueueEmpty() {
    return (current_size == 0);
}

// Function to check if the queue is full
bool isQueueFull() {
    return (current_size == MAX_QUEUE_SIZE);
}

// Function to add an element to the queue
void enqueue(int data) {
    if (isQueueFull()) {
        printf("Queue Overflow! Cannot enqueue %d. Queue is full.\n", data);
    } else {
        if (isQueueEmpty()) { // First element being added
            front = 0;
        }
        rear = (rear + 1) % MAX_QUEUE_SIZE; // Circular increment
        queue[rear] = data;
        current_size++;
        printf("Enqueued: %d\n", data);
    }
}

// Function to remove and return the front element from the queue
int dequeue() {
    if (isQueueEmpty()) {
        printf("Queue Underflow! Cannot dequeue. Queue is empty.\n");
        return -1; // Indicate error
    } else {
        int data = queue[front];
        front = (front + 1) % MAX_QUEUE_SIZE; // Circular increment
        current_size--;
        if (current_size == 0) { // If queue becomes empty after dequeue
            front = -1;
            rear = -1;
        }
        printf("Dequeued: %d\n", data);
        return data;
    }
}

// Function to return the front element without removing it
int peekQueue() {
    if (isQueueEmpty()) {
        printf("Queue is empty. No element to peek.\n");
        return -1; // Indicate error
    } else {
        printf("Peeked: %d\n", queue[front]);
        return queue[front];
    }
}

// Function to display queue elements
void displayQueue() {
    if (isQueueEmpty()) {
        printf("Queue: [Empty]\n");
        return;
    }
    printf("Queue (Front to Rear): [");
    int count = 0;
    int i = front;
    while (count < current_size) {
        printf("%d", queue[i]);
        i = (i + 1) % MAX_QUEUE_SIZE;
        count++;
        if (count < current_size) {
            printf(", ");
        }
    }
    printf("]\n");
}

int main_queue() {
    printf("\n--- Queue Implementation ---\n");

    displayQueue();

    enqueue(10);
    enqueue(20);
    enqueue(30);
    displayQueue();

    peekQueue();

    dequeue();
    displayQueue();

    enqueue(40);
    enqueue(50); // Should fill the queue
    displayQueue();

    enqueue(60); // Should cause overflow
    displayQueue();

    dequeue();
    dequeue();
    dequeue();
    dequeue(); // Dequeue all elements
    displayQueue();

    dequeue(); // Try to dequeue from empty queue

    return 0;
}