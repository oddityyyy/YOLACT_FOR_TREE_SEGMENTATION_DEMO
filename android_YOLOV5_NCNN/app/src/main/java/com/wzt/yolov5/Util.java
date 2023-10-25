package com.wzt.yolov5;

public class Util {

    public static float getAvrPointDepth(float[][] depthArray, int x, int y, float threshold){
        //初始化
        int size = 1;
        int length = 0;
        boolean flag = false;
        int count = 0;
        float AvrPointDepth = 0;
        int AvrPointX = 0;
        int AvrPointY = 0;
        //卷积循环
        while (!flag){
            for(int i=0; i<size; i++){
                for(int j=0; j<size; j++){
                    if(depthArray[x-length+j][y-length+i]>0&&depthArray[x-length+j][y-length+i]<threshold){
                        AvrPointDepth += depthArray[x-length+j][y-length+i];
                        AvrPointX += (x-length+i);
                        AvrPointY += (y-length+i);
                        count++;
                        flag = true;
                    }
                }
            }
            size += 2;
            length++;
        }
        //取平均
        AvrPointDepth = AvrPointDepth/count;
        AvrPointX = AvrPointX/count;
        AvrPointY = AvrPointY/count;

        return AvrPointDepth;
    }

    public static int getAvrPointX(float[][] depthArray, int x, int y, float threshold){
        //初始化
        int size = 1;
        int length = 0;
        boolean flag = false;
        int count = 0;
        float AvrPointDepth = 0;
        int AvrPointX = 0;
        int AvrPointY = 0;
        //卷积循环
        while (!flag){
            for(int i=0; i<size; i++){
                for(int j=0; j<size; j++){
                    if(depthArray[x-length+j][y-length+i]>0&&depthArray[x-length+j][y-length+i]<threshold){
                        AvrPointDepth += depthArray[x-length+j][y-length+i];
                        AvrPointX += (x-length+i);
                        AvrPointY += (y-length+i);
                        count++;
                        flag = true;
                    }
                }
            }
            size += 2;
            length++;
        }
        //取平均
        AvrPointDepth = AvrPointDepth/count;
        AvrPointX = AvrPointX/count;
        AvrPointY = AvrPointY/count;

        return AvrPointX;
    }

    public static int getAvrPointY(float[][] depthArray, int x, int y, float threshold){
        //初始化
        int size = 1;
        int length = 0;
        boolean flag = false;
        int count = 0;
        float AvrPointDepth = 0;
        int AvrPointX = 0;
        int AvrPointY = 0;
        //卷积循环
        while (!flag){
            for(int i=0; i<size; i++){
                for(int j=0; j<size; j++){
                    if(depthArray[x-length+j][y-length+i]>0&&depthArray[x-length+j][y-length+i]<threshold){
                        AvrPointDepth += depthArray[x-length+j][y-length+i];
                        AvrPointX += (x-length+i);
                        AvrPointY += (y-length+i);
                        count++;
                        flag = true;
                    }
                }
            }
            size += 2;
            length++;
        }
        //取平均
        AvrPointDepth = AvrPointDepth/count;
        AvrPointX = AvrPointX/count;
        AvrPointY = AvrPointY/count;

        return AvrPointY;
    }

    public static int getAvrPointYRepairDown(float[][] depthArray, int x, int y, float threshold, int offset){
        //初始化
        int size = 1;
        int length = 0;
        boolean flag = false;
        int count = 0;
        float AvrPointDepth = 0;
        int AvrPointX = 0;
        int AvrPointY = 0;
        //卷积循环
        try {
            while (!flag){
                for(int i=0; i<size; i++){
                    for(int j=0; j<size; j++){
                        if(depthArray[x-length+j][y-length+i]>0&&depthArray[x-length+j][y-length+i]<threshold){
                            AvrPointDepth += depthArray[x-length+j][y-length+i];
                            AvrPointX += (x-length+i);
                            AvrPointY += (y-length+i);
                            count++;
                            flag = true;
                        }
                    }
                }
                size += 2;
                length++;
            }

        //取平均
        AvrPointDepth = AvrPointDepth/count;
        AvrPointX = AvrPointX/count;
        AvrPointY = AvrPointY/count;

        return AvrPointY;

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            offset++;
            return getAvrPointYRepairDown(depthArray, x, y-offset, threshold, offset);
        }

    }

