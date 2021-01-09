package com.example.gnirtoselturf.graphs;

public class Stack {
    private final int size = 10;
    private int top;
    private int[] array;

    public Stack(){
        array = new int[size];
        top = -1;
    }
    //добавление элемента
    public void pushVertex(int vertex){
        array[++top] = vertex;
    }
    //удаление элемента
    public int pop(){
       return array[top--];
    }
    //чтобы получить элемент
    public int peek(){
        return array[top];
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }

}
