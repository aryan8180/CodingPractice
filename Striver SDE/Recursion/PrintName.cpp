#include<bits/stdc++.h>
using namespace std;

int cnt = 1;
void printName(int n){
    if(cnt>n){
        return;
    }
    cout << "Aryan" << endl;
    cnt++;
    printName(n);
}

int main(){
    int n;
    cin >> n;
    printName(n);
}