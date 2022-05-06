package com.xuxiaolan.java.day1.java;


public class Test14 {
    private double x;
    private double A;
    private double n;
    private int jqd;


    public Test14(double x, double A, double n, int jqd){
        //jqd表示精确度，精确到小数点后几位
        this.jqd=jqd;
        this.x=x;
        this.A=A;
        this.n=n;
    }

    public double countv(){
        double v=x/A-1/n;   //初始化迭代初始值

        //由精确度位数计算误差范围
        //精确到小数点后jqd位，则误差不超过10E-(jqd+1)满足
        double jq=Math.pow(0.1, (jqd+1));
        // v=x/A-jq;

        double wc;  //记录迭代后结果与前迭代数的差
        //因为实际误差<wc<jq<精确度要求，所以，wc<jq时就可以

        do{
            //计算迭代结果
            double v_t=v-countyuan(v)/countdao(v);
            //更新迭代差(取绝对值)
            wc=Math.abs(v_t-v);
            
            //判断wc是否符合要求
            if(wc<jq){
                //符合则更新后退出
                v=v_t;
                break;
            }else{
                //不符合则继续
                v=v_t;
            }
        }while(wc>jq);

        //这个时候是精确度符合要求的v
        
        //把精确度外小数置0

        return ((int)(v*Math.pow(10, jqd)))/Math.pow(10, jqd);
    }

    //根据输入的参数计算函数值
    public double countyuan(double v){
        return A*v*(1+1/(Math.pow((1+v), n)-1))-x;
    }

    //根据输入的参数计算导函数的函数值
    public double countdao(double v){
        double out=0;
        out+=A*(1+1/(Math.pow((1+v), n)-1));
        double fenmu=Math.pow(Math.pow((1+v), n)-1, 2);
        out+=A*v*(-1*n*Math.pow((1+v), n-1))/fenmu;
        return out;
    }   

    public static void main(String[] args) {
        // System.out.println(Math.pow(0.1, 10));
        double x=3400;
        double n=36;
        double A=100000;

        Test14 test14 =new Test14(x,A,n, 11);//7

        double v= test14.countv();

        System.out.println(v);

        // v=0.011361431936300131;
        //代入A=100000,n=3,v算x,x=v*A/(1-1/(1+v)^n)
        double X=v*A*(1+1/(Math.pow((1+v), n)-1));
        System.out.println(X);

    }
}