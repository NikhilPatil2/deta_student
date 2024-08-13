package challenge;

public class mahesh {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,910};
        int c[]= new int[a.length+b.length];
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
            } else {
                c[k]=b[j];

            }
        }
        for(int ele: c){
            System.out.print(ele+" ");
        }

    }
}
