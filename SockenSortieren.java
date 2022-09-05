import java.util.ArrayList;

public class SockenSortieren {



    public static <E> void sortiereSocken(E... x) {
        ArrayList<E> socks = new ArrayList<>();

        for(E y : x)
            socks.add( y);

        ArrayList<E> kind = new ArrayList<>();
        ArrayList<E> color = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();

        ArrayList<E> kindNew = new ArrayList<>();
        ArrayList<E> colorNew = new ArrayList<>();
        ArrayList<Integer> numberNew = new ArrayList<>();



        for(int i=0; i<socks.size(); i++)
            if(i % 3 == 0)
                kind.add(socks.get(i));
            else if((i-1)%3 == 0)
                color.add(socks.get(i));
            else
                number.add(Integer.parseInt(socks.get(i).toString()));


        for(int i=0; i < color.size(); i++) {
            if(!colorNew.contains(color.get(i))) {
                kindNew.add(kind.get(i));
                colorNew.add(color.get(i));
                numberNew.add(number.get(i));


            }

            else {
                numberNew.add(colorNew.indexOf(color.get(i)), number.get(colorNew.indexOf(color.get(i))) + numberNew.get(colorNew.indexOf(color.get(i))));
                numberNew.remove(colorNew.indexOf(color.get(i))+1);
            }
        }


        for(int i =0; i<kindNew.size(); i++)
            System.out.println("Art: " + kindNew.get(i) + ", Farbe: " + colorNew.get(i) + ", Anzahl: " + numberNew.get(i));

        boolean pair = true;

        for(int n : numberNew)
            if(n % 2 != 0)
                pair = false;



        if(!pair)
            System.out.println("Nicht alle Socken ergeben ein Paar!");
    }






}
