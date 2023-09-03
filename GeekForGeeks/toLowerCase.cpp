#include <bits/stdc++.h>
using namespace std;

string toLower(string S)
{
    // code here
    for (int i = 0; i < S.size(); i++)
    {
        if (S[i] >= 'A' || S[i] <= 'Z')
        {
            S[i] = S[i] - 'A' + 'a';
        }
        else
        {
            S[i] = S[i];
        }
    }
    return S;
}

int main()
{
    string S;
    cin >> S;
    cout << toLower(S);
}
