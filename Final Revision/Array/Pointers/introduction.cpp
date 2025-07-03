#include<bits/stdc++.h>
using namespace std;

int main(){
    int value = 5;
    int* ptr = &value;
    
    cout << value << endl; // Directly prints the value 5 in the output
    cout << ptr << endl; // Prints the address of ptr as it stores the address of value
    cout << *ptr << endl; // Prints the value of ptr as we have * attached to ptr i.e. value at ptr
    cout << &value << endl; // & means address of, and &value determines the address of value
}