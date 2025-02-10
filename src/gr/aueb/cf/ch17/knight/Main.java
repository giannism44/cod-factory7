package gr.aueb.cf.ch17.knight;

public class Main {

    public static void main(String[] args) {
//        Knight joa = new Knight();
//        Knight saitGeorge = new Knight();


//        joa.embarkOnMission(new IMission() {
//            @Override
//            public void embark() {
//                System.out.println("Save the princess");
//            }
//        });

//        saitGeorge.embarkOnMission(new IMission() {
//            @Override
//            public void embark() {
//               // System.out.println("Kill the dragon");
//                killTheDragon();
//            }
//        });
//        saitGeorge.embarkOnMission(() -> killTheDragon());
//        saitGeorge.embarkOnMission(Main:: killTheDragon);
//        joa.embarkOnMission(Main::saveThePrincess);
    }

    public static void killTheDragon() {
        System.out.println("Kill the dragon");
    }

    public static void saveThePrincess() {
        System.out.println("Save the princess");
    }
}
