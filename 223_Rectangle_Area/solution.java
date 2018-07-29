class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int widthLap = computeOverLapLength(A,C,E,G);
        int heightLap = computeOverLapLength(B,D,F,H);
        return (C-A)*(D-B)+(G-E)*(H-F)-widthLap*heightLap;
    }
    private int computeOverLapLength(int a1, int a2, int b1, int b2){
        int lap = Math.min(b2,a2) - Math.max(b1,a1);
        return (lap < 0)? 0 : lap;
    }
}