#include<bits/stdc++.h>
using namespace std;

void explainStack(){
    stack<int>s;
    s.push(1);
    s.push(2);
    s.emplace(3);

    cout << s.top() << endl;
    s.pop();
    cout << s.size();
}

int main(){
    explainStack();
}