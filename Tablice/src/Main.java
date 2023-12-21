public class Main {
    public static void main(String[] args) {

        int[] tabOne = {2, 5, 5};
        int[] tabTwo = {7, 8, 4,5};

        sumTab(tabOne,tabTwo);



    }


    public static void sumTab(int[] a, int[] b) {

            int[]x;
            if(a.length>b.length){
                x=a;
            }else{
                x=b;
            }
            int result = 0;
            int i = 0;
            while (i <= (x.length - 1)) {

                int equal1 = (a[i] + a[i+1]);
                int equal2 = (b[i]+b[i+1]);
                i++;
                result = result + equal1 +equal2;
            }
        System.out.println(result);
    }
}