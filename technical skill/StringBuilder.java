public class StringBuilder {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String s = "";

        for (int i = 0; i < 10000; i++) {
            s = s + "Hello";
        }

        System.out.println("String time: "
                + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();

        for (int i = 0; i < 10000; i++) {
            sb.append("Hello");
        }

        System.out.println("StringBuilder time: "
                + (System.currentTimeMillis() - start) + " ms");
    }
}
