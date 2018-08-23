#include <stdio.h>

void swap(int p1, int p2) {
	int p;
	p =p1;
	p1 = p2;
	p2 = p;
}

int main() {
	int a=5, b=10;
	printf("test");
	swap(&a, &b);
	printf("test");
	printf("%d, %d", a, b);
	printf("test");
	return 0;
}
