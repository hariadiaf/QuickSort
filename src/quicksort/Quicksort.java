/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author Dell
 */
public class Quicksort {
    
    static void quickSort (int a[], int lo, int hi){
    //  lo adalah index bawah, hi adalah index atas
    //  dari bagian array yang akan di urutkan
        int i=lo, j=hi, h;
        int pivot=a[lo];

    //  pembagian
        do{
            while (a[i]<pivot) i++;
            while (a[j]>pivot) j--;
            if (i<=j)
            {
                h=a[i]; a[i]=a[j]; a[j]=h;//tukar
                i++; j--;
            }
        } while (i<=j);

    //  pengurutan=
        if (lo<j) quickSort(a, lo, j);
        if (i<hi) quickSort(a, i, hi);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int tabInt[]={9,4,7,1,5,3,10,20,15,17};
        int i,n=tabInt.length;
        System.out.print("data sebelum di urutkan\n");

            for(i=0;i<n;i++){
                System.out.print(tabInt[i]+ "  ,");
           }
            System.out.print("\n");
        quickSort(tabInt,0,n-1);
                System.out.print("\nsetelah di urutkan dengan quick sort\n");

        for(i=0;i<n;i++){
            System.out.print(tabInt[i]+" , ");
        }
        
    }
    
}
