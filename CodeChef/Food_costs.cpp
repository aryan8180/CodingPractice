#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int x,y;
	cin >> x >> y;
	int weekly_cost = 6*x;
	int weekend_cost = y;
	int total_expense = weekly_cost + weekend_cost;
	cout << total_expense;
}
