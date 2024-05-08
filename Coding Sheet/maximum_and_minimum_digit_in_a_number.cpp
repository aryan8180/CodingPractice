#include<bits/stdc++.h>
using namespace std;

int largestNumber(int n){
    int result = 0;
    while(n>0){
        int last_digit = n%10;
        n = n / 10;
        if(last_digit > result){
            result = last_digit;
        }
    }
    return result;
}

int smallestNumber(int n){
    int result = 100;
    while(n>0){
        int last_digit = n % 10;
        n = n /10;
        if(last_digit < result){
            result = last_digit;
        }
    }
    return result;
}

int main(){
    int n;
    cin >> n;
    cout << "Largest digit is " << largestNumber(n) << endl;
    cout << "Smallest digit is " << smallestNumber(n) << endl;
}