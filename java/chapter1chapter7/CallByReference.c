#include <stdio.h>

void swap(int *,int *);

int main() {
    int a = 10;
    int b = 5;

    swap(&a, &b);

}

void swap(int *a, int *b) {
    int temp;

    temp = *a;
    *a = *b;
    *b = temp;

}