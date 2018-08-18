import java.io.*;
class AndroidWorkday1 {
   public static void main(String args[]) throws Exception {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
       int i, n =  Integer.parseInt(br.readLine());
       String[] m = new String[n];
       for(i=0;i<n;i++)
       {
    	   m[i] = br.readLine();
       }
   for(i=0;i<n;i++)
	   for(int j=-1; (j=str.indexOf(m[i], j+1)) != -1;)
        System.out.print(j+" ");
   
   }   
}