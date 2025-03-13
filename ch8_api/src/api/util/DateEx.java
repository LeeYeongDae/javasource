package api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
     public static void main(String[] args) {
          Date d = new Date();
          System.out.println(d);

          // yyyy(yy) - MM - dd - hh - mm - ss
          SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
          System.out.println(sdf.format(d));
     }
}
