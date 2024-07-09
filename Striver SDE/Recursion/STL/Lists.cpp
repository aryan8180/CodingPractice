#include<bits/stdc++.h>
using namespace std;

void explainList(){
    list<int>ls;
    ls.push_back(7);
    ls.push_back(10);
    ls.emplace_back(18);
    ls.push_front(1);
    // vector<int>::iterator i; --> Not necessary to mention this now when we have `auto`

    for(auto i:ls){
        cout << i << endl;
    }
}

int main(){
    explainList();
}