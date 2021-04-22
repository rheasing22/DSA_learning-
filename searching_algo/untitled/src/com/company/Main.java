package com.company;

public class Main {

    public static void constructBTFromPrePost(String pre[], String post[], int size){
        String root = pre[0];
        String nextRoot = pre[1];
        int startPos = 0;
        int endPos = size-1;
        int pos = searchNextRootPos(post,startPos,endPos,nextRoot);
        // divide the pre and the post
        // in pre order and post remove the root already done
        //pre(1,size) and post is post(0,size-2)

        // cut off size of right post

        //left  = ConstructBTFromPrePost( , post


    }
    public static int searchNextRootPos(String post[],int startPos,int endPos,String ele){
        for(int i=startPos;i<=endPos;i++){
            if(

        }
    }




    public static void main(String[] args) {
	// write your code here
        String preorder[] ={"F","B","A","D","C","E","G","I","H"};
        String postorder[] ={"A","C","E","D","B","H","I","G","F"};
        int size = preorder.length;

        // function call
        constructBTFromPrePost(preorder,postorder,size);
    }
}
