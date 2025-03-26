// Reverse a string

// Reversing a String
// #include<bits/stdc++.h>
// using namespace std;

// int main(){
//     string name;
//     cin >> name;
//     int start = 0;
//     int end = name.length()-1;
//     while(start<end){
//         swap(name[start],name[end]);
//         start++;
//         end--;
//     }
//     cout << name;
// }

// Reversing a character array
#include<bits/stdc++.h>
using namespace std;

int main(){
    char str[] = "honey";
    int start = 0;
    int end = strlen(str)-1;
    while(start<end){
        swap(str[start],str[end]);
        start++;
        end--;
    }
    cout << str << endl;
}

