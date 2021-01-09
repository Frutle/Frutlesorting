package com.example.gnirtoselturf.graphs;

public class Graph {
    private final int mMaxVertex = 10;
    private int[][] mas;//матрица смежности
    private Vertex[] mVertexList;
    private int mCurrentVertex;
    private final Stack mStack = new Stack();

    public Graph() {
        mVertexList = new Vertex[mMaxVertex];
        mas = new int[mMaxVertex][mMaxVertex];
        mCurrentVertex = 0;
    }

    public void addVertex(char name){ mVertexList[mCurrentVertex++] = new Vertex(name); }

    public void addEdge(int start,int end){
        mas[start][end] = 1;
        mas[end][start] = 1;
    }

    public int check(int c){
        for(int i =0; i < mCurrentVertex;i++){
            if((mas[c][i] == 1) && mVertexList[i].isVisited == false){
                return i;
            }
        }
        return  -1;
    }

    public void passInDeep(int index){
        mVertexList[index].isVisited = true;
        mStack.pushVertex(index);

        while (!mStack.isEmpty()){
           int neighbors = check(mStack.peek());
           if( neighbors == -1){
               neighbors = mStack.pop();
           } else {
               mVertexList[neighbors].isVisited = true;
               mStack.pushVertex(neighbors);
           }
        }
//сборс флажков
        for(int i=0; i < mCurrentVertex;i++){
            mVertexList[i].isVisited = false;
        }
    }
}
