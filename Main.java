public class MarathonTest {
    public static void main(String[] args) {
        Marathon sivas = new Marathon();
        sivas.addRacer(341, "Kadir");
        sivas.addRacer(273, "Gökhan");
        sivas.addRacer(278, "Hakan");
        sivas.addRacer(329, "Suzan");
        sivas.addRacer(445, "Pınar");
        sivas.addRacer(402, "Mehmet");
        sivas.addRacer(388, "Ali");
        sivas.addRacer(270, "Emel");
        sivas.addRacer(243, "Fırat");
        sivas.addRacer(334, "James");
        sivas.addRacer(412, "Jale");
        sivas.addRacer(393, "Ersin");
        sivas.addRacer(299, "Deniz");
        sivas.addRacer(343, "Gözde");
        sivas.addRacer(317, "Anıl");
        sivas.addRacer(265, "Burak");

        int [] sureler = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};

        sivas.ilkUc();
        System.out.println("birinci:"+sivas.findFirst(sureler)+" "+ sivas.isimBul(sivas.findFirst(sureler)));
        System.out.println("ikinci:"+sivas.findSecond(sureler)+" "+ sivas.isimBul(sivas.findSecond(sureler)));
        System.out.println("üçüncü:"+sivas.findThird(sureler)+" "+ sivas.isimBul(sivas.findThird(sureler)));
        sivas.abc();
    }
}
