package Collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BeforeJava8 {
    public static void main(String[] args) {
        List<Staff> staff = Arrays.asList(
                new Staff("sai", 25, 324234),
                new Staff("kiran", 16, 89000),
                new Staff("purna", 34, 982304)
        );
        List<StaffPublic> result = staff.stream().map(temp -> {
            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if("sai".equals(temp.getName())){
                obj.setExtra("this field for sai only");
            }
            return obj;
        }).collect(Collectors.toList());
        System.out.println(result);
    }
}