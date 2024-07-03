#include <stdio.h>

int main(void) {
    int t,n,count=0;
    scanf("%d",&t);
    for (int i = 1;i<=t;i++)
    { 
        scanf("%d",&n);
        int arr[n];
	}
        for(int j = 1; j<=n;j++){
            scanf("%d",&arr[j]);
            if (arr[j-1]>arr[j] && j>=1){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                if(arr[j-2]>arr[j-1] && j>=2){
                //int temp = arr[j-2];
                //arr[j-2] = arr[j-1];
                //arr[j-1] = temp;
                count+= 2;
                //printf("yes \n");
                }
                else if (j==1){
                    count+=1;
                    //printf("no \n");
                }
                else{
                    count+=1;
                    //printf("no \n");
                }
            }
        }
        if (count <2){
            printf("yes \n");
        }
        else{
            printf("no \n");
        }
    }
	// your code goes here
	return 0;
}

