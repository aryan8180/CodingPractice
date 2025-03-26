#include<bits/stdc++.h>
using namespace std;

string check(string name){
    reverse(name.begin(),name.end());
    return name;
}

int main(){
    string name;
    cin >> name;
    string orignals = name;
    if(check(name)==orignals){
        cout << "YES, it's a Palindrome.";
    }else{
        cout << "NO, it's not a Palindrome.";
    }
}