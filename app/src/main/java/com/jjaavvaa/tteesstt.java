package com.jjaavvaa;

import android.telephony.CellSignalStrength;

import java.util.Scanner;

public class tteesstt {
    public static void main(String[] args) {



      char a='a';
      if((a>=97&&a<=122)||(a>=65&&a<=90)){
          System.out.println("ok");
      }else {
          System.out.println("no");
      }












        /*
        System.out.println("");
        System.out.println("请输入");
        Scanner sa = new Scanner(System.in);
        int a = sa.nextInt();
        if (a > 80 && a < 100) {
            System.out.println("优秀");
        } else if (a > 70 && a < 80) {
            System.out.println("良好");
        } else if (a > 60 && a < 70) {
            System.out.println("及格");
        } else if (a > 0 && a < 60) {
            System.out.println("不及格");
        } else {
            System.out.println("错误");
        }
        System.out.println(a);
        sa.close();
*//*
        System.out.println("请输入");
        Scanner sa = new Scanner(System.in);
        int a = sa.nextInt();
        if (a % 3 == 0&&a % 5 == 0&&a % 7 == 0) {
            System.out.println("ok");
        }else {
            System.out.println("no");}
            sa.close();*/
/*
        Scanner sa = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sa.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "是闰年");
        } else if (year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");

        }
        sa.close();
*//*
        Scanner sa = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sa.nextInt();
        System.out.println("请输入月份");
        int month = sa.nextInt();
        switch (month) {
            case 1:            case 3:            case 5:            case 7:            case 8:            case 10:            case 12:
                System.out.println(31);
                break;
            case 4:            case 6:            case 9:            case 11:                System.out.println(30);
                break;
            //对于2月份需要判断是否为闰年
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(29);
                    break;
                } else {
                    System.out.println(28);
                    break;
                }

            default:
                System.out.println(0);
                break;
        }
         sa.close();

        Scanner sa = new Scanner(System.in);
        System.out.println("请输入语文成绩");
        int yw = sa.nextInt();
        System.out.println("请输入数学成绩");
        int math = sa.nextInt();
        if (yw > 80 && math > 80) {
            System.out.println("奖学金foofoo");
        }else if(yw <30 && math <30){
            System.out.println("重修呜呜呜");
        }else {
            System.out.println("过了");
        }
        sa.close();
*/
/*
        Scanner sa = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sa.nextInt();
        System.out.println("请输入第二个数");
        int b = sa.nextInt();
        System.out.println("请输入第三个数");
        int  c = sa.nextInt();
        if(a>1000||b>1000||c>1000){
            System.out.println("有大于一千的");
        }
        sa.close();
        */
    }
}
