class InquiryI {
    public void run() {
        Kattio sc = new Kattio(System.in);

        int n = sc.getInt();
        long[] arr1 = new long[n]; // base presum values
        long[] arr2 = new long[n]; // base squared presum values

        long ans = 0L;

        arr1[0] = sc.getLong();
        arr2[0] = arr1[0] * arr1[0];

        for (int i = 1; i < n; i++) {
            arr1[i] = sc.getLong();
            arr2[i] = arr1[i] * arr1[i];
            arr1[i] = arr1[i] + arr1[i - 1];
            arr2[i] = arr2[i] + arr2[i - 1];
        }

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, arr2[i] * (arr1[n - 1] - (arr1[i])));
        }

        System.out.println(ans);

        sc.close();
    }

    public static void main(String[] args) {
        new InquiryI().run();
    }
}
