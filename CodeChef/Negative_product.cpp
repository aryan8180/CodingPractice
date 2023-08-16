#include <iostream>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int a, b, c;
        cin >> a >> b >> c;
        if ((a * b) < 0 || (b * c) < 0 || (c * a) < 0)
        {
            cout << "YES" << endl;
        }
        else if ((a > 0 && b > 0 && c > 0) || ((a * b * c) < 0))
        {
            cout << "NO" << endl;
        }
        else if ((a == b == 0) || (b == c == 0) || (c == a == 0))
        {
            cout << "NO" << endl;
        }
        else
        {
            cout << "YES" << endl;
        }
    }
    return 0;
}