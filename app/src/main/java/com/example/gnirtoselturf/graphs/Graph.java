package com.example.gnirtoselturf.graphs;

public class Graph {
    private final int mMaxVertex = 10;
    private int[][] mas;//матрица смежности
    private Vertex[] mVertexList;
    private int mCounterVertex;

    public Graph() {
        mVertexList = new Vertex[mMaxVertex];
        mas = new int[mMaxVertex][mMaxVertex];
        mCounterVertex = 0;
    }

    public void addVertex(char name){ mVertexList[mCounterVertex++] = new Vertex(name); }

    public void addEdge(int start,int end){
        
    }
}
