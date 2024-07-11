#include<bits/stdc++.h>
using namespace std;

int cnt = 1;
void printNumber(int n){
    if(n<cnt){
        return;
    }
    cout << n << endl;
    n--;
    printNumber(n);
}

int main(){
    int n;
    cin >> n;
    printNumber(n);
}