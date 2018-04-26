#include <iostream>

int main() {
    int sum = 0;
    char test = '*';

    while (std::cin >> sum) {
        std::cout << sum << "  "<< test << std::endl;
    }

    return 0;
}