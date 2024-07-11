#include<bits/stdc++.h>
using namespace std;

int cnt = 0;
void check(){
    if(cnt==3){
        return;
    }
    cout << cnt << endl;
    cnt++;
    check();
}

int main(){
    check();
}