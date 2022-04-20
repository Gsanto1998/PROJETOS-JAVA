package list;

import java.util.ArrayList;
import java.util.List;

public class listEx {
    public static void main(String[] args) {
        List<listDes> users = new ArrayList<>();
        int i = 0;
        while (i < 3){
            listDes actual = new listDes();
            users.add(actual);
            i++;
        }

        System.out.println(users.get(2).primeiroNome +" "+ users.get(2).sobreNome);

    }
}
