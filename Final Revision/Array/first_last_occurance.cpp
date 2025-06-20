#include<bits/stdc++.h>
using namespace std;

int firstElement(int arr[],int size,int key){
    int left = 0;
    int right = size-1;

    int mid = left + (right-left)/2;
    int ans = -1;

    while(left<=right){
        if(arr[mid]==key){
            ans = mid;
            right = mid - 1;
        }else if(key>arr[mid]){ // Right me jana hai
            left = mid + 1;
        }else if(key<arr[mid]){ // Left me jana hai
            right = mid - 1;
        }
        mid = left + (right-left)/2;
    }
    return ans;
}

int lastElement(int arr[],int size,int key){
    int left = 0;
    int right = size-1;

    int mid = left + (right-left)/2;
    int ans = -1;

    while(left<=right){
        if(arr[mid]==key){
            ans = mid;
            left = mid + 1;
        }else if(key>arr[mid]){ // Right me jana hai
            left = mid + 1;
        }else if(key<arr[mid]){ // Left me jana hai
            right = mid - 1;
        }
        mid = left + (right-left)/2;
    }
    return ans;
}

int main(){
    int size;
    cin >> size;

    int arr[size];

    for(int i=0;i<size;i++){
        cin >> arr[i];
    }

    int key;
    cin >> key;

    cout << "First Occurance is " << firstElement(arr,size,key) << " , and Last Occurance is " << lastElement(arr,size,key);
}