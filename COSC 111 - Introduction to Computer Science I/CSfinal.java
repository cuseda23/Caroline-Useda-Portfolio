public class CSfinal {
    //a has length equal to zero, no matter what x is; or
//a has length equal to 1, and the only element in a has value x; or
//a has length greater than 1 and the last element of the array is x times the rst element of
    //the array, and the elements from the second to the second-to-last (both included) form a
    //x-scaled palindrome.

    public static boolean scaledpalindrome(int [] a, int x) {
        if (a.length == 0) {
            return true;
        } else if (a.length == 1 && a[0] == x) {
            return true;
        } else if (a[a.length - 1] == x * a[0]) {
            int[] b = new int[a.length - 2];
            for (int i = 1; i <= a.length - 2; i++) {
                 int j=0;
                // idea was to run scaled palindrome on the values from a[1]-a[a.length-2]
                //thought of creating new array that contains only those values
                    b[j] = a[i];
                    j++;
                return scaledpalindrome([]b, x);
            }
        }
    }
    public static int findx(int []a) {
        for (int i = 0; i < 10000; i++) {
            if (scaledpalindrome([]a, i)){
                return i;
            }
            else{
                return 0;
            }
        }
    }
    public Bag symmetricDifference(Bag other) {
        Bag[] res = new Bag[2];
        res[0] = this.copy();
        res[1] = other.copy();
        distinctvalues(res);
        //then insert the value amount of times equal to difference
        for(int i=0; i<res.length; i++){
        int x = b.count(i);
        int y= other.count(i);
        int dif = Math.abs(x-y);
        for(int j=1;j<=dif;j++){
            res.insert(i);
            //idea is to insert into res
        }
        }
        return res;
    }
    //public Bag symmetricDifference(Bag other): Return a Bag object which contains the
    //symmetric dierence between this Bag and the Bag other. e symmetric dierence is the Bag
    //containing all the elements (potentially duplicated) that are in this Bag but are not in other and
    //all the elements that are in other but not in this Bag. For example, if this Bag contains the
    //elements 1,5,7,2,3,1,3 and other contains the elements 1,5,4,6,5, the symmetric dierence
    //would contain the elements 2,3,3,1,4,5,6,7. Notice how the symmetric dierence contains
    //two 3s because this Bag contains two 3s, while other contains none, but there is a single 1 in the
   // symmetric dierence because there are two 1s in this Bag and a single 1 in other (the opposite
//happens for 5). In other words, for each distinct value v that is either in this Bag or in other, the
    //symmetric dierence contains v duplicated a number of times equal to the (absolute) dierence
    //between the number of times v appears in this Bag and the number of times it appears in other
    //(use Math.abs(x - y) to obtain the absolute dierence between two numbers x and y).
    //Hint: start by computing the distinct values in a Bag containing all the values in the two Bags.
}
