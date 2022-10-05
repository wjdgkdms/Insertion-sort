   int A[] = {18, 5, 21, 2, 7};
      int min = 0;
      int temp;
      
      for(int i=0; i<A.length; i++) {
      System.out.print(A[i]+" ");
      }
      
      for(int j=0; j<A.length; j++) {
         min = j;
         for(int i = j; i<A.length; i++) {
            if(A[i]<A[min]) {
               min = i;
         }
      }
         //A[min]과 a[j]번째 교환작업
          temp = A[j];
         A[j] = A[min];
         A[min] = temp;
         System.out.println("");
         for(int i =0; i<A.length; i++) {
            System.out.print(A[i]+" ");
         }
         
         
         
      }   
