public class towerofhanoi
    {
        public void fun(String s,String h,String d,int n)
        {
            if(n==1)
            {
            System.out.println("move"+n+"form"+s+"to"+d);
            return;
            } 
            fun(s,d,h,n-1);
        }
        public static void main(String[] args)
        {
            Main m=new Main();
            int n=10;
            int c=0;
           m.fun("source","helper","dest",n);
        }
}