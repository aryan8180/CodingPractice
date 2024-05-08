#include<bits/stdc++.h>
using namespace std;

int factorial(int n){
    int result = 1;
    while(n>0){
        result *= n;
        n = n-1;
    }
    return result;
}

int strongCheck(int n){
    int result = 0;
    while(n>0){
        int last_digit = n%10;
        factorial(last_digit);
        result += factorial(last_digit);
        n = n / 10;
    }
    return result;
}

int main(){
    int n;
    cin >> n;
    if(strongCheck(n)==n){
        cout << "Yes it is a strong number." << endl;
    }else{
        cout << "No it is not a strong number." << endl;
    }
}