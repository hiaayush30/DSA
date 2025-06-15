#include <stdio.h>
#include <stdbool.h> // For true/false

#define MAX_STACK_SIZE 10

int stack[MAX_STACK_SIZE];
int top = -1; // 'top' indicates the index of the top element

// Function to check if the stack is empty
bool isStackEmpty() {
    return (top == -1);
}

// Function to check if the stack is full
bool isStackFull() {
    return (top == MAX_STACK_SIZE - 1);
}

// Function to add an element to the stack
void push(int data) {
    if (isStackFull()) {
        printf("Stack Overflow! Cannot push %d. Stack is full.\n", data);
    } else {
        top++;
        stack[top] = data;
        printf("Pushed: %d\n", data);
    }
}

// Function to remove and return the top element from the stack
int pop() {
    if (isStackEmpty()) {
        printf("Stack Underflow! Cannot pop. Stack is empty.\n");
        return -1; // Indicate error or empty stack
    } else {
        int data = stack[top];
        top--;
        printf("Popped: %d\n", data);
        return data;
    }
}

// Function to return the top element without removing it
int peek() {
    if (isStackEmpty()) {
        printf("Stack is empty. No element to peek.\n");
        return -1; // Indicate error or empty stack
    } else {
        printf("Peeked: %d\n", stack[top]);
        return stack[top];
    }
}

// Function to display stack elements
void displayStack() {
    if (isStackEmpty()) {
        printf("Stack: [Empty]\n");
        return;
    }
    printf("Stack (Top to Bottom): [");
    for (int i = top; i >= 0; i--) {
        printf("%d", stack[i]);
        if (i > 0) {
            printf(", ");
        }
    }
    printf("]\n");
}

int main_stack() {
    printf("--- Stack Implementation ---\n");

    displayStack();

    push(10);
    push(20);
    push(30);
    displayStack();

    peek();

    pop();
    displayStack();

    push(40);
    push(50);
    push(60);
    push(70);
    push(80);
    push(90);
    push(100); // Should fill the stack
    push(110); // Should cause overflow

    displayStack();

    pop();
    pop();
    pop();
    pop();
    pop();
    pop();
    pop();
    pop();
    pop(); // Pop all elements
    pop(); // Try to pop from empty stack

    displayStack();

    return 0;
}