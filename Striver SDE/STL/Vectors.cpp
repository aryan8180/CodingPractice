#include<bits/stdc++.h>
using namespace std;

void explainVector(){
    vector<int>v;
    v.push_back(7);
    v.emplace_back(10);
    
    vector<pair<int,int>>vec;
    vec.push_back({1,2});
    vec.emplace_back(7,10);

    for(auto i:vec){
        cout << i.first << endl;
    }

    vector<int>s(5,7);
}

int main(){
    explainVector();
}