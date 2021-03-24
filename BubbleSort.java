package Inser;

public class BubbleSort {
	    public static void main(String[] args) {

	        // 使用静态初始化声明数组
	        int[] a={8,5,4,3,7,2,9,6,1};

	        for(int i=0;i<a.length-1;i++){
	            for(int j=0;j<a.length-1-i;j++){
	                if(a[j]>a[j+1]){// 交换位置
	                    int t=a[j];
	                    a[j]=a[j+1];
	                    a[j+1]=t;
	                }
	            }
	            System.out.print("第" + (i+1) + "次排序的结果：");
	            for(int j=0;j<a.length;j++){	// 循环输出
	                System.out.print(a[j]+"\t") ;
	            }
	            System.out.println();
	        }

	        //循环遍历输出结果
	        System.out.println("排序之后的结果为：");
	        for(int i=0;i<a.length;i++){
	            System.out.print(a[i]+"\t");
	        }
	    }
	}

