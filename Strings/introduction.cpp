#include <bits/stdc++.h>
using namespace std;

// \0 and \n take up 1 Byte each in memory.

int main() {
    char str[] = {'a', 'b', 'c', '\0'};
    cout << str << endl; // Constant pointer, prints the character array

    cout << strlen(str) << endl; // Prints the length of the string

    char str1[] = "oneplus"; // String literal (something whose value cannot be changed)

    char str2[100];

    cout << "Enter char array: " << endl;
    cin >> str2;  // Takes input until a space/newline

    cout << "Output: " << str2 << endl;
    // If input = "hello world", it will only print "hello"
    // Space is treated as a delimiter in `cin >> str2`

    // Using cin.getline to take full sentence input
    char str3[100];

    cout << "Enter a sentence: " << endl;
    cin.ignore(); // To clear any leftover newline from previous input
    cin.getline(str3, 100);

    cout << "You entered: ";
    for (int i = 0; str3[i] != '\0'; i++) {
        cout << str3[i];
    }
    cout << endl;

    return 0;
}
