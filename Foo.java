public static int foo (int x, int y)
    {
   	if (y == 0)
     	    return x;
   	else
     	    return foo(y, x % y);
    }
// намира нок на x и y