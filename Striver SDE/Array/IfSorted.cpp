int isSorted(int n, vector<int> a) {
    // Write your code here.
    int count = 0;
    int s = 0;
    int d = s+1;
    while(d<a.size()){
        if(a[s++]>a[d++]){
            count++;
        }
    }
    if(count>0){
        return 0;
    }else{
        return 1;
    }
}
