public long get(int x) {
    // implement me
        long fact = 1;
        if (x < 0) {
            return -1;
        } else {
            for (int i = 1; i <= x; i++) {fact *= i;}
            return fact;
        }
}