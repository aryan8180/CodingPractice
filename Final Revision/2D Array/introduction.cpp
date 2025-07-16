#include<bits/stdc++.h>
using namespace std;

int searchElement(int arr[][3],int row,int col,int target){
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(arr[i][j]==target){
                return 1;
            }
        }
    }
    return false;
}

void sumRows(int arr[][3],int row,int col){
    for(int i=0;i<row;i++){
        int sum = 0;
        for(int j=0;j<col;j++){
            sum += arr[i][j];
        }
        cout << "Sum of " << i << " row is " << sum << endl;
    }
}

void largestSumRow(int arr[][3],int row,int col){
    int ans = 0;
    int rowIndex = -1;
    for(int i=0;i<row;i++){
        int sum = 0;
        for(int j=0;j<col;j++){
            sum += arr[i][j];
        }
        if(sum>ans){
            rowIndex = i;
            ans = sum;
        }
    }
    cout << "Largest sum row is " << ans << " of row " << rowIndex << endl;
}

int main(){
    int arr[3][3];
    
    cout << "Taking the input for the elements." << endl;
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            cin >> arr[i][j];
        }
    }
    
    cout << "Printing the output for the elements." << endl;
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            cout << arr[i][j] << " ";
        }cout << endl;
    }
    
    cout << "Taking the value to search in the 2D Array" << endl;
    int target;
    cin >> target;
    
    cout << "Searching..." << endl;
    if(searchElement(arr,3,3,target)){
        cout << "ELEMENT FOUND" << endl;
    }else{
        cout << "ELEMENT NOT FOUND" << endl;
    }
    cout << "Search completed." << endl;
    
    sumRows(arr,3,3);
    largestSumRow(arr,3,3);
}