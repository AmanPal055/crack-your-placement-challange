class Solution
{
static boolean isPossible(Integer a[], int b[],
                                  int n, int k) 
{
    // Sort the array a[] in decreasing order.
    Arrays.sort(a, Collections.reverseOrder());
  
    Arrays.sort(b);

    for (int i = 0; i < n; i++)
    if (a[i] + b[i] < k)
        return false;

    return true;
}