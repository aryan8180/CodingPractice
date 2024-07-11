#include<bits/stdc++.h>
using namespace std;

int dataTypes(string type) {
	// Write your code here
	if((type=="Integer")||(type=="Float")){
		return 4;
	}else if((type=="Long")||(type=="Double")){
		return 8;
	}else{
		return 1;
	}
}

int main(){
    string type;
    cin >> type;
    cout << dataTypes(type);
}