#include<bits/stdc++.h>
using namespace std;

bool alphaNumeric(char c){
    if((c>='0' && c<='9') || (tolower(c) >= 'a' && tolower(c)<= 'z')){
        return true;
    }
    return false;
}

bool checkPalindrome(string s){
    int start = 0;
    int end = s.length()-1;
    while(start<end){
        if(alphaNumeric(!s[start])){
            start++;
            continue;
        }
        if(alphaNumeric(!s[end])){
            end--;
            continue;
        }
        if(tolower(s[start])!=tolower(s[end])){
            return false;
        }else{
            start++;
            end--;
        }
    }
    return true;
}

int main(){
    string str;
    cin >> str;
    checkPalindrome(str);
}