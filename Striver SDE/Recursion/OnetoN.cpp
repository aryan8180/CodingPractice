#include<bits/stdc++.h>
using namespace std;

int cnt = 1;
void printNumber(int n){
    if(cnt>n){
        return;
    }
    cout << cnt << endl;
    cnt++;
    printNumber(n);
}

int main(){
    int n;
    cin >> n;
    printNumber(n);
}