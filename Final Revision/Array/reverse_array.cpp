#include<bits/stdc++.h>
using namespace std;

void revArray(int arr[],int size){
    int first = 0;
    int second = size-1;
    while(first<second){
        swap(arr[first],arr[second]);
        first++;
        second--;
    }
}

int main(){
    int size;
    cin >> size;

    int arr[1000];
    for(int i=0;i<size;i++){
        cin >> arr[i];
    }

    revArray(arr,size);
    for(int i=0;i<size;i++){
        cout << arr[i] << " ";
    }cout << endl;
}