class Innerprac2{
    public void spiral(int[][] m) {
        // int top = 0,  bottom= matrix.length-1;
        // int left= 0, right = matrix[0].length-1;

        for(int i=0;i<3;i++){
            System.out.println(m[0][i]);
        }
        for(int j=1;j<3;j++){
            System.out.println(m[j][2]);
        }
        for(int i=1;i>=0;i--){
            System.out.println(m[2][i]);
        }
        for(int j=0;j<2;j++){
            System.out.println(m[1][j]);
        }
    }
}

public class prac2 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        Innerprac2 x = new Innerprac2();
        x.spiral(a);


    }
}
