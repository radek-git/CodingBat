public class CaptureTheRook {

    public static void main(String[] args) {

        System.out.println(captureTheRook("a8", "a1"));
    }

    public static boolean captureTheRook(String a, String b) {
        String a1 = a.substring(1);
        String a2 = a.substring(1, 2);
        String b1 = b.substring(1);
        String b2 = b.substring(1, 2);

        if (a1.equals(b1) || a2.equals(b2)) {
            return true;
        } else {
            return false;
        }
    }
}
