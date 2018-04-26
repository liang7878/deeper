#include <iostream>

int main() {
    int curral = 0, val =0;

    if(std::cin >> curral) {
        int count = 1;
        while(std::cin >> val) {
            if(curral == val) {
                count++;
            } else {
                std::cout << "count of " << curral << "is " << count << std::endl;
                curral = val;
                count = 1;
            }
        }

        std::cout << "count of " << curral << "is " << count << std::endl;
    }

    return 0;
}