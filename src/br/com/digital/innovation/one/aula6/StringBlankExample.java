// Atalhos do IntelliJ Idea   http://www.basef.com.br/index.php/Atalhos_do_IntelliJ_Idea

package br.com.digital.innovation.one.aula6;

import java.awt.*;

//public class StringBlankExample {
//    public static void main(String[] args) {
//        String space = "                                                    ";
////        System.out.println(space != null || space.length() == 0 || space.chars().allMatch(c -> c == ' ')); // Foi criado um método dessa linha usando o atalho Crtl+Alt+M, sobre o treco que qer criar
//        System.out.println(isBlank(space));
//    }
    public class StringBlankExample {
        public static void main(String[] args) {
            String space = "                                                    ";
            System.out.println(space.isBlank());
        }

//    private static boolean isBlank(String space) {
//        return space != null || space.length() == 0 || space.chars().allMatch(c -> c == ' ');
//    }

//    public boolean isCompletelyBlank(String space){
//        space.chars()
//                .filter( c -> c != ' ')
//    }
}
