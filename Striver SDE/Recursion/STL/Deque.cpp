#include<bits/stdc++.h>
using namespace std;

void explainDeque(){
    deque<int>d;
    d.push_back(1);
    d.push_back(2);
    d.emplace_back(4);

    for(auto i:d){
        cout << i << endl;
    }

    d.pop_back();
    d.pop_front();
    
    for(auto i:d){
        cout << i << endl;
    }
}

int main(){
    explainDeque();
}