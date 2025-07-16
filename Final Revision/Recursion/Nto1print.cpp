#include<bits/stdc++.h>
using namespace std;

void print(int n,int one){
    if(n<one){
        return;
    }
    cout << n << endl;
    print(n-1,one);
}

int main(){
    int n;
    cin >> n;
    print(n,1);
}