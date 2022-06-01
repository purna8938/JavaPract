package Collect;

public class CompareToExample {
    public static void main(String[] args) {
        String s1="saiss";
        String s2 = "kiran";
        String s3 = "purna";
        String s4 = "sathish";
        String s5 = "karansingh";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s2));
        System.out.println(s3.compareTo(s1));
        System.out.println(s4.compareTo(s5));
        StringBuffer st = new StringBuffer();
        st.append("saiakiran");
       /* st.append("kiran");
        st.append("purna");
        st.append("ponnam");

        st.append('s');
        st.append(45);*/

        System.out.println(st);
        CharSequence cs = "String";
        System.out.println(cs);
        st.append(cs,3,6);
        System.out.println(st);
        st.setLength(25);
    }
}
