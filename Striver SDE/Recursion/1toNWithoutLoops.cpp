#include <iostream>
#include <vector>
using namespace std;

vector<string> printNTimes(int n) {
    vector<string> result;
    if (n < 1) {
        return result; // Empty vector when n < 1
    }
    
    result = printNTimes(n - 1);
    result.push_back("Coding Ninjas");
    
    return result;
}

int main() {
    int n;
    cin >> n;
    vector<string> ans = printNTimes(n);
    for (const auto& s : ans) {
        cout << s << endl;
    }
    return 0;
}
