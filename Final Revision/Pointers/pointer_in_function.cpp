#include<bits/stdc++.h>
using namespace std;

void change(int* ptr){
    *ptr = 100;
}

int main(){
    int x = 10;
    cout << "BEFORE CHANGE" << endl;
    cout << x << endl;
    change(&x);
    cout << "AFTER CHANGE" << endl;
    cout << x << endl;
}