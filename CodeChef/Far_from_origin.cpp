#include <bits/stdc++.h>
using namespace std;

int main()
{
    // your code goes here
    int t;
    cin >> t;
    while (t--)
    {
        int x1, y1, x2, y2;
        cin >> x1 >> y1 >> x2 >> y2;
        int dist1 = sqrt(x1 * x1 + y1 * y1);
        int dist2 = sqrt(x2 * x2 + y2 * y2);
        if (dist1 > dist2)
        {
            cout << "ALEX" << endl;
        }
        else if (dist1 == dist2)
        {
            cout << "EQUAL" << endl;
        }
        else
        {
            cout << "BOB" << endl;
        }
    }
    return 0;
}
