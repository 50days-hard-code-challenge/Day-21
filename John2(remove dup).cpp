int removeDuplicates(vector<int> &arr, int n) {

    // Write your code here.

    int i=0,index=1;

    for(int j=1;j<n;j++){

        if(arr[j]!=arr[j-1]){

            index+=i+1;

        }

    }

    return index;

}
