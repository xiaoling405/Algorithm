package Inser;


public class Insert {
	public static void sort(Comparable[] a)
	{
		int N = a.length;
		int minFlag = 0;
		for(int i = 0; i < N; i++)
		{
			minFlag = i;
			for(int j = i + 1; j < N; j++)
			{
				if(less(a[j],a[minFlag]))
				{
					minFlag = j;
				}
			}
			exch(a,i,minFlag);
		}
	}
	
	private static boolean less(Comparable v,Comparable w)
	{
		return v.compareTo(w) < 0;
	}
	
	private static void exch(Comparable[] a ,int i,int j)
	{
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private static void show(Comparable[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	private static boolean isSort(Comparable[] a)
	{
		for(int i = 1 ; i < a.length ; i++)
		{
			if(less(a[i],a[i-1]))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Integer[] a = new Integer[10];
		for(int i = 0; i < 10; i++)
		{
			a[i] = (int) (Math.random() * 10 + 1);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		sort(a);
		assert isSort(a);
		show(a);
	}
}