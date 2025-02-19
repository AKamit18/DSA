class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        

        int n = gas.length;

        // Check if a solution is even possible (total gas >= total cost)
        int totalGas = Arrays.stream(gas).sum();
        int totalCost = Arrays.stream(cost).sum();
        if (totalGas < totalCost) {
            return -1; // No solution possible
        }

        int start = 0; // Starting station
        int currentGas = 0; // Current fuel level

        for (int i = 0; i < n; i++) {
            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                // We can't reach the next station, so reset and try from the next station
                start = i + 1;
                currentGas = 0;
            }
        }

        return start;
    }
}