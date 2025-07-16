#include<bits/stdc++.h>
using namespace std;

void print5(string name,int count){
    if(count == 5){
        return;
    }
    cout << name << endl;
    print5(name,count + 1);
}

int main(){
    string name;
    cin >> name;
    print5(name,0);
}