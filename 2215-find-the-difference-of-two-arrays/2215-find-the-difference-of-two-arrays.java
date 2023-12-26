class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        HashSet<Integer> ans1=new HashSet<>();
        HashSet<Integer> ans2=new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            if(!set2.contains(nums1[i])){
                ans1.add(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(!set1.contains(nums2[i])){
                ans2.add(nums2[i]);
            }
        }
        return Arrays.asList(new ArrayList<>(ans1),new ArrayList<>(ans2));
    }
}