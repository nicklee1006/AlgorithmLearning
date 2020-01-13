package medium;

public class Q134GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        // already assume gas and cost are non-empty and have same length

        // start from index 0
        for (int startIndex = 0; startIndex < gas.length; startIndex++) {
            // remaining gas
            int remaining = gas[startIndex];

            // if can't get to next point, moving to next startIndex
            if ((remaining - cost[startIndex]) < 0) {
                continue;
            }

            // move until end
            boolean noNeedContinue = false;
            for (int current = startIndex; current < gas.length - 1; current++) {
                // check if can move to next
                if (remaining - cost[current] < 0) {
                    noNeedContinue = true;
                    break;
                }

                // move to next
                remaining = remaining - cost[current] + gas[current + 1];
            }

            // try move back to start
            if (remaining - cost[cost.length - 1] < 0) {
                noNeedContinue = true;
            }

            remaining = remaining - cost[cost.length - 1] + gas[0];

            if (!noNeedContinue) {
                // move from begin to start
                for (int i = 0; i < startIndex; i++) {

                    // check if can move to next
                    if (remaining - cost[i] < 0) {
                        return -1;
                    }

                    // move to next
                    remaining = remaining - cost[i] + gas[i + 1];
                }

                return startIndex;
            }
        }

        return -1;
    }
}
