import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        List<Cat> catList1 = new ArrayList<>();
        List<Cat> catList2 = new LinkedList<>();
        for(int i=0; i<1000000; i++){
            catList1.add(cat);
            catList2.add(cat);
        }


        //Добавление в середину

        for(int i=0; i<100; i++){
            catList1.add(500000,cat);
            System.out.println("arrayList добавление в середину "+LocalDateTime.now());
        }
        for(int i=0; i<100; i++){
            catList2.add(500000,cat);
            System.out.println("linkedList добавление в середину"+LocalDateTime.now());
        }


        //Добавление в начало

        for (int i=0; i<100; i++){
            catList1.add(0,cat);
            System.out.println("arrayList добавление в начало "+LocalDateTime.now());
        }
        for (int i=0; i<100; i++){
            catList2.add(0,cat);
            System.out.println("linkedList добавление в начало "+LocalDateTime.now());
        }


        //Добавление в конец

        for (int i=0; i<100; i++){
            catList1.add(1000200,cat);
            System.out.println("arrayList добавление в конец "+LocalDateTime.now());
        }
        for (int i=0; i<100; i++){
            catList2.add(1000200,cat);
            System.out.println("linkedList добавление в конец "+LocalDateTime.now());
        }


        //Считываение с get c середины

        for (int i=0; i<100; i++){
            catList1.get(500000);
            System.out.println("arrayList get с середины "+LocalDateTime.now());
        }
        for (int i=0; i<100; i++){
            catList2.get(500000);
            System.out.println("linkedList get c середины "+LocalDateTime.now());
        }


        //Считываеие с конца

        for (int i=0; i<100; i++){
            catList1.get(1000200);
            System.out.println("arrayList get с конца "+LocalDateTime.now());
        }
        for (int i=0; i<100; i++){
            catList2.get(1000200);
            System.out.println("linkedList get c конца "+LocalDateTime.now());
        }


        // Удаление с середины

        for (int i =0; i<100; i++){
            catList1.remove(500000);
            System.out.println("arrayList удаление с середины "+LocalDateTime.now());
        }
        for (int i=0; i<100; i++){
            catList2.remove(500000);
            System.out.println("linkedList удаление с середины "+LocalDateTime.now());
        }


        //Удаление с начало

        for (int i=0; i<100; i++){
            catList1.remove(0);
            System.out.println("arrayList удаление с начало "+LocalDateTime.now());
        }

        for (int i=0; i<100; i++){
            catList2.remove(0);
            System.out.println("linkedList удаление с начало "+LocalDateTime.now());
        }

    }
}
