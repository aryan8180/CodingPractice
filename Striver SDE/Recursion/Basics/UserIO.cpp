#include<iostream>
using namespace std;

int main() {
	// Write your code here
	char ch;
	cin >> ch;
	if(ch>='a' & ch<='z'){
		cout << 0 << endl;
	}else if(ch>='A' & ch<='Z'){
		cout << 1 << endl;
	}else{
		cout << -1 << endl;
	}
}
