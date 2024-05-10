

//User function Template for Java

class Solution
{
    public int find_median(int[] v)
    {
        Arrays.sort(v);
        int k=v.length/2;
        if(v.length%2==0){
            double k1= (v[k]+v[k-1])/2;
        return (int)Math.floor(k1);
        }
        else
        return v[v.length/2];
        // Code here
    }
}
