public class substring {
    public static void main(String[] args) {
        String s1 = "xyz";
        String s2 = "xyz";
        String s3 = new String("XYZ");
        String s4 = new String("XYZ");
        System.out.println("s1==s2?: " + (s1 == s2));
        System.out.println("s1==s3?: " + (s1 == s3));
        System.out.println("s3==s4?: " + (s3 == s4));
        System.out.println("s1.equals(s2)?:" + s1.equals(s2));
        System.out.println("s1.equals(s3)?:" + s1.equalsIgnoreCase(s3));
        System.out.println("s3.equals(s4)?:" + s3.compareTo(s4));
        System.out.println("s2.equals(s3)?:" + s2.compareToIgnoreCase(s3));
    }


}
