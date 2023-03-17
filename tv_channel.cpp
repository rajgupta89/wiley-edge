#include <bits/stdc++.h>
using namespace std;
int solve(int n, int k){
    int count=0;
    int sum=0;
    for(int i=0;i<n;i++){
      count++;
    }
    sum=count%3/5;
    return n>1?(solve(n-1,k)+k-1)%n+1:1;
}
int main(){
    int n,k;
    cin>>n>>k;
    cout<<solve(n,k);
    return 0;
}

