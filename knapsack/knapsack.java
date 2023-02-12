//recursive function
int knapsack(wt[],val[],maxwt,n){
    if(n==0||w==0){
        return 0;
    }
    if(wt[n-1]<=w){
        return max(val[n-1]+knapsack(wt[],val[],w-w[n-1],n-1),knapsack(wt[],val[],w,n-1))
    }
    else if(wt[n-1]>w){
        return knapsack(wt[],val[],w,n-1)
    }
}
