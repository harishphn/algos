// Shashank Jain
#include<iostream>
#include<cstdio>
#include<cstring>
#include<algorithm>
 
#define LIM 100001 
 
using namespace std;
 
int arr[LIM]; // Input Array
int LR[LIM]; // maximum from Left to Right
int RL[LIM]; // maximum from Right to left
int max_val[LIM]; // number of subarrays(windows) will be n-k+1
 
int main()
{
 
    int n,w,i,k;   // 'n' is number of elements in array and 'w' is Window's Size 
    cin>>n>>w;
 
    k=n-w+1; // 'K' is number of Windows
 
	for(i=1;i<=n;i++)
                cin>>arr[i];
 
    for(i=1;i<=n;i++) // for maximum Left to Right
    {
            if(i%w==1)
                    LR[i]=arr[i];
            else
                    LR[i]=max(LR[i-1],arr[i]);
 
	}
 
	for(i=n;i>=1;i--) // for maximum Right to Left
    {
        if(i%w==0 || i==n )
                RL[i]=arr[i];
        else
                RL[i]=max(RL[i+1],arr[i]);
    }
 
    for(i=1;i<=k;i++)    // maximum
        max_val[i]=max(RL[i],LR[i+w-1]);
 
    for(i=1;i<=k;i++)
        	cout<<max_val[i]<<" ";
 
	cout<<endl; 
	return 0;
}  
