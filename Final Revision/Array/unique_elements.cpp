#include<bits/stdc++.h>
using namespace std;

void unqElement(int arr[],int size){
    int element = 0;
    for(int i=0;i<size;i++){
        element = element ^ arr[i];
    }
    cout << element;
}

int main(){
    int size;
    cin >> size;

    int arr[1000];

    for(int i=0;i<size;i++){
        cin >> arr[i];
    }

    unqElement(arr,size);
}