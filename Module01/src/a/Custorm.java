package a;

import java.nio.file.ClosedWatchServiceException;
import java.util.ArrayList;
import java.util.Date;

public class Custorm {
    public static void main(String[] args) {
        System.out.print("HelloWordAgain"+"\n");
        ArrayList list=new ArrayList();
        Date date = new Date();
        list.add(0,123);
        list.add(1,456);
        for (Object x:list){
            System.out.print(x+"\n");
        }

    }
}

