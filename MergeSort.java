public class MergeSort{
  
    static int arr[] = {-1,-9,-1,-5,-20,-10,-16};
   // static int arr[] = {15,15,15,15,15,15};
  public static void main(String []args){
   
    //***********View Non-Sorted Array**********//
    for(int i= 0;i<arr.length;i++){
      System.err.print(arr[i]+", ");
    }
    System.err.println();
    
    //***********Calling MergeSort****//
    mergeSort(arr);
    
    //***********View Sorted Array**********//
    for(int i= 0;i<arr.length;i++){
      System.out.print(arr[i]+", ");
    }
  }
  
  public static int [] mergeSort(int [] temp){
    int n=temp.length;
    int L1[]=null;
    int L2[]=null;
    if(n>1){
      int m=(n/2);
      L1= new int[m]; //Making two divided list...
      for(int i= 0;i<L1.length;i++){
        L1[i]=temp[i];
      }
      L2= new int[n-m]; //Making two divided list...
      for(int i= 0;i<L2.length;i++){
        L2[i]=temp[i+m];
      }
      //Now recursively calling mergesort...
      //Merging the sorted lists...
      temp=merge(mergeSort(L1),mergeSort(L2));
    }
   arr=temp; //Replacing old non-sorted array... 
    return arr ;
  }
  public  static int [] merge(int a[] , int b[]){
  
    int c[]=new int[a.length+b.length];
    int l=0;//for array a
    int r=0;//for array b
    int j=0;
  
    while(l<a.length && r<b.length){
      if(a[l]<b[r]){ 
        c[j]=a[l];
        l++;
        j++;
      }
      else if(a[l]>b[r]){
        c[j]=b[r];
        r++;
        j++;
      }
      else if(a[l]==b[r])
      {
       c[j]=a[l];
       l++;
       j++;
    }
    }
    if(r==b.length){  
      for(int k=l;k<a.length;k++){
        c[j]=a[k];
        j++;
      }
    }
    else if(l==a.length){
      for(int k=r;k<b.length;k++){
        c[j]=b[k];
        j++;
      }
    }
     return c;
   
}

}
