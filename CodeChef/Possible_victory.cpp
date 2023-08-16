#include <iostream>
using namespace std;

int main() {
	int r,o,c;
    cin>>r>>o>>c;
    int remaining_overs = 20-o;
    int chances = remaining_overs*6;
    int max_score = chances*6;
    int total_score = max_score+c;
    if(total_score>r){
        cout<<"YES"<<endl;
    }
    else{
        cout<<"NO"<<endl;
    }
	return 0;
}
