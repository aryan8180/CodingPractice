//Finding the sum of n elements using recursion
#include<bits/stdc++.h>
using namespace std;

void sum(int n, int total){  // This is Parameterised Function
    if(n<1){
        cout << total << endl;
        return;
    }
    sum(n-1,total+n);
}

int main(){
    int n;
    cin >> n;
    sum(n,0);
}

// Factorial of N using Recursion
#include<bits/stdc++.h>
using namespace std;

int factorial(int n){
    if(n==1 || n==0){  // Functional Recursion
        return 1;
    }
    return n * factorial(n-1);
}

int main(){
    int n;
    cin >> n;
    cout << factorial(n);
}