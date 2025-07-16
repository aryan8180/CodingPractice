#include<bits/stdc++.h>
using namespace std;

void print(int start, int n){
    if(start>n){
        return;
    }
    cout << start << endl;
    print(start + 1,n);
}

int main(){
    int n;
    cin >> n;
    print(1,n);
}