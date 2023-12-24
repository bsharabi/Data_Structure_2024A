package L01;

public class ArrayAd {


    public static void main(String[] args) {

        byte b = 4;
        // 1x,2x,3x...,8x
        //[0,0,0,0,0,1,0,0]


        byte[] bArr = new byte[]{1,2};
        // 1x,2x,3x...,8x         // 9x,10x,11x...,16x
        //[0,0,0,0,0,0,0,1 /-----/ 0,0,0,0,0,0,1,0]


        byte[] b1 = new byte[]{1,2};
        // 1x,2x,3x...,8x         // 9x,10x,11x...,16x
        //[0,0,0,0,0,0,0,1 /-----/ 0,0,0,0,0,0,1,0]
        //b1=000000-1x (Hex)

        byte[] b2 = new byte[]{3,4};
        // 100x,101x,102x...,107x         // 108x,109x,110x...,115x
        //[0,0,0,0,0,0,0,1 /-----/ 0,0,0,0,0,0,1,0]
        // b2=0000-100x (Hex)


        byte[][] bMatrix = new byte[][]{b1,b2};
        // 200x,201x,202x...,263x         // 264x,265x,266x...,327x
        //[0,0,0,0,0,0,0,0,0,0,0,0,...,0 /-----/ 0,0,0,0,0,0,0,0,0,0,0,0,...,0]
        // bMatrix=0000-200x (Hex)


        byte[][][] bMatrix3D = new byte[][][]{bMatrix};
        // 400x,401x,402x...,463x
        //[0,0,0,0,0,0,0,0,0,0,0,0,...,0]
        //bMatrix3D=0000-400x (Hex)


       byte[][] bTemp= bMatrix3D[0];
       byte[] bTemp1= bMatrix3D[0][0];
       byte bTemp11= bMatrix3D[0][0][0];
    }



}
