public class RecursionPractice {


    public String displayString(String str, int n) {
        if (n <= 0) {
            return "";  // Base case: If n is 0 or less, return an empty string
        } else {
            return str + displayString(str, n - 1);  // Recursive call
        }
    }


    public String getMultiChar(char ch, int n) {
        if (n < 0) {
            return "";  // Base case: stop when n is less than 0
        } else {
            return ch + getMultiChar(ch, n - 1);  // Recursively add the character
        }
    }

    public long getPowerOfTen(int n) {

        if (n == 0) {
            return 1;
        } else {
            return 10 * getPowerOfTen(n - 1);
        }
    }


    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public int numberOfGloves(int peopleOfPlanetU101InARoom) {
        if (peopleOfPlanetU101InARoom == 0) {
            return 0;

        } else {
            return 3 + numberOfGloves(peopleOfPlanetU101InARoom - 1);
        }
    }

    public long getPowerOfTenLoop(int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {

            result *= 10;

        }
        return result;
    }

    public int numberOfGlovesLoop(int peopleOfPlanetU101InARoom) {
        int result = 0;
        for (int i = 0; i < peopleOfPlanetU101InARoom; i++) {
            result += 3;
        }
        return result;
    }


    public int getNumberOfZerosLoop(int n) {
        int count = 0;

        while (n != 0) {
            if (n % 10 == 0) {
                count++;
            }
            n /= 10;
        }

        return count;
    }


    public int getNumberOfZerosRecursion(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 10) {
            return 0;
        } else {
            int count = getNumberOfZerosRecursion(n / 10);
            if (n % 10 == 0)
                ++count;
            return count;
        }
    }
}