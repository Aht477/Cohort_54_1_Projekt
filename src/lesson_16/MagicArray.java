package lesson_16;

public class MagicArray {
    int[] array;
    int cursor;
    public MagicArray() {
        array = new int[10];
    }
    // dobavlenie odnogo  novogo elementa
    void add(int value) {
        //proverka - est li svobodnoe mesto vo vnutrennem massive
        // esli mesta net, to nugno dobavit mesto
        if (cursor == array.length - 1) {
            //kursor ukasivaet na poslednuu jacheiku to nugno
            // rasschirit massiv pered dobavleniem novogo element
            // sozdaem novij metod expantArray raschirenie massiva
            expandArray();
        }
        array[cursor] = value;
        cursor++;

    }

    //dinamicheskoe raschirenie massiva
    void expandArray() {
        System.out.println("raschiraem massiv coursor:" + cursor);
        /*
        1. Sozdat massiv bolschego rasmera - v 2 rasa bolsche
        2. Perepisat v novij massiv vse snaCHENIJA DO kursora is starogo
        3. perebrosit ssilku
         */

        //1
        int[] newArray = new int[array.length * 2];

        //2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; //perepisivaj uvse znachenija so starogo massiva v novij

        }
            //3
            //perebrasivaem ssilku, peremennaja array budet hranit ssilku na novij massiv
            array = newArray;
            System.out.println("raschirenie massiva savershceno\n");


    }

    //s values mogno obrashatsa kak s ssilkoi na massiv int
    void addAll(int... values) {
        System.out.println("mi prinjali neskolko untov, a imenno:" + values.length);
        System.out.println("u kagdogo inta est index. pod index 0:" + values[0]);
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    // udalenie elementa po indeksu
    int remove(int index) {
        //1.proverit validnost indexa - ne otrizatelnij - menshe kursora
        //2.sapomnit kakoe znachenie nachodilos pod etim snacheniem
        //3. udalit znachenie is jacheiki
        //4. peredvinut vse elemetnti  na 1 vlevo
        //5. peredvinut kursor na 1 vlevo
        if (index < 0 || index >= cursor) {
            //index ne validnij nichego ne trogaem
            return Integer.MIN_VALUE; // Todo perepisat potom

        }

        //2 zapomnit znachenie
        int value = array[index];
        //3,4
        for (int i = index; i < cursor -1; i++) {
            array[i] = array[i + 1];

        }
        cursor--;
        return value;
    }


    // tekushee kolichestvo elementov v massive
    int size () {
        return cursor;
    }

    //vosvr strokovoe predstavlenie massiva
    //[100,200,500]
   public String toString() {
        /*
        otkrit skobku, perebrat kagdij elementi,
         dobavit zapjatuju (esli element ne poslednii), sakrit skobku
         */
       if (cursor == 0) return "[]";//esli kursor na znachenii 0, to pechataet tolko skobki

       String result = "[";
       for (int i = 0; i < cursor; i++) {
           result = result + array[i] +((i < cursor - 1)? "," : "]");

       }
       return result;
   }





    /*
    1. Dobavlat elementi
    2. Dinamicheskoe izmenenie massiva
    3. Vosvrashat strokovoe predstavlenie massiva
    4. Vosmognost dobavlat srasu neskolko elementov
    5. Tekushee kolichestvo elementov v massive
    6. Vosvrashaet znachenie po indeksu get(int index)
    7. Udalat element po indeksu(esli index est - udalit element - vernet udalennoe snachenie)
    8. popis elementa po znacheniju
    9. udalenie elementa po znacheniu (boolea nremuveByValue)
     */
}
