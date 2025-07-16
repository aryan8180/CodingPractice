#include<bits/stdc++.h>
using namespace std;

void swap(int* n, int* m){
    int temp = *n;
    *n = *m;
    *m = temp;
}

int main(){
    int one = 1;
    int two = 2;
    cout << "BEFORE CHANGE" << endl;
    cout << "One is: " << one << endl;
    cout << "Two is: " << two << endl;
    swap(&one,&two); // Swapping the numbers, so sending the address the variables.
    cout << "AFTER CHANGE" << endl;
    cout << "One is: " << one << endl;
    cout << "Two is: " << two << endl;
}