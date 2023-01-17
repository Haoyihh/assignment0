package assignment0.src.Model;

public class HelloWorld {
    public static void main(String[] args) {
        int var1=2;
        double var2=21.2d;
        float var3=5.75f;
        String var4="Hello";
        Boolean var5=true;

        int[] arr=new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=6;
        arr[6]=8;
        arr[7]=10;
        arr[8]=8;
        arr[9]=5;



        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        for (int printArr:arr){
            System.out.println(printArr);
        }




    }
}




