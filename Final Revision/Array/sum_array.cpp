#include<bits/stdc++.h>
using namespace std;

int sumAll(int arr[],int size){
    int sum = 0;
    for(int i=0;i<size;i++){
        sum += arr[i];
    }
    return sum;
}

int main(){
    int size;
    cin >> size;

    int arr[1000];
    for(int i=0;i<size;i++){
        cin >> arr[i];
    }

    cout << "Sum of all elements is: " << sumAll(arr,size);
}