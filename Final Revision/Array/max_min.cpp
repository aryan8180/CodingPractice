#include<bits/stdc++.h>
using namespace std;

void maxN(int arr[],int size){
    int maxNum = INT_MIN;
    for(int i=0;i<size;i++){
        if(arr[i]>maxNum){
            maxNum = arr[i];
        }
    }
    cout << "Maximum number is: " << maxNum << endl;
}

void minN(int arr[],int size){
    int minNum = INT_MAX;
    for(int i=0;i<size;i++){
        if(arr[i]<minNum){
            minNum = arr[i];
        }
    }
    cout << "Minimum number is: " << minNum << endl;
}

int main(){
    int arr[5];
    for(int i=0;i<5;i++){
        cin >> arr[i];
    }

    maxN(arr,5);
    minN(arr,5);
}