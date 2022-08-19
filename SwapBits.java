public class SwapBits {

    public static int swap(int x,int p1,int p2,int n)
    {
        int set1 = (x>>p1)&((1<<n)-1) ;
        int set2 = (x>>p2)&((1<<n)-1) ;

        int xorSet = set1^set2;
        xorSet = xorSet<<p1 | xorSet<<p2;
        int result = x^xorSet;

        return result;
    }
    public static void main(String[] args) {
        System.out.println(swap(47, 1, 5, 3));
    }
}
