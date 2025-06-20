int firstElement(vector<int>& arr,int n,int x){
	int start = 0;
	int end = arr.size()-1;

	int mid = start + (end-start)/2;
	int ans = -1;
	while(start<=end){
		if(arr[mid]==x){
			ans = mid;
			end = mid - 1;
		}else if(arr[mid]<x){
			start = mid + 1;
		}else if(arr[mid]>x){
			end = mid - 1;
		}
		mid = start + (end-start)/2;
	}
	return ans;
}

int lastElement(vector<int>& arr,int n,int x){
	int start = 0;
	int end = arr.size()-1;

	int mid = start + (end-start)/2;
	int ans = -1;
	while(start<=end){
		if(arr[mid]==x){
			ans = mid;
			start = mid + 1;
		}else if(arr[mid]<x){
			start = mid + 1;
		}else if(arr[mid]>x){
			end = mid - 1;
		}
		mid = start + (end-start)/2;
	}
	return ans;
}


int count(vector<int>& arr, int n, int x) {
	// Write Your Code Here
	int first_index = firstElement(arr,n,x);
	int last_index = lastElement(arr,n,x);
	if(first_index==-1 && last_index==-1){
		return 0;
	}
	return last_index - first_index + 1;
	
}
