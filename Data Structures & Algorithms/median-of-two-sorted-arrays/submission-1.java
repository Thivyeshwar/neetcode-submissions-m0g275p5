class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Double> list = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            list.add((double)nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            list.add((double)nums2[j]);
        }
        Collections.sort(list);
        if(list.size() % 2 != 0){
            return list.get(list.size()/2);
        }
       return (list.get(list.size()/2-1) + list.get(list.size()/2))/2.0;
    }
}
