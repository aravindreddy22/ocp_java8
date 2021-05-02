package com.practise.newocp.chapter5.strings;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {
       String value= "apple";
       //
        String Yatin= "Participant Administrator,Portfolio Administrator,Hierarchy Administrator,MA Calculation Designer,Comp Calculation Designer,Flexdata Designer,Payroll Designer,MA Plan Designer,Comp Plan Designer,MA Report Designer,Comp Report Designer,MAData Administrator,Report Viewer,MA Signings Viewer,Test Group,Canada OptBlue Reports,Portfolio Administrator,Hierarchy Administrator,MA Calculation Designer,Comp Calculation Designer,Flexdata Designer,Payroll Designer,MA Plan Designer,Comp Plan Designer,MA Report Designer,Comp Report Designer,MAData Administrator,Report Viewer,MA Signings Viewer,Test Group,Canada OptBlue Reports";
        String manoj="Participant Administrator,Portfolio Administrator,Hierarchy Administrator,MA Calculation Designer,Comp Calculation Designer,Flexdata Designer,Payroll Designer,MA Plan Designer,Comp Plan Designer,MA Report Designer,Comp Report Designer,MAData Administrator,Report Viewer,MA Signings Viewer,Test Group,Canada OptBlue Reports,Portfolio Administrator,Hierarchy Administrator,MA Calculation Designer,Comp Calculation Designer,Flexdata Designer,Payroll Designer,MA Plan Designer,Comp Plan Designer,MA Report Designer,Comp Report Designer,MAData Administrator,Report Viewer,MA Signings Viewer,Test Group,Canada OptBlue Reports";
      String roles=Yatin;
        String[] rolearray= roles.split(",");

        Map<String, Integer> map= new HashMap<>();
        for(String tmprole:rolearray){
            if(map.size()!=0) {
                if (map.containsKey(tmprole)) {
                    int value1 = map.get(tmprole);
                    map.put(tmprole, value1 + 1);
                } else
                    map.put(tmprole, 1);
            }else
                map.put(tmprole,1);
            }

        System.out.println(map);
        }


    public static void method(Object value){
        System.out.println(value);
    }
}
