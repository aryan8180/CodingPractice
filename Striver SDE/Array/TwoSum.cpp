#include<bits/stdc++.h>
using namespace std;

string read(int n, vector<int> book, int target)
{
    
    for(int i = 0; i < n-1; i++){
        for(int j = i+1; j < n; j++){
            if(book[i]+book[j]==target){
                return "YES";
            }
        }
    }
    return "NO";
}

int main(){
    int n;
    cin >> n;
    int target;
    cin >> target;
    vector<int>book(n);
    for(int i = 0;i<n;i++){
        cin >> book[i];
    }
    string ans = read(n,book,target);
    cout << ans << endl;
    return 0;
}