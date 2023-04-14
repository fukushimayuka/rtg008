class CastTest{
    public static void main(String[] args){
        int int01 = 2147483647;
        long long01 = int01;
        System.out.println("拡大変換");
        System.out.println(long01);

        long long02 = 2147483647;
        int int02 = (int)long02;
        System.out.println("縮小変換");
        System.out.println(int02);

        long long03 = 2147483648L;
        int int03 = (int)long03;
        System.out.println("縮小変換でサイズに収まらない時、intの最大値より1大きい");
        System.out.println(int03);

        String str05 = "595";
        int int05 = Integer.parseInt(str05);
        System.out.println(int05);

        int int06 = 29;
        String str06 = Integer.valueOf(int06).toString();
        System.out.println(str06);

    }
}