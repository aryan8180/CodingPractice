#include<bits/stdc++.h>
using namespace std;

bool checkPalindrome(string s,int start,int lgth){
    if(start>lgth){
        return true;
    }
    if(s[start]!=s[lgth]){
        return false;
    }
    return checkPalindrome(s,start+1,lgth-1);
    
}

int main(){
    string s;
    cin >> s;
    int lgth = s.length()-1;
    cout << checkPalindrome(s,0,lgth);
}