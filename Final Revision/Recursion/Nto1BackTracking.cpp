#include<bits/stdc++.h>
using namespace std;

void print(int s,int n){
    if(n>s){
        return;
    }
    print(s,n+1);
    cout << n << endl;
}

int main(){
    int n;
    cin >> n;
    print(n,1);
}