package com.tang.deepfirst;

public class NormalFullV1 {

    public static  void main (String[] args){
        int count =0;
        int[] arr = new int[5];
        for(arr[1]=1;arr[1]<5;arr[1]++){
            for(arr[2]=1;arr[2]<5;arr[2]++){
                for(arr[3]=1;arr[3]<5;arr[3]++){
                    for(arr[4]=1;arr[4]<5;arr[4]++){
                        int[]  result = new int[5];
                        boolean flag = true;
                        for(int i=1;i<5;i++){
                            result[arr[i]]+=1;
                            if(result[arr[i]]>1){
                                flag = false;
                            }
                        }
                        if(flag){
                            System.out.println(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
                            count++;
                        }
                    }
                }

            }
        }
        System.out.println("total count:"+count);
    }
}
