package com.geek.stack;

public class ArrayStack {
    private String[] items;//数组
    private int count;//栈中元素个数
    private int n;//栈大小

    //初始化一个数组，申请一个大小为n的空间
    public ArrayStack(int n) {
        this.items = new String[n];
        this.count = n;
        this.n = n;
    }

    //入栈操作
    public boolean push(String item){
        //数组空间不够了，直接返回false
        if (count==n)return false;
        //返回索引为count的数组元素，并且栈中元素个数count加一
        items[count] = item;
        count++;
        return true;
    }

    //出栈操作
    public String pop(){
        //栈为空，则直接返回null
        if (count ==0)return null;
        //返回索引为count-1的数组元素，并且栈中元素个数count减一
        String tmp =  items[count-1];
        count--;
        return tmp;
    }
}