    public static float getAvrPointDepthRepairDown(float[][] depthArray, int x, int y, float threshold, int offset){
        //初始化
        int size = 1;
        int length = 0;
        boolean flag = false;
        int count = 0;
        float AvrPointDepth = 0;
        int AvrPointX = 0;
        int AvrPointY = 0;
        //卷积循环
        try {
            while (!flag){
                for(int i=0; i<size; i++){
                    for(int j=0; j<size; j++){
                        if(depthArray[x-length+j][y-length+i]>0&&depthArray[x-length+j][y-length+i]<threshold){
                            AvrPointDepth += depthArray[x-length+j][y-length+i];
                            AvrPointX += (x-length+i);
                            AvrPointY += (y-length+i);
                            count++;
                            flag = true;
                        }
                    }
                }
                size += 2;
                length++;
            }

            //取平均
            AvrPointDepth = AvrPointDepth/count;
            AvrPointX = AvrPointX/count;
            AvrPointY = AvrPointY/count;

            return AvrPointDepth;

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            offset++;
            return getAvrPointDepthRepairDown(depthArray, x, y-offset, threshold, offset);
        }

    }

    public static int getAvrPointYRepairUp(float[][] depthArray, int x, int y, float threshold, int offset){
        //初始化
        int size = 1;
        int length = 0;
        boolean flag = false;
        int count = 0;
        float AvrPointDepth = 0;
        int AvrPointX = 0;
        int AvrPointY = 0;
        //卷积循环
        try {
            while (!flag){
                for(int i=0; i<size; i++){
                    for(int j=0; j<size; j++){
                        if(depthArray[x-length+j][y-length+i]>0&&depthArray[x-length+j][y-length+i]<threshold){
                            AvrPointDepth += depthArray[x-length+j][y-length+i];
                            AvrPointX += (x-length+i);
                            AvrPointY += (y-length+i);
                            count++;
                            flag = true;
                        }
                    }
                }
                size += 2;
                length++;
            }

            //取平均
            AvrPointDepth = AvrPointDepth/count;
            AvrPointX = AvrPointX/count;
            AvrPointY = AvrPointY/count;

            return AvrPointY;

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            offset++;
            return getAvrPointYRepairUp(depthArray, x, y+offset, threshold, offset);
        }

    }

    public static float getAvrPointDepthRepairUp(float[][] depthArray, int x, int y, float threshold, int offset){
        //初始化
        int size = 1;
        int length = 0;
        boolean flag = false;
        int count = 0;
        float AvrPointDepth = 0;
        int AvrPointX = 0;
        int AvrPointY = 0;
        //卷积循环
        try {
            while (!flag){
                for(int i=0; i<size; i++){
                    for(int j=0; j<size; j++){
                        if(depthArray[x-length+j][y-length+i]>0&&depthArray[x-length+j][y-length+i]<threshold){
                            AvrPointDepth += depthArray[x-length+j][y-length+i];
                            AvrPointX += (x-length+i);
                            AvrPointY += (y-length+i);
                            count++;
                            flag = true;
                        }
                    }
                }
                size += 2;
                length++;
            }

            //取平均
            AvrPointDepth = AvrPointDepth/count;
            AvrPointX = AvrPointX/count;
            AvrPointY = AvrPointY/count;

            return AvrPointDepth;

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            offset++;
            return getAvrPointDepthRepairUp(depthArray, x, y+offset, threshold, offset);
        }

    }

