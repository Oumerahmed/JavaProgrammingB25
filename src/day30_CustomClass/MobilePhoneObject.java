package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MobilePhoneObject {
    public static void main(String[] args) {



        MobilePhone mobilePhone1= new MobilePhone();

        mobilePhone1.setInfo("Apple","iphone12","PacificBlue",512,2020,1499);

        System.out.println(mobilePhone1);

        System.out.println();

        MobilePhone mobilePhone2 = new MobilePhone();

        mobilePhone2.setInfo("Samsung","S20","Black",128,2018,1289);

        System.out.println(mobilePhone2);

        System.out.println();

        ArrayList<MobilePhone>mobilePhoneslist = new ArrayList<>();

        mobilePhoneslist.addAll(Arrays.asList(mobilePhone1,mobilePhone2));


        System.out.println(mobilePhoneslist);

        System.out.println();



    }

}
