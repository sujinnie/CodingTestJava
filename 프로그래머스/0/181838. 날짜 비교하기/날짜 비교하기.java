class Solution {
    public int solution(int[] date1, int[] date2) {
        int year1 = date1[0], mon1 = date1[1], day1 = date1[2];
        int year2 = date2[0], mon2 = date2[1], day2 = date2[2];
        
        if(year1 < year2) return 1;
        else if(year1 > year2) return 0;
        else {
            if(mon1 < mon2) return 1;
            else if(mon1 > mon2) return 0;
            else {
                if(day1 < day2) return 1;
                else return 0;
            }
        }
    }
}