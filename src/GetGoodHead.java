import a.Custorm;
import sun.misc.PostVMInitHook;
import sun.tracing.PrintStreamProviderFactory;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 刘汇洋
 * @date 2021/8/4 -17:25
 */
public class GetGoodHead {
    public static void main(String[] args) {
        System.out.print("just a test");
        String[] arr = new String[]{"zhagnsan", "lisi", "wangwu", "zhaoliu"};
        //模板的使用
        //fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\n");

        //itar***
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        System.out.println("\n");
        //iter***
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("\n");

        List<String> stringlist = new ArrayList<>();
        stringlist.add("A");
        stringlist.add("b");
        stringlist.add("c");
        //stringlist.for***
        for (String s : stringlist) {
            System.out.println(s);
        }
        //stringlist.fori
        for (int i = 0; i < stringlist.size(); i++) {
            System.out.println(stringlist.get(i));
        }
        //stringlist.forr
        for (int i = stringlist.size() - 1; i >= 0; i--) {
            System.out.println(stringlist);
        }
    }
    public void Method01(){
       List list=new ArrayList();
       list.add(123);
        //ifn
        if (list == null) {
            System.out.println("list为空");
        }
        //inn
        if (list != null) {
            System.out.println("list不为空");
        }
        //list.null
        if (list == null) {

        }
        //list.nn
        if (list != null) {

        }
    }
    //prsf
    private static final Custorm CUSTORM1=new Custorm();
    //psf
    public static final float FNUM=1.0f;
    //psfi
    public static final int NUM=1;
    //psfs
    public static final String STRINGVALUE="psf";

}
