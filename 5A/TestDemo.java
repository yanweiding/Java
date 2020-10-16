public class TestDemo{
    public static String print(int []array){
        if(array==null){
            return " ";
        }
        if(array.length==0){
            return"[]";
        }
        String ret="[";
        for(int i=0;i<array.length;i++) {
            ret = ret + array[i];
            if(i != array.length - 1) {
                ret = ret + ",";
            }
        }

                ret=ret+"] ";
        return ret;
        }

    public static void main(String[] args) {
        int []arr={1,2,3};
        System.out.println(print(arr));
    }
}