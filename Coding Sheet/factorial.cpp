#include<bits/stdc++.h>
using namespace std;

void factorial(int n){
    int answer = 1;
    for(int i = 1;i<=n;i++){
        answer*=i;
    }
    cout << answer;
}

int main(){
    int n;
    cin >> n;
    factorial(n);
}