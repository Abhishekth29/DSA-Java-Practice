class Twosum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 }; // If no pair is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Declare and fill array
        int[] nums = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Get result
        int[] result = twoSum(nums, target);

        // Output result
        if (result[0] == -1) {
            System.out.println("No two numbers add up to the target.");
        } else {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        }

        sc.close();
    }

}
