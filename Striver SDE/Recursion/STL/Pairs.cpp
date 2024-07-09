#include<bits/stdc++.h>
using namespace std;

void explainPair(){
    pair<int,int> p = {2,4};           // For 2 Numbers
    cout << p.first << " " << p.second << endl;

    pair<int,pair<int,int>> t = {4,{8,12}};             // For more than 2 Numbers
    cout << t.first << " " << t.second.first << " " << t.second.second << endl;

    pair<int,int>arr[] = {{1,2},{2,3},{3,4}};
    cout << arr[2].second << endl;
}

int main(){
    explainPair();
}