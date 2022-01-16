public class Array03 {
    public static void main(String[] args) {
        int[] x = new int[10];
        x[0] =8;
        x[1] =33;
        x[2] =200;
        x[3] =150;
        x[4] =11;
        x[5] =88;
        x[6] =x[2] * 10;
        x[7] =x[2] / 10;
        x[8] =x[0] + x[1] +x[2];
        x[9] =x[8];
    System.out.println("El array x contine los siguientes elemntos: " );

    for(int i =0; i < 10; i++) {
        System.out.println(x[i]);
    }


    }
    
}
