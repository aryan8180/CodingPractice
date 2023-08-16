#include <iostream>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--){
        int x,y,total_time;
        cin>>x>>y;
        total_time = y-x;
        cout<<total_time<<endl;
    }
	return 0;
}