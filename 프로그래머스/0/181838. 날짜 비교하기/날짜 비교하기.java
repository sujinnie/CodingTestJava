// import java.time.LocalDate;
import java.util.*;

class Solution {
    public int solution(int[] date1, int[] date2) {   
        // Arrays.compare(java9 이상)
        // return 1:1>2 / 0:1=2 / -1:1<2
        return Arrays.compare(date1, date2) == -1 ? 1 : 0;
        
        // ㅠㅠ
//         int year1 = date1[0], mon1 = date1[1], day1 = date1[2];
//         int year2 = date2[0], mon2 = date2[1], day2 = date2[2];
        
//         if(year1 < year2) return 1;
//         else if(year1 > year2) return 0;
//         else {
//             if(mon1 < mon2) return 1;
//             else if(mon1 > mon2) return 0;
//             else {
//                 if(day1 < day2) return 1;
//                 else return 0;
//             }
//         }
        
        // LocalDate ..
//         LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
//         LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);

//         if (dateA.isBefore(dateB)) {
//             return 1;
//         } else {
//             return 0;
//         }
    }
}