    public static int getAvrPointXRepairRight(float[][] depthArray, int x, int y, float threshold, int offset){
        //初始化
        int size = 1;
        int length = 0;
        boolean flag = false;
        int count = 0;
        float AvrPointDepth = 0;
        int AvrPointX = 0;
        int AvrPointY = 0;
        //卷积循环
        try {
            while (!flag){
                for(int i=0; i<size; i++){
                    for(int j=0; j<size; j++){
                        if(depthArray[x-length+j][y-length+i]>0&&depthArray[x-length+j][y-length+i]<threshold){
                            AvrPointDepth += depthArray[x-length+j][y-length+i];
                            AvrPointX += (x-length+i);
                            AvrPointY += (y-length+i);
                            count++;
                            flag = true;
                        }
                    }
                }
                size += 2;
                length++;
            }

            //取平均
            AvrPointDepth = AvrPointDepth/count;
            AvrPointX = AvrPointX/count;
            AvrPointY = AvrPointY/count;

            return AvrPointX;

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            offset++;
            return getAvrPointXRepairRight(depthArray, x-offset, y, threshold, offset);
        }

    }

    public static float getAvrPointDepthRepairRight(float[][] depthArray, int x, int y, float threshold, int offset){
        //初始化
        int size = 1;
        int length = 0;
        boolean flag = false;
        int count = 0;
        float AvrPointDepth = 0;
        int AvrPointX = 0;
        int AvrPointY = 0;
        //卷积循环
        try {
            while (!flag){
                for(int i=0; i<size; i++){
                    for(int j=0; j<size; j++){
                        if(depthArray[x-length+j][y-length+i]>0&&depthArray[x-length+j][y-length+i]<threshold){
                            AvrPointDepth += depthArray[x-length+j][y-length+i];
                            AvrPointX += (x-length+i);
                            AvrPointY += (y-length+i);
                            count++;
                            flag = true;
                        }
                    }
                }
                size += 2;
                length++;
            }

            //取平均
            AvrPointDepth = AvrPointDepth/count;
            AvrPointX = AvrPointX/count;
            AvrPointY = AvrPointY/count;

            return AvrPointDepth;

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            offset++;
            return getAvrPointDepthRepairRight(depthArray, x-offset, y, threshold, offset);
        }

    }

    public static int getAvrPointXRepairLeft(float[][] depthArray, int x, int y, float threshold, int offset){
        //初始化
        int size = 1;
        int length = 0;
        boolean flag = false;
        int count = 0;
        float AvrPointDepth = 0;
        int AvrPointX = 0;
        int AvrPointY = 0;
        //卷积循环
        try {
            while (!flag){
                for(int i=0; i<size; i++){
                    for(int j=0; j<size; j++){
                        if(depthArray[x-length+j][y-length+i]>0&&depthArray[x-length+j][y-length+i]<threshold){
                            AvrPointDepth += depthArray[x-length+j][y-length+i];
                            AvrPointX += (x-length+i);
                            AvrPointY += (y-length+i);
                            count++;
                            flag = true;
                        }
                    }
                }
                size += 2;
                length++;
            }

            //取平均
            AvrPointDepth = AvrPointDepth/count;
            AvrPointX = AvrPointX/count;
            AvrPointY = AvrPointY/count;

            return AvrPointX;

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            offset++;
            return getAvrPointXRepairLeft(depthArray, x+offset, y, threshold, offset);
        }

    }

    public static float getAvrPointDepthRepairLeft(float[][] depthArray, int x, int y, float threshold, int offset){
        //初始化
        int size = 1;
        int length = 0;
        boolean flag = false;
        int count = 0;
        float AvrPointDepth = 0;
        int AvrPointX = 0;
        int AvrPointY = 0;
        //卷积循环
        try {
            while (!flag){
                for(int i=0; i<size; i++){
                    for(int j=0; j<size; j++){
                        if(depthArray[x-length+j][y-length+i]>0&&depthArray[x-length+j][y-length+i]<threshold){
                            AvrPointDepth += depthArray[x-length+j][y-length+i];
                            AvrPointX += (x-length+i);
                            AvrPointY += (y-length+i);
                            count++;
                            flag = true;
                        }
                    }
                }
                size += 2;
                length++;
            }

            //取平均
            AvrPointDepth = AvrPointDepth/count;
            AvrPointX = AvrPointX/count;
            AvrPointY = AvrPointY/count;

            return AvrPointDepth;

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            offset++;
            return getAvrPointDepthRepairLeft(depthArray, x+offset, y, threshold, offset);
        }

    }


}
