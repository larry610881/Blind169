package leetcode;
/*
    https://leetcode.com/problems/flood-fill/
 */
public class _733_Flood_Fill {
    /*
        DFS
        time complexity :O(mn)
        space complexity :O(1)
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        int m = image.length;
        int n = image[0].length;
        fooldFill(image,sc,sr,n,m,image[sr][sc],color);
        return image;


    }
    private void fooldFill(int[][] image, int x, int y,int n,int m,
                           int newColor, int oldColor){
        if(x<0||x>=n||y<0||y<=m)return;
        if(image[y][x] !=oldColor)return;
        image[y][x] =newColor;
        fooldFill(image,x-1,y,n,m,oldColor,newColor);
        fooldFill(image,x+1,y,n,m,oldColor,newColor);
        fooldFill(image,x,y-1,n,m,oldColor,newColor);
        fooldFill(image,x,y+1,n,m,oldColor,newColor);

    }
}
