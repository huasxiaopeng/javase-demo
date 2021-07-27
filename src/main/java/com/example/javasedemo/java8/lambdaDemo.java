package com.example.javasedemo.java8;

/**
 * @Description lambda 表达式
 * @Author lktbz
 * @Date 2021/07/27
 */
public class lambdaDemo {
    public static void main(String[] args) {
//        new lambdaDemo().simpleExample();
//        String s = new lambdaDemo().JLEExampleNoParameter();
//        System.out.println(s);
//        JLEExampleSingleParameter();
        System.out.println(JLEExampleMultipleParameters());
    }
    /**
     * 简单的写法
     */
    private void simpleExample(){
        int width=10;
        /**
         * 无参数的lambda 表达式
            这里理解就是一个匿名函数，实现的一个函数方法
         */
        Drawable dw=()->{
            System.out.println("drwaing :"+width);
        };
        /**
         * 调用
         */
        dw.draw();
    }
    private String JLEExampleNoParameter(){
        /**
         *  实现接口方法，正常写法
         */
        Sayable sayable = new Sayable() {
            @Override
            public String say() {
                return "nothing";
            }
        };
        sayable.say();
        /**
         * lambda 方式写法
         */
        Sayable sayable1=()->{
            return "lambda return";
        };
        /**
         *  两个调用都是写在一起，所以就返回了lambda 写法
         */
        return   sayable1.say();

    }
    /**
     * 带简单参数的传递
     */
  public static void JLEExampleSingleParameter(){
      /**
       * 实现业务逻辑细节
       *
       */
      Printable printable=(msg)->System.out.println(msg);
      /**
       *  调用方法细节
       */
      printable.print("lktbz");
  }
   public static int JLEExampleMultipleParameters(){
       Addable add =(aa,bb)->(aa+bb);
       return add.add(10,20);
   }
    public static void JLEExampleMultipleStatements(){
        /**
         *  正常写法
         */
        IAvarage iAvarage = new IAvarage() {
            @Override
            public double avg(int[] array) {
                int sum = 0;
                int arrsize = array.length;
                for (int i = 0; i < arrsize; i++) {
                    sum = sum + array[i];
                }
                System.out.println("求和为：" + sum);
                return (sum / arrsize);//求平均方式
            }
        };
        int[] array = {1,4,6,8,9};
        System.out.println(iAvarage.avg(array));
        /**
         * lambda 方式改写
         */
      IAvarage iAvarage1=  (withArray)->{
            double sum=0;
            int arraySize=withArray.length;
            for (int i = 0; i < withArray.length; i++) {
                sum=sum+withArray[i];
            }
            System.out.println("sum:"+sum);
           return sum/arraySize;
        };
        int[] withLambdaArray = {1,4,6,8,10};
        System.out.println(iAvarage1.avg(withLambdaArray));
    }
    /**
     * 数组方式
     */
    interface IAvarage{
        double avg(int[] array);
    }
    interface Addable{
        /**
         * 多参数
         * @param a
         * @param b
         * @return
         */
        int add(int a,int b);
    }
    interface Printable {
        /**
         *  我定义好接口标准，具体怎么实现函数细节，根据级自己的需要
         * @param msg
         */
        void print(String msg);
    }
    interface Sayable{
        public String say();
    }
    interface Drawable{
        public void draw();
    }
}
