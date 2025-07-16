#include<bits/stdc++.h>
using namespace std;

void print5(string name,int count){
    while(count<5){
        cout << name << endl;
        count ++;
    }
}

int main(){
    string name;
    cin >> name;
    int count = 0;
    print5(name,count);
}