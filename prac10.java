// public class prac10 {
//     public static void main(String[] args) {
//         // Rain Water Trapping

//         // int[] bar = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
//         int [] bar = {4,2,0,3,2,5};

//         int water = 0;
//         int lbar = 0;
//         int rbar = 0;
//         int rj = 0;
//         int li = 0;
//         int overflow = 0;

//         for (int i = 0; i < bar.length; i++) {
//             if (bar[i] > 0) {
//                 lbar = bar[i];
//                 li = i;
//                 break;
//             }

//         }

//         for (int i = li; i < bar.length; i++) {

//             for (int j = i + 1; j < bar.length; j++) {
//                 if (bar[j] >= lbar) {
//                     rbar = bar[j];
//                     rj = j;

//                     break;
//                 }
//                 if (j == bar.length - 1) {
//                     overflow = 1;
//                 }
//             }

//             if (overflow == 0) {
//                 for (int k = i + 1; k < rj; k++) {
//                     water += lbar - bar[k];
//                 }

//                 lbar = rbar;
//                 li = rj;
//             } else {
//                 break;
//             }

//         }

//         System.out.println("Water: "+water+" units");
//     }
// }


public class prac10 {
    public static void main(String[] args) {
        // Rain Water Trapping
        int[] bar = {4, 2, 0, 3, 2, 5};

        int water = 0;
        int lbar = 0;
        int rbar = 0;
        int rj = 0;
        int li = 0;

        // Find the first non-zero left bar
        for (int i = 0; i < bar.length; i++) {
            if (bar[i] > 0) {
                lbar = bar[i];
                li = i;
                break;
            }
        }

        while (li < bar.length - 1) {
            rbar = 0;
            rj = -1;

            // Find the next bar which is >= current left bar
            for (int j = li + 1; j < bar.length; j++) {
                if (bar[j] >= lbar) {
                    rbar = bar[j];
                    rj = j;
                    break;
                }
                // If no bar >= lbar, pick the highest bar ahead
                if (bar[j] > rbar) {
                    rbar = bar[j];
                    rj = j;
                }
            }

            if (rj == -1) break; // No right bar found

            int minHeight = Math.min(lbar, rbar);

            for (int k = li + 1; k < rj; k++) {
                water += Math.max(0, minHeight - bar[k]);
            }

            // Move to next section
            li = rj;
            lbar = rbar;
        }

        System.out.println("Water: " + water + " units");
    }
}